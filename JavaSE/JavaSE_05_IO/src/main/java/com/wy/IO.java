package com.wy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\huawei\\Documents\\Java_project\\JavaEE_Study\\JavaSE\\JavaSE_05_IO\\test.json";
        File file = new File(path); //new File("C:\\Users\\huawei\\Documents\\Java_project\\JavaEE_Study\\JavaSE\\JavaSE_05_IO\\test.json")
        FileInputStream fileInputStream = new FileInputStream(file);
        int b;
        byte[] buffer = new byte[(int) file.length()];
        while((b = fileInputStream.read(buffer)) != -1){
            System.out.print(new String(buffer,0,b));
        }
    }

}
