package com.wy;

import java.io.File;

public class SearchFile {
    static int count=0;
    public static void main(String[] args) {
         searchFile(new File("D:/"), "python.exe");
        System.out.println(count);
    }
    private static void searchFile(File dir,String fileName){
        if(dir != null && dir.isDirectory()){
            File[] files = dir.listFiles();
            if(files != null){
                for(File file : files){
                    if(file.isFile()){
                        if(file.getName().contains(fileName)){
                            System.out.println("OK "+ file.getAbsolutePath());
                        }
                    }else{
                        searchFile(file,fileName);
                    }
                }
            }
        }else{
            System.out.println("路径错误");
        }
    }
}

