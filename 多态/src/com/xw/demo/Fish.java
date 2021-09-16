package com.xw.demo;

public class Fish extends Animal {
    //给定构造函数，并帮助父类的构造
    public Fish(String name) {
        //如果通过构造器没有对字段初始化，那么普通数值默认为0，布尔值为false，引用为null
        super(name);
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(name + "小鱼在游泳");
    }

    @Override
    public void sleep() {
        System.out.println(name + "小鱼在睡觉");
    }
}
