package com.wy.charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class CharReadDemo02 {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("JavaSE/JavaSE_05_IO/hello.text");
            char[] buffer = new char[1024];
            int len;
            while ((len = reader.read(buffer)) !=-1){
                System.out.print(new String(buffer,0,len));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
