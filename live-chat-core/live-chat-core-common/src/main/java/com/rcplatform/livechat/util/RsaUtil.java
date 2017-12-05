package com.rcplatform.livechat.util;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yang peng on 2016/8/31.
 */
public class RsaUtil {


    /** */
    /**
     * 加密算法RSA
     */
    public static final String KEY_ALGORITHM = "RSA";

    /** */
    /**
     * 签名算法
     */
    public static final String SIGNATURE_ALGORITHM = "MD5withRSA";

    /** */
    /**
     * 获取公钥的key
     */
    private static final String PUBLIC_KEY = "RSAPublicKey";

    /** */
    /**
     * 获取私钥的key
     */
    private static final String PRIVATE_KEY = "RSAPrivateKey";

    /** */
    /**
     * RSA最大加密明文大小
     */
    private static final int MAX_ENCRYPT_BLOCK = 117;

    /** */
    /**
     * RSA最大解密密文大小
     */
    private static final int MAX_DECRYPT_BLOCK = 128;


    private static final String DEFAULT_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCp7BCCDU4wkozPFvau143NvdGGAqWbOuY/eeJy" +
            "X6g0o/rUtK3T2XaZEpKGNQTU/RlyQ31FeRASPEOXRJrLYju0gIpEMAhNbvpwlSDwA+T/28LxuNo9" +
            "19+g1YEho9ER9fzVukOrUHRp9shb8BN+WIekrxh2Zs0YSZEYXI5OocN1JwIDAQAB";

    private static final String DEFAULT_PRIVATE_KEY = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKnsEIINTjCSjM8W9q7Xjc290YYC" +
            "pZs65j954nJfqDSj+tS0rdPZdpkSkoY1BNT9GXJDfUV5EBI8Q5dEmstiO7SAikQwCE1u+nCVIPAD" +
            "5P/bwvG42j3X36DVgSGj0RH1/NW6Q6tQdGn2yFvwE35Yh6SvGHZmzRhJkRhcjk6hw3UnAgMBAAEC" +
            "gYBtHoGDYtQBcTsnihGkOhyAMROqQWzkALD3tmfrFu7Hzz429khisVXt+vVJZibSOC7tJ9X8lT/y" +
            "1ex56b6WOWEo+kqDECoq1DemXYIqTI8Wf2+iWn5w6Akg1mkwOHUnmXebAYz2MpIj+I34/N1cxJWT" +
            "Yg5E0Q8syysSktrUop2B0QJBAPyk8uusd4EHiojF2lLf3sPjN8uTvg51/I8e5E9KNhDw47nScjHA" +
            "vJav0r+MGTQ+s7/EFy5/SCTH3usejzzxYlMCQQCsLdce4Z1FqN4b+SD27VbTS7vDWReAKeBsnrX0" +
            "NCH9KeThVcqTA8jBfmOINDiqLVNVDEkhoJzgO9/Owx8RNK9dAkB3bXH3vjtvnyT5qq2d533ik5JY" +
            "haqeI2AUN8ItSSNttrGvsa+RnU6I3Ox+57cyX0GRMRzUOg7cdC8IbhW/9UtJAkAUU6EW4znG9IWs" +
            "NcAfhqt+bG1xRX5Rwh/dkusWNmVg1uZPd+pfas3zkfE8LjYWWR2CZ93mW2jJzCfC6CQtytN9AkAP" +
            "BOajQn5fBAiJEeXCAJrsCevr7DxQFtPVQwRtWmOWGf83AK7wlprPS7kSh5F5YTsc/7dENL+6yOoY" +
            "Uf6kpZlV";


    private static final String REQUEST_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIFtWC2Tk1ua4Uc3qzWeC4pn59A5" +
            "xFlY4Myk1FabfiSCBHtMkH4u3Pg7xu1Fphie68z90RvcNpVFu21Z8Ee8LWuD8tYzHWFwPf+ehyl7" +
            "3WjcWjFKiTsViddq/+WzpiCJRH/wqdfeNUUTFZ+x4CROg8TscVRkE2KQ1dQWjmgsTs1vAgMBAAEC" +
            "gYAZlBqRJ1FAEWPkR0Q23H07ZT2TEVeUsNP8nba5RxGu9WMdWwxTY7+X73ho/BLPWtkPMjpZXzQK" +
            "XDWmbtfl1XLEPOL6thdayFzrung8+mq/THxV7tV3MH+dsQf2JDSZulX9tgjOJsdOpGZavGwtAElH" +
            "j00wGGEkQ5BEq4eegAbOAQJBALiczKW1Igv8V1FML21DlTsBAb7yAGTw9DuznLo6aMqzXNtX4BoL" +
            "6ByrgsTCb91QO6Jyi5B7wYSSIL7VCkL0S2ECQQCzeZ9uX9mRAs1QePi9VNn4ZuUBzI43+Tg95EHG" +
            "xHcX6V5MsTub4/+Y3Y8xmsBfDR2YpXUR3jfNt3EDrSa73hrPAkBkt1aGiN08QLy6Y5/0Mky11gTH" +
            "0WsZpsL31zOH/dmxzEy6daSTUS+ehIthINq6mM0QAQHXH00iMD6hHcTtZi3BAkAiduOHxX45G4mj" +
            "v2c8rFOjINcvLkHNO91x/SgobEfWXqkOHyasO+80Qq+hve7dEd6yFmvRv5OFvIlGRHTgtLj/AkEA" +
            "owowCBMVifERUrpOrZtIPUKPmYZ/WsdEi1sCq+KGj6/9a5lan0J7mYdvhFmahdMYm1PIVuQEtF2g" +
            "6YWw+zvw5w==";


    private static final String REQUEST_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCBbVgtk5NbmuFHN6s1nguKZ+fQOcRZWODMpNRW" +
            "m34kggR7TJB+Ltz4O8btRaYYnuvM/dEb3DaVRbttWfBHvC1rg/LWMx1hcD3/nocpe91o3FoxSok7" +
            "FYnXav/ls6YgiUR/8KnX3jVFExWfseAkToPE7HFUZBNikNXUFo5oLE7NbwIDAQAB";


    public static final String RESPONSE_PRIVATE_KEY = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKWu0HB/CeX+Dy10VwWzH/QISjEZ" +
            "N/AfYp90y/+QHHCZr5h5K5VK5VBxzvgh7Wem6zHVU8QZ56K//V8Klk/6oVKl/A0OzyGpx3wl9D3g" +
            "nuKjAUe86FLgAOVASDa/OAqrQL0d5cWOmSIuHc5ZmVQpUPlbiGwdsJM/sBEm2RUhQl0ZAgMBAAEC" +
            "gYA8Dp4n6SThZbKCu4U/36pZfxfFrGqGdBn/ywqXXNmyR0NLdcDCoR92hYqMj1/LDsp6ieWPVASP" +
            "DiD97oyF+Ue4ZAZ+oIHzjcH1NceZD8d28YmhXnyg92Dtse0I4f5Hn7s/KM/unrc7grnOvzZXRpnx" +
            "FlmJfI1MhUaXDE+FNVbfcQJBAN64U1ym2/1lle7qlVpPY4MH7B2nVMy4ylGWYeCkZPKtetktMYBA" +
            "wHGmFUHS9CmHpgaLcc84w8jCTN154SuuA48CQQC+cKe7YCKs4iXBIxpJAntdLUSaUYHu4XX7d6ca" +
            "PjItngEByfSrLxs9FBd7StpHEZ2kRd6yZfQTc8bBZC/P3KDXAkAxWRQXbl1GCxEqi82l4ftBmCrH" +
            "80CFz9f8Nd7gAGzhnHCg2DOkoDRDujHxkMVKwmSWBKWl7YTr4alYVV3/6KGfAkA7+3u5NuR1E53U" +
            "oVvMFy4IARQUjwuf0/+3Ps6xI1nmqFek2plnuaSYrlVfDgqGS/QdI6yrABXKcrLtgsLUc6dtAkBr" +
            "OVTWS5R14/VMWf3GLCx15clKAfqMNmrje+4YwaetzW8au+pydzPhnejsInKaaDJkihznQzlKgCwC" +
            "cfCXw8xf";

    private static final String RESPONSE_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQClrtBwfwnl/g8tdFcFsx/0CEoxGTfwH2KfdMv/" +
            "kBxwma+YeSuVSuVQcc74Ie1npusx1VPEGeeiv/1fCpZP+qFSpfwNDs8hqcd8JfQ94J7iowFHvOhS" +
            "4ADlQEg2vzgKq0C9HeXFjpkiLh3OWZlUKVD5W4hsHbCTP7ARJtkVIUJdGQIDAQAB";

    private static final String ADD_GOLD_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAK4E3WcH1xMWBlZi9Vw1Ctw2ab7E" +
            "wsYALoUAOd9gvT0iwdbhxf1vH+LybISMDnTS+cAU8g4yeM6Jhys/g1qR9dLTDOI98tc8CKguZNOz" +
            "0hQTbp1sCnXDo9bthJiqQu/F+toJoAmRy5VXKZPk8Vw+jR4wgdx5Lcfvkzb9plhGAl8LAgMBAAEC" +
            "gYEArO+Gu4JOGdiUebskTPsljMzCb+QIEE9T67bazIPN7HijHBII+aA6lwYGE/8/ypdzvZDTMIq2" +
            "BcMkwjT/K73MBYuhGnBvtCl+Bj0YAYwaRIHDsidRsJidOmuY3skNT3BWrVpDC3eem+guSwy4Y63R" +
            "VwzsN2FZY+O/yWuW6pcKNaECQQD44ojPv++QGcmN7ytCK4lvtCHMDyLMbTZSTq1PyAycHITqXn+n" +
            "4P03iHmGZuXCqPi5sKIhoXza7AVgHqrMd6jbAkEAsv5shwU5cr/FA58Qoi/kZWUuFrI30sHX50yZ" +
            "BquMCLJ6thPsqkBM2y0Sq0kJELnAMYzWTvHYSwTzgWih8D6hkQJADegqmOEys6ydNI8era3dGh7I" +
            "nKxj12Rq2qKG0KRu//IgAzCQlYLe41F+6OGrCPuEGmwiQxrQ7TKvAjX0eURebQJAT949GOZY4v30" +
            "8A+7AVOzaxcBwLjXNeCu8RN5uMM1IfBZ1wL++FzmrmnnSay2MdNgkfuQ6Pr7E0ZrTVQd5jBcMQJA" +
            "Msh1CAk3qbJXmWWSCQvjiEfzGmaTUtP0q6iO06eciW+VmRFaepnHcDLDbiHO3wbhFQdBnniTjkXM" +
            "lIvcrMNXjA==";
    private static final String ADD_GOLD_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCuBN1nB9cTFgZWYvVcNQrcNmm+xMLGAC6FADnf" +
            "YL09IsHW4cX9bx/i8myEjA500vnAFPIOMnjOiYcrP4NakfXS0wziPfLXPAioLmTTs9IUE26dbAp1" +
            "w6PW7YSYqkLvxfraCaAJkcuVVymT5PFcPo0eMIHceS3H75M2/aZYRgJfCwIDAQAB";

    /** */
    /**
     * <p>
     * 生成密钥对(公钥和私钥)
     * </p>
     *
     * @return
     * @throws Exception
     */
    public static Map<String, Object> genKeyPair() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);
        keyPairGen.initialize(1024);
        KeyPair keyPair = keyPairGen.generateKeyPair();
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        Map<String, Object> keyMap = new HashMap<String, Object>(2);
        keyMap.put(PUBLIC_KEY, publicKey);
        keyMap.put(PRIVATE_KEY, privateKey);
        return keyMap;
    }

    /** */
    /**
     * <p>
     * 用私钥对信息生成数字签名
     * </p>
     *
     * @param data       已加密数据
     * @param privateKey 私钥(BASE64编码)
     * @return
     * @throws Exception
     */
    public static String sign(byte[] data, String privateKey) throws Exception {
        byte[] keyBytes = Base64Utils.decode(privateKey);
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        PrivateKey privateK = keyFactory.generatePrivate(pkcs8KeySpec);
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
        signature.initSign(privateK);
        signature.update(data);
        return Base64Utils.encode(signature.sign());
    }

    /** */
    /**
     * <p>
     * 校验数字签名
     * </p>
     *
     * @param data      已加密数据
     * @param publicKey 公钥(BASE64编码)
     * @param sign      数字签名
     * @return
     * @throws Exception
     */
    public static boolean verify(byte[] data, String publicKey, String sign)
            throws Exception {
        byte[] keyBytes = Base64Utils.decode(publicKey);
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        PublicKey publicK = keyFactory.generatePublic(keySpec);
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
        signature.initVerify(publicK);
        signature.update(data);
        return signature.verify(Base64Utils.decode(sign));
    }

    /** */
    /**
     * <P>
     * 私钥解密
     * </p>
     *
     * @param encryptedData 已加密数据
     * @param privateKey    私钥(BASE64编码)
     * @return
     * @throws Exception
     */
    public static byte[] decryptByPrivateKey(byte[] encryptedData, String privateKey)
            throws Exception {
        byte[] keyBytes = Base64Utils.decode(privateKey);
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key privateK = keyFactory.generatePrivate(pkcs8KeySpec);
//        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        cipher.init(Cipher.DECRYPT_MODE, privateK);
        int inputLen = encryptedData.length;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offSet = 0;
        byte[] cache;
        int i = 0;
        // 对数据分段解密
        while (inputLen - offSet > 0) {
            if (inputLen - offSet > MAX_DECRYPT_BLOCK) {
                cache = cipher.doFinal(encryptedData, offSet, MAX_DECRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(encryptedData, offSet, inputLen - offSet);
            }
            out.write(cache, 0, cache.length);
            i++;
            offSet = i * MAX_DECRYPT_BLOCK;
        }
        byte[] decryptedData = out.toByteArray();
        out.close();
        return decryptedData;
    }

    /** */
    /**
     * <p>
     * 公钥解密
     * </p>
     *
     * @param encryptedData 已加密数据
     * @param publicKey     公钥(BASE64编码)
     * @return
     * @throws Exception
     */
    public static byte[] decryptByPublicKey(byte[] encryptedData, String publicKey)
            throws Exception {
        byte[] keyBytes = Base64Utils.decode(publicKey);
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key publicK = keyFactory.generatePublic(x509KeySpec);
//        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE, publicK);
        int inputLen = encryptedData.length;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offSet = 0;
        byte[] cache;
        int i = 0;
        // 对数据分段解密
        while (inputLen - offSet > 0) {
            if (inputLen - offSet > MAX_DECRYPT_BLOCK) {
                cache = cipher.doFinal(encryptedData, offSet, MAX_DECRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(encryptedData, offSet, inputLen - offSet);
            }
            out.write(cache, 0, cache.length);
            i++;
            offSet = i * MAX_DECRYPT_BLOCK;
        }
        byte[] decryptedData = out.toByteArray();
        out.close();
        return decryptedData;
    }

    /** */
    /**
     * <p>
     * 公钥加密
     * </p>
     *
     * @param data      源数据
     * @param publicKey 公钥(BASE64编码)
     * @return
     * @throws Exception
     */
    public static byte[] encryptByPublicKey(byte[] data, String publicKey)
            throws Exception {
        byte[] keyBytes = Base64Utils.decode(publicKey);
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key publicK = keyFactory.generatePublic(x509KeySpec);
        // 对数据加密
//        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, publicK);
        int inputLen = data.length;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offSet = 0;
        byte[] cache;
        int i = 0;
        // 对数据分段加密
        while (inputLen - offSet > 0) {
            if (inputLen - offSet > MAX_ENCRYPT_BLOCK) {
                cache = cipher.doFinal(data, offSet, MAX_ENCRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(data, offSet, inputLen - offSet);
            }
            out.write(cache, 0, cache.length);
            i++;
            offSet = i * MAX_ENCRYPT_BLOCK;
        }
        byte[] encryptedData = out.toByteArray();
        out.close();
        return encryptedData;
    }

    /** */
    /**
     * <p>
     * 私钥加密
     * </p>
     *
     * @param data       源数据
     * @param privateKey 私钥(BASE64编码)
     * @return
     * @throws Exception
     */
    public static byte[] encryptByPrivateKey(byte[] data, String privateKey)
            throws Exception {
        byte[] keyBytes = Base64Utils.decode(privateKey);
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key privateK = keyFactory.generatePrivate(pkcs8KeySpec);
//        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, privateK);
        int inputLen = data.length;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offSet = 0;
        byte[] cache;
        int i = 0;
        // 对数据分段加密
        while (inputLen - offSet > 0) {
            if (inputLen - offSet > MAX_ENCRYPT_BLOCK) {
                cache = cipher.doFinal(data, offSet, MAX_ENCRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(data, offSet, inputLen - offSet);
            }
            out.write(cache, 0, cache.length);
            i++;
            offSet = i * MAX_ENCRYPT_BLOCK;
        }
        byte[] encryptedData = out.toByteArray();
        out.close();
        return encryptedData;
    }

    /** */
    /**
     * <p>
     * 获取私钥
     * </p>
     *
     * @param keyMap 密钥对
     * @return
     * @throws Exception
     */
    public static String getPrivateKey(Map<String, Object> keyMap)
            throws Exception {
        Key key = (Key) keyMap.get(PRIVATE_KEY);
        return Base64Utils.encode(key.getEncoded());
    }

    /** */
    /**
     * <p>
     * 获取公钥
     * </p>
     *
     * @param keyMap 密钥对
     * @return
     * @throws Exception
     */
    public static String getPublicKey(Map<String, Object> keyMap)
            throws Exception {
        Key key = (Key) keyMap.get(PUBLIC_KEY);
        return Base64Utils.encode(key.getEncoded());
    }


    /**
     * 解密
     *
     * @param str
     * @return
     * @throws Exception
     */
    public static String decrypt(String str) throws Exception {
        byte[] decode = Base64Utils.decode(str);
        byte[] bytes = decryptByPrivateKey(decode, DEFAULT_PRIVATE_KEY);
        return new String(bytes);
    }


    /**
     * 加密
     *
     * @param str
     * @return
     * @throws Exception
     */
    public static String encrypt(String str) throws Exception {
        byte[] bytes = str.getBytes();
        byte[] strBytes = encryptByPublicKey(bytes, DEFAULT_PUBLIC_KEY);
        return Base64Utils.encode(strBytes);
    }

    /**
     * 添加金币加密
     * @param str
     * @return
     * @throws Exception
     */
    public static String addGoldEncrypt(String str) throws Exception {
        byte[] bytes = str.getBytes();
        byte[] strBytes = encryptByPublicKey(bytes, ADD_GOLD_PUBLIC_KEY);
        return Base64Utils.encode(strBytes);
    }

    /**
     * 添加金币解密
     *
     * @param str
     * @return
     * @throws Exception
     */
    public static String addGoldDecrypt(String str) throws Exception {
        byte[] decode = Base64Utils.decode(str);
        byte[] bytes = decryptByPrivateKey(decode, ADD_GOLD_PRIVATE_KEY);
        return new String(bytes);
    }


    public static String encryptRequest(String str) throws Exception {
        byte[] bytes = str.getBytes();
        byte[] strBytes = encryptByPublicKey(bytes, REQUEST_PUBLIC_KEY);
        return Base64Utils.encode(strBytes);
    }


    public static String encryptResponse(String str) throws Exception {
        byte[] bytes = str.getBytes();
        byte[] strBytes = encryptByPublicKey(bytes, RESPONSE_PUBLIC_KEY);
        return Base64Utils.encode(strBytes);
    }


    public static String decryptRequest(String str) throws Exception {
        byte[] decode = Base64Utils.decode(str);
        byte[] bytes = decryptByPrivateKey(decode, REQUEST_PRIVATE_KEY);
        return new String(bytes);
    }

    public static String decryptResponse(String str) throws Exception{
        byte[] decode = Base64Utils.decode(str);
        byte[] bytes = decryptByPrivateKey(decode, RESPONSE_PRIVATE_KEY);
        return new String(bytes);
    }


   @Test
   public void createKeyPair() throws Exception {
       String str = addGoldEncrypt("药耀源;" + System.currentTimeMillis());
       System.out.println(str);
       System.out.println(addGoldDecrypt(str));
   }

    public static void main(String[] args) throws Exception {
//        Map<String, Object> stringObjectMap = genKeyPair();
//        String privateKey = getPrivateKey(stringObjectMap);
//        String publicKey = getPublicKey(stringObjectMap);
//        System.out.println(privateKey);
//        System.out.println(publicKey);
        String str = "{\"data\":\"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\",\"key\":\"ZuPk/wAGC0e6/AMNp/O54gxQxRi7DFGZyRwte4FOIbups1coglh1/prbJIWYTmS4Spxe93sdY1Sa\\nBYttPJeQmrThf+4RGwn7WPqen48KPL0Ta90h3jPpyJ7pk6JMob91kdyrkbs6BJlZMZLQBXdIVhQm\\nWTPr8sw3Iqu6sq8/a5Y=\"}";
        //String str = "{\"data\": \"Jy3ahUbWuJ1Gzbrb3cvAnMOgMWKqc7//bqQHTqDi9WyIxJSMJBzyLOHfKaSCl/KhBvL+8GO21hw6\\nTTEZfeX0rAhqqMJ+eM9SUl2Ccp45HSc7QHEb6ktiesvZCwuJcDOypbbeaNXn1sA/vDUigLj/fw0Q\\nZoJvJtK7Qv3wZCzjeyewEttLxl4wMwsLjUCNyLUOPgzrSeMc13Y=\",\"key\": \"NVpid72krhEsFWTBQqtmVSMNac7VHkD0lZf9fnWGs5f9cWbZgrBllAKnpFrH26fjMNLx0rSFH7dI\\n1xOD1lKTBDtKwb+TgK/3GsHE6N3fQbcAU6CHXHqy2siR4415znzbAzgAxWNbHUWJIP5m5fzOvcE3\\nXdD756q0j873wlAD7yE=\"}";
        JSONObject jsonObject = JSONObject.parseObject(str);
        String key = jsonObject.getString("key");
        byte[] decode = Base64Utils.decode(key);
        byte[] bytes = decryptByPrivateKey(decode, RESPONSE_PRIVATE_KEY);
        String data = DesUtil.decrypt(jsonObject.getString("data"), new String(bytes));
        System.out.println(new String(data));
//        String decrypt = decrypt("hvzFxk/jwrvElx3+ELAuPF/hIEOJ/1WlVfz8u2LyCS1rNqEB3jrKqP6HRIX4CphS/rAawf7wewIQ\n" +
//                "WMNog10UkDP4ciQC9okHOqe+cqIltyL6KP0Glb+qRfOBxbW4SXz/E/FIEYm4l5gJPqfDznIh3l3y\n" +
//                "2gLzFAjbS3z7X/jASOk=");
//        System.out.println(decrypt);
    }


}
