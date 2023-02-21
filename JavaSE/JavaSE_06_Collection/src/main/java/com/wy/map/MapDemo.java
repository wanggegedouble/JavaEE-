package com.wy.map;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.function.BiConsumer;

public class MapDemo {
    public static void main(String[] args) {
        /*Map<String,Integer> maps = new HashMap<>();
        maps.put("Wy",19);
        maps.put("hk",20);
        maps.put("k",20);
        maps.forEach(( key, value) ->System.out.println(key+"---->"+value));
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        System.out.println(entries);*/
        Runnable noArguments = () -> System.out.println("Hello World");
        ActionListener oneArgument = event -> System.out.println("button clicked");
       /* System.out.println(entries);
        System.out.println(maps.get("Wy"));
        Integer integer = maps.get("Wy");
        System.out.println(integer);
        System.out.println(maps);
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(13);
        Set<Integer> set1 = new LinkedHashSet<>();
        set.add(199);
        set.add(19);
        System.out.println(set);*/
    }
}
