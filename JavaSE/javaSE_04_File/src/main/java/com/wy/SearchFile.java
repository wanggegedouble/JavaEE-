package com.wy;

import java.io.File;

public class SearchFile {
    public static void main(String[] args) {
        String url = "D:d\\Qt\\Qt5.14.2\\MaintenanceTool.exe";
        seachFile(new File("D:\\"),"MaintenanceTool.exe");
    }
    public static void seachFile(File dir,String fileName){
        if(dir != null && dir.isDirectory()){
            File[] files = dir.listFiles();
            if(files != null && files.length>0){
                for (File file : files) {
                    if (file.isFile()){
                        if (file.getName().contains("MaintenanceTool.exe")){
                            System.out.println("ok  "+file.getAbsolutePath());
                        }
                    }else {
                        seachFile(file,"MaintenanceTool.exe");
                    }
                }
            }
        }else {
            System.out.println("对不起，没找到！");
        }
    }
}
