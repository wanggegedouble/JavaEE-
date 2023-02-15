package com.wy;

import java.io.*;

public class OUT {
    public static void main(String[] args) throws IOException {
        File outfile = new File("C:\\Users\\huawei\\Documents\\Java_project\\JavaEE_Study\\JavaSE\\JavaSE_05_IO\\hello.text");
        OutputStream fileOut = new FileOutputStream("C:\\Users\\huawei\\Documents\\Java_project\\JavaEE_Study\\JavaSE\\JavaSE_05_IO\\hello.text");
        fileOut.write('a');
        fileOut.write('b');
        byte[] buffer = "我是中国人".getBytes();
        fileOut.write(buffer);
        byte[] buffer1 = {'a','v'};
        fileOut.write(buffer1);
        fileOut.close();
    }

}
