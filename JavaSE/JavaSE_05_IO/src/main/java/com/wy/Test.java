package com.wy;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        int count =0;
        File file = new File("D:/null/null/null");
        File[] files = file.listFiles();
        System.out.println(files != null);
        System.out.println(files.length);
        for (File file1 : files) {
            count++;
            System.out.println(file1);
        }
        System.out.println(count);
    }
}
