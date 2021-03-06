package com.aliwo.util;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * 加密工具
 *
 * @author xuyy19
 */
public class CryptographyUtil {


    /**
     * Md5加密
     *
     * @param str
     * @param salt
     * @return
     */
    public static String md5(String str, String salt) {
        return new Md5Hash(str, salt).toString();
    }

    public static void main(String[] args) {
        String password = "xu1230";
        System.out.println("Md5加密：" + CryptographyUtil.md5(password, "xu1230"));

        String username = "admin";
        String newpassword = "rootxu1230";
        String s = new SimpleHash("md5", newpassword, username, 3).toBase64();
        System.out.println("s:" + s);
    }
}
