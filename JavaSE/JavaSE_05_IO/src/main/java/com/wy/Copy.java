package com.wy;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        // source file
        try {
            OutputStream os = new FileOutputStream("JavaSE/JavaSE_05_IO/hello01.text");
            // dest file
            InputStream is = new FileInputStream("JavaSE/JavaSE_05_IO/hello.text");
            // write data
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
            os.close();
            is.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
