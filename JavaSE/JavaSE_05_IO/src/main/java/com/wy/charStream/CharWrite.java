package com.wy.charStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharWrite {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("JavaSE/JavaSE_05_IO/hello01.text");
        char[] str={'1','2','3'};
        char[] buffer = new char[1024];
        writer.write(buffer);
        writer.close();
    }
}
