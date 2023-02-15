package com.wy;

import java.io.*;

public class IOdem001 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\huawei\\Documents\\Java_project\\JavaEE_Study\\JavaSE\\JavaSE_05_IO\\test.json");
        InputStream fileInputStream = new FileInputStream("C:\\Users\\huawei\\Documents\\Java_project\\JavaEE_Study\\JavaSE\\JavaSE_05_IO\\test.json");
        int len ;
        byte[] buffer = new byte[(int) file.length()];
        while ((len = fileInputStream.read(buffer)) != -1){
            System.out.print(new String(buffer,0,len));
        }
        fileInputStream.close();
    }
}
