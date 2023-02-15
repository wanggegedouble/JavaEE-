package com.wy.charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharRead {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("JavaSE/JavaSE_05_IO/test.json");
            int len=0;
            while ((len = reader.read()) !=-1){
                System.out.print((char) len);
            }
            /*int read = reader.read();
            System.out.println((char) read);
            System.out.println((char) reader.read() );*/
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
