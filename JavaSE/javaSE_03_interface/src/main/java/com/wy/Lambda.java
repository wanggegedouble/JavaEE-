package com.wy;

@FunctionalInterface
interface Animal{
    void shout();
}
@FunctionalInterface
interface Calculate{
    int sum(int a,int b);
}
public class Lambda {
    public static void main(String[] args){
        animalShout(()-> System.out.println("无参，无返回值得函数式接口调用"));
        animalShout(()-> System.out.println("hello word!"));
        animalShout(()-> System.out.println(" "));
        showSum(10,20,(x,y)->x+y);
        showSum(19,20,(a,b)->a*b);
        showSum(10,10,(x,y)->x/y);
    }
    private static void animalShout(Animal animal){
        animal.shout();
    }

    private static void showSum(int x,int y,Calculate calculate){
        System.out.println(x+"+"+y+"的和为："+calculate.sum(x,y));
    }

}
