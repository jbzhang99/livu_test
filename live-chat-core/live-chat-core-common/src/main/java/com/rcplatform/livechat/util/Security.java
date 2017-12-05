
package com.rcplatform.livechat.util;

import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;


public class Security {

    static String base64PublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAl7H8KY+eZ9xlq3Gv5/7v4HA3vk5z8Gsxo3dHWQEf7apnppvBPer8yX5R2Ep/3imTvcrU5YsFyZLBxAtegxNYrUKX6/9MzU+jsX8Q0XTK1eNS2GqIuRN/c9M3uqip9IQ7AmQQsREbClnmeHWjkEwzFgix/2RtNb1dDfSRMyzyiDDpZmBAFX1wAslzDoxAbW1TEsspQ7kmdkMHFM7AcG8OnH2wFLZT4Wzcl1GfQtNhkE02GxKfn8Ohkd4jfIE+N2i3MHv5CS309WssVYVERa8xmVtby0Y0A7sONAC15qTmMrt8gWotQv7XrBqa+DFs0BLtR75Syti9xu7Y9G5lg1RZxQIDAQAB";

    public static void main(String[] args) throws Exception {
        String signature = null;//"MGelswyUpwIszUkELPETyRuPwiZG5VI95MNFlSChptZe8TPjDpeCiHLP9Lpi4VA184TSEynCjuPhTZoTEH7fWjL3ve5qJN6HD+1db68gJq+fPmLCE1uOH8g/zH8yltmVosXMbZA/5XILR0VaTScfZzftMMGwaWCG00/0uuXFOV+qYzOP5Fulr+UaRy3xIXa8EiVPortSqMPLTKdGKbQAVgqP7XjuhOiJlKD4Iqr7UQ6AkmCqhfjFMJ24nWhAcWJ4/PtMIIbgPj1QnILkHPMGiSeW4us59MYuRjW6Y3XTQLC0KUcfeTxqBGSMgfzH4VcW+M1b7r/0z2lnR3e/+zj4Rw==";
        String signedData = null;//"{\"packageName\":\"com.sweetjelly.wink\",\"productId\":\"wink_1month_29.99\",\"purchaseTime\":1465205202017,\"purchaseState\":0,\"developerPayload\":\"70a6fca1-3dc9-4c68-a445-3d5e08358c48\",\"purchaseToken\":\"jfoeoejpgopelekdhinmnila.AO-J1Oxg-kr3wbyxBpNRAes5pGqAgxW4gUwX5zJ_orQMSA2fCts7YEgBhQn5OVEbbJqlyXoljXiaew-AvhC3vN-3Ey0R3nE-dPttz-i72q0hlVp7bcpUyQ42ZGMvfdfOAITBu19z9rR6\",\"autoRenewing\":true}";


        signedData = "{\"developerPayload\":\"70a6fca1-3dc9-4c68-a445-3d5e08358c48\",\"autoRenewing\":false,\"packageName\":\"com.sweetjelly.wink\",\"purchaseToken\":\"jfoeoejpgopelekdhinmnila.AO-J1Oxg-kr3wbyxBpNRAes5pGqAgxW4gUwX5zJ_orQMSA2fCts7YEgBhQn5OVEbbJqlyXoljXiaew-AvhC3vN-3Ey0R3nE-dPttz-i72q0hlVp7bcpUyQ42ZGMvfdfOAITBu19z9rR6\",\"purchaseState\":0,\"purchaseTime\":1465205202017,\"productId\":\"wink_1month_29.99\"}";
        signature = "GpKn6xkc0ZArXLd5NTheTRPm8THvLZuNfAnahgS6boOO9lwrrKaKLttRFJCXvTmGn1LcpJqTUBVrSeIydb6Pe8Oc4TwJiBJeYCU0DQ/2D9ae2TB6NtFtwANxGq2nrY2UVWgV7g10sKpgXpKlKPaXQc+Zo8VRVLFLd/KR/fUuO0uX2Q6qtBHgVFCLvw39WUbbeChdR1w5vH9yDssI7dkTRITLdxx50sCO3e4SVEoC636JwnrF3c8xtCbvAeQtE3KWHqsK5t/i3fwvG4UNJlYD0J7YQru/qs88Q8xUyIK7MRN7FWh/M4N80rT6nELo7RK/XuSRDj5haNrUDazbSvGILw==";



        boolean ret = verifyPurchase(signedData, signature);


        System.out.println("ret====" + ret);
    }


    public static boolean verifyPurchase(String signedData, String signature) throws Exception {
        PublicKey key = generatePublicKey(base64PublicKey);
        return verify(key, signedData, signature);
    }

    public static PublicKey generatePublicKey(String encodedPublicKey) throws Exception {
        try {
//        	byte[] decodedKey = new sun.misc.BASE64Decoder().decodeBuffer(encodedPublicKey);

            byte[] decodedKey = Base64.decode(encodedPublicKey, Base64.DEFAULT);
            KeyFactory keyFactory = KeyFactory.getInstance(KEY_FACTORY_ALGORITHM);
            return keyFactory.generatePublic(new X509EncodedKeySpec(decodedKey));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static final String KEY_FACTORY_ALGORITHM = "RSA";
    private static final String SIGNATURE_ALGORITHM = "SHA1withRSA";

    public static boolean verify(PublicKey publicKey, String signedData, String signature) throws Exception {
        byte[] signatureBytes;
        try {
//            signatureBytes = new sun.misc.BASE64Decoder().decodeBuffer(signature);
            signatureBytes = Base64.decode(signature, Base64.DEFAULT);
        } catch (IllegalArgumentException e) {
            return false;
        }
        try {
            Signature sig = Signature.getInstance(SIGNATURE_ALGORITHM);
            sig.initVerify(publicKey);
            sig.update(signedData.getBytes());
            if (!sig.verify(signatureBytes)) {
                return false;
            }
            return true;
        } catch (NoSuchAlgorithmException e) {
        } catch (InvalidKeyException e) {
        } catch (SignatureException e) {
        }
        return false;
    }

}

