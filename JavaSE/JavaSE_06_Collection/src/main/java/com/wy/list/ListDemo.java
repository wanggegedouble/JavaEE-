package com.wy.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(12);
        list.add(19);
        list.add(19);
        list.add(12);
        list.add(1955);
        list.add(19);
        list.add(12);
        list.add(144);

        list.forEach((l)->System.out.println(list));
       // list.forEach((s) -> System.out.println(s));

        /*Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            Integer integer = it.next();
            System.out.println(integer);
        }*/
    }
}
