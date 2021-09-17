package com.xw.demo;

public class Dog extends Animal {  //继承抽象类，必须要重写
    public Dog(String name) {
        //错误 - 需要先有父类才能对子类进行构建赋值
//        this.name = name;
//        super(name);
        super(name);
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(name + "小狗在叫");
    }

    @Override
    public void sleep() {
        System.out.println(name + "小狗在睡觉");
    }
}
