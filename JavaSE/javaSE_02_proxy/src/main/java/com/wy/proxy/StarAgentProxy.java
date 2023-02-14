package com.wy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarAgentProxy{

    public static Skill getProxy(Star star){
        return (Skill)Proxy.newProxyInstance(star.getClass().getClassLoader(), star.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(args);
                System.out.println("开始收钱！");
                //method 调用方法对象
                Object invoke = method.invoke(star, args);
                System.out.println("结束");
                return invoke;
            }
        });
    }
}
