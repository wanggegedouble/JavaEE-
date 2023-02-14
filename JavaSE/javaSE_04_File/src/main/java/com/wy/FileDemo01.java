package com.wy;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsoluteFile());
        }
    }
}
