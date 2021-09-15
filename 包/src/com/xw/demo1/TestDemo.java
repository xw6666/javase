package com.xw.demo1;

class Animal {
    //如果不加入访问修饰限定词 - 默认权限 - 包访问权限 - 只能在同一个包中进行访问
    protected String name;   //姓名

    public Animal(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + "动物在运动");
    }

    public void sleep() {
        System.out.println(name + "动物在睡觉");
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    //因为要先构造父类对象才能构造子类对象，所以当构造子类对象时，要让子类对象种的构造方法能够帮助父类构造
    //子类继承了父类除构造函数所有的东西
    public Cat(String name) {
        super(name);
    }
    //private修饰的方法能够被继承下来，但是被隐藏了，不能访问了
    //重写函数引发多态
    public void move() {
        System.out.println(name + "小猫在跑步");
    }

    public void sleep() {
        System.out.println(name + "小猫在睡觉");
    }

}

final class Bird extends Animal {    //一旦一个类被final所修饰，那么这个类必然不能被继承
    public Bird(String name) {
        super(name);
    }

    public void move() {
        System.out.println(name + "小鸟在歌唱");
    }

    public void sleep() {
        System.out.println(name + "小鸟在睡觉");
    }
}

//class RedBird extends Bird  //err - Bird被final修饰，不能被继承

public class TestDemo {
    public static void main(String[] args) {
//        Animal animal = new Animal("小明");
////        animal.name;    //name受保护
//        animal.move();
//        animal.sleep();
//
//        //继承
//        Cat cat = new Cat();
//        cat.setName("小猫");
//        cat.move();
//        cat.sleep();

        //多态
        //通过父类引用去调用子类对象
        Animal cat = new Cat("Tom");
        cat.move();
        cat.sleep();
        Animal bird = new Bird("Jack");
        bird.sleep();
        bird.move();

        TestDemo2 testDemo2 = new TestDemo2();
        System.out.println(testDemo2.a);   //包内能访问
    }
}
