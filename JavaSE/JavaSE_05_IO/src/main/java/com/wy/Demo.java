package com.wy;

public class Demo {
    static int count=0;
    public static void main(String[] args) {
        test();
        System.out.println(count);
    }

    public static void test(){
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(j==5){
                    if(i==3){
                        return;
                    }
                    System.out.println("j==5");
                    count++;

                }
            }
        }
    }
}
