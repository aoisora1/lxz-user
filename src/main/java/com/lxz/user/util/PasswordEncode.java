package com.lxz.user.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Description 密码编码
 * @Author aoi
 * @Date 2025/8/18
 */
public class PasswordEncode {

    public static String encode(String password) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            return md5ToString(md5.digest(password.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static String md5ToString(byte[] md5Bytes) {
        StringBuilder hexValue = new StringBuilder();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = md5Bytes[i] & 0Xff;
            if (val < 16){
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
}
