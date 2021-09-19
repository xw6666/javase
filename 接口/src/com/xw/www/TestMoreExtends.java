package com.xw.www;

class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
}

interface IFly {
    void fly();
}

interface IRunning {
    void run();
}

interface ISwimming {
    void swim();
}

//先继承再实现 (first extends last implements) - 可以多实现
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}

class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}

class Frog extends Animal implements IRunning, ISwimming {
    public Frog(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在跳");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在游");
    }
}

class Robot implements IRunning {
    @Override
    public void run() {
        System.out.println("我是机器人，我在用腿跑");
    }
}

public class TestMoreExtends {

    public static void walk(IRunning irunning) {
        irunning.run();
    }

    public static void main(String[] args) {
        IRunning iRunning = new Robot();
        iRunning.run();
        walk(new Frog("青蛙"));
    }
}
