package com.imooc.miaosha.util;

import org.springframework.util.DigestUtils;

public class MD5Util {
    private static final String salt = "1a2b3c4d";

    public static String md5(String src) {
        return DigestUtils.md5DigestAsHex(src.getBytes());
    }

    public static String inputPassToFormPass(String inputPass) {
        String str = "" + salt.charAt(0) + salt.charAt(2) + inputPass + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }

    public static String formPassToDBPass(String formPass, String salt) {
        String str = "" + salt.charAt(0) + salt.charAt(2) + formPass + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }

    public static String inputPassToDBPass(String inputPass, String saltDB) {
        String formPass = inputPassToFormPass(inputPass);
        return formPassToDBPass(formPass, saltDB);
    }

    // public static void main(String[] args) {
    //     System.out.println(inputPassToFormPass("123456"));
    //     System.out.println(inputPassToDBPass("123456","1a2b3c4d"));
    // }
}
