package com.rcplatform.livechat.tupuapi;

import java.io.*;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * Created by admin on 2017/2/17.
 */
public class SignatureAndVerifyUtil {

    private static String publickKeyString = "-----BEGIN PUBLIC KEY-----\nMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDyZneSY2eGnhKrArxaT6zswVH9\n/EKz+CLD+38kJigWj5UaRB6dDUK9BR6YIv0M9vVQZED2650tVhS3BeX04vEFhThn\nNrJguVPidufFpEh3AgdYDzOQxi06AN+CGzOXPaigTurBxZDIbdU+zmtr6a8bIBBj\nWQ4v2JR/BA6gVHV5TwIDAQAB\n-----END PUBLIC KEY-----";

    public SignatureAndVerifyUtil() {
    }

    public static PrivateKey readPrivateKey(String privateKeyPath) {
        File private_key_pem = new File(privateKeyPath);
        RSAPrivateKey privateKey = null;

        try {
            FileInputStream e = new FileInputStream(private_key_pem);
            String privateKeyStr = readKey(e);
            byte[] buffer = Base64Util.decode(privateKeyStr);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(buffer);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            privateKey = (RSAPrivateKey)keyFactory.generatePrivate(keySpec);
        } catch (Exception var8) {
            System.out.println(var8);
        }

        return privateKey;
    }

    public static String Signature(PrivateKey privateKey, String sign_string) {
        try {
            Signature e = Signature.getInstance("SHA256WithRSA");
            e.initSign(privateKey);
            e.update(sign_string.getBytes());
            byte[] signed = e.sign();
            return new String(Base64Util.encode(signed));
        } catch (Exception var4) {
            return "err";
        }
    }

    public static boolean Verify(String signature, String json) {
        try {
            ByteArrayInputStream e = new ByteArrayInputStream(publickKeyString.getBytes("UTF-8"));
            String publicKeyStr = readKey(e);
            byte[] buffer = Base64Util.decode(publicKeyStr);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(buffer);
            RSAPublicKey pubKey = (RSAPublicKey)keyFactory.generatePublic(keySpec);
            Signature signer = Signature.getInstance("SHA256WithRSA");
            signer.initVerify(pubKey);
            signer.update(json.getBytes("UTF-8"));
            return signer.verify(Base64Util.decode(signature));
        } catch (Exception var9) {
            return false;
        }
    }

    private static String readKey(InputStream in) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String readLine = null;
        StringBuilder sb = new StringBuilder();

        while((readLine = br.readLine()) != null) {
            if(readLine.charAt(0) != 45) {
                sb.append(readLine);
                sb.append('\r');
            }
        }

        return sb.toString();
    }
}
