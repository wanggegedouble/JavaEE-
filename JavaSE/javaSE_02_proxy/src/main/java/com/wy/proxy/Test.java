package com.wy.proxy;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        Star wy = new Star("wy");
        Skill skill = StarAgentProxy.getProxy(wy);
        skill.jump();
        skill.sing();
    }
}
