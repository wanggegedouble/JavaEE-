package com.wy;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

public class ResourceUtil {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "wy.text";    //相对resource路径
        File file = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + path);
        String name = file.getName();
        System.out.println(name);
    }
}
