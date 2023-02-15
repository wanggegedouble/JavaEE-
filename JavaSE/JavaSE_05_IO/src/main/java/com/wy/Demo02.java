package com.wy;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "abc我爱你";
        byte[] bytes = str.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes,"GBK"));
    }
}
