package com.imooc.miaosha.util;

import com.mysql.cj.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorUtil {
    private static final Pattern mobile_pattern = Pattern.compile("1\\d{10}");

    public static boolean isMobile(String src) {
        if (StringUtils.isEmptyOrWhitespaceOnly(src)) {
            return false;
        }
        Matcher m = mobile_pattern.matcher(src);
        return m.matches();
    }

    // public static void main(String[] args) {
    //     System.out.println(isMobile("18801137620"));
    //     System.out.println(isMobile("1880113762"));
    // }
}
