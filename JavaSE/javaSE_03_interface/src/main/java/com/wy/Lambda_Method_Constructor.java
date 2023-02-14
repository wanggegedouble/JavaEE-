package com.wy;

@FunctionalInterface
interface CalcAble{
     int calc(int num);
}

class Math{
    public  int abs(int num){
        if(num<0){
            return -num;
        }else {
            return num;
        }
    }

}
public class Lambda_Method_Constructor {
    public static void main(String[] args) {
        Math math = new Math();
        printAbs(-10,math::abs);
        //lambda
       // printAbs(-10,(n)->Math.abs(n));
        //方法引用
        //printAbs(-12,Math::abs);
    }

    private static void printAbs(int num,CalcAble calcAble){
        System.out.println(calcAble.calc(num));
    }
}
