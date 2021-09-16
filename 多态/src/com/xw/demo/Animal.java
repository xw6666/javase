package com.xw.demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//Animal父类
public abstract class Animal {
    //字段
    protected String name;

    //构造方法
    public Animal(String name) {
        this.name = name;
    }

    //方法
    public void move() {
        System.out.println(name + "动物在运动");
    }

    public void sleep() {
        System.out.println(name + "动物在睡觉");
    }
}
