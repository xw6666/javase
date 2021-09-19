package com.xw.www;

/**
 * 接口(interface) - 比抽象类更进一步抽象
 * 1.接口当中的方法，都是抽象方法。
 * 2.其实可以有具体实现的方法。(JDK1.8加入的) - 用default修饰
 * 2.接口当中的成员变量默认是常量。
 * 4.接口当中的成员变量默认是 public static final
 * 5.接口当中的方法默认是 abstract
 * 6.接口不可以被实例化
 * 7.接口解决了java单继承的问题，可以实现多个接口
 * 8.只要这个类实现了该接口，那么就可以进行向上转型
 */

interface Shape {
//    public static final int a = 10;   //接口中的字段都是常量的
    void draw();    //省略public abstract
}

class Cycle implements Shape {

    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Shape cycle = new Cycle();
        cycle.draw();
    }
}
