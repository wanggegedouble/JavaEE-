package com.wy;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class qucikStart {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\huawei\\Pictures\\Camera Roll\\hk.jpeg");
        System.out.println(file.getAbsoluteFile());
        long lastTime = file.lastModified();
        Date date = new Date(lastTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(format);
    }
}
