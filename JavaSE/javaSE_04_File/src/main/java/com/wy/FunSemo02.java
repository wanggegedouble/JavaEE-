package com.wy;

public class FunSemo02 {
    public static void main(String[] args) {
        System.out.println(f(10));
        System.out.println(f1(3));
        System.out.println(f2(1));

    }

    public static int f2(int n){
        if(n==10){
            return 1;
        }else {
            return 2*f2(n+1)+2;
        }
    }

    public static int f1(int n){
        if(n==1){
            return 1;
        }else {
            return f1(n-1)+n;
        }
    }

    public static long f(long n){
        if(n == 1){
            return 1;
        }else {
            return f(n-1)*n;
        }

    }
}
