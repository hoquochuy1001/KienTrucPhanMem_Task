package vn.edu.fit.hoquochuy_20053561_tuan6.util;

import java.util.Base64;

public class Decryptor {
    public static String decryptBase64ToJson(String base64EncodedData) {
        byte[] decodedBytes = Base64.getDecoder().decode(base64EncodedData);
        String decodedString = new String(decodedBytes);

        return decodedString;
    }
}
