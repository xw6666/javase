package com.xw.www;

interface IStudy {
    void study();   //省略public abstract
}

interface IWorking {
    void work();
}

interface IExercising {
    void exercise();
}

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Person的构造方法调用");
    }

}

class Student extends Person implements IStudy, IExercising {
    public Student(String name) {
        super(name);   //只要父类有了姓名，继承下来，子类便有了姓名 - super必须放在第一句

        System.out.println("Student的构造方法调用");
    }

    @Override
    public void study() {
        System.out.println(name + "在学习");
    }

    @Override
    public void exercise() {
        System.out.println(name + "在锻炼");
    }
}

class Worker extends Person implements IWorking, IExercising {

    public Worker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "在打工");
    }

    @Override
    public void exercise() {
        System.out.println(name + "在锻炼");
    }
}

public class TestPerson {

    //接口调用函数
    public static void work(IWorking iw) {
        iw.work();
    }

    public static void study(IStudy is) {
        is.study();
    }

    public static void exercise(IExercising ie) {
        ie.exercise();
    }

    public static void main(String[] args) {
//        IWorking iw = new Student("张三");   //Student没有实现这个接口，所以不能yong
//        IWorking iw = new Worker("张三");
//        iw.work();
//        work(iw);

        Student student = new Student("李四");
        student.study();
    }

}
