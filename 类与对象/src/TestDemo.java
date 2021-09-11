
///**
// * 访问限定修饰符：public protected private
// */
//class Person {
//    //字段->成员变量 定义在方法外边 类的里边
//    //实例化成员变量：对象里面
//    //实例成员没有初始化，默认值为对应的0值。引用类型默认为null，简单类型默认为0
//    //char对应\u0000  boolean对应false
//    public String name;
//    public int age;            //实例成员变量
//    public char ch;
//    public boolean bool;
//
//    public static int size = 10;   //静态成员变量 - 不属于对象
//
//    Person() {
//        System.out.println("Person的默认构造函数调用");
//    }
//
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//        System.out.println("Person的有参构造函数调用");
//    }
//
//    public void showName() {
//        System.out.println("name:" + name);
//    }
//
//    public void showAge() {
//        System.out.println("age:" + age);
//    }
//
//    public static void func1() {
//        System.out.println("Person::func1()");
//        size = 11;
////        age = 100;  //静态方法不能访问非静态数据
//    }
//
//    public void show() {
//        System.out.println("我叫" + name + "，今年" + age + "岁。");
//    }
//
//}
//
//class People {
//    private String name;
//    private int age;
//    private String sex;
//
//    public String getName() {
//
//        return name;
//    }
//
//    public void setName(String name) {
//
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getSex() {
//
//        return sex;
//    }
//
//    public void setSex(String sex) {
//
//        this.sex = sex;
//    }
//
////    public void printData() {
////        System.out.println("姓名：" + this.name + " 性别：" + this.sex + " 年龄：" + this.age);
////    }
//
////    @Override
////    public String toString() {
////        return "People{" +
////                "name='" + name + '\'' +
////                ", age=" + age +
////                ", sex='" + sex + '\'' +
////                '}';
////    }
//}
//
//public class TestDemo {
//
//    public static void test2() {
//        People p1 = new People();
//        p1.setAge(20);
//        p1.setName("张三");
//        p1.setSex("男");
//        System.out.println(p1.toString());    //类名@哈希值
//    }
//
//    public static void test1() {
//        Person p1 = new Person();  //实例化一个对象->通过new操作符 p1是个引用，管理着堆上new出来的对象
//        Person p2 = new Person("李四", 20);
////        p1.age = 18;
////        p1.name = "张三";
////        System.out.println(p1.name);
////        p1.showAge();
////        p2.showName();
////        p2.showAge();
//        System.out.println(p1.ch);  //\u0000
//        System.out.println(p1.bool);//false
//        System.out.println(p1.name);
//        System.out.println(Person.size);   //静态成员变量 - 类名.静态成员变量
//        Person.func1();  //被static修饰直接用类名调用 - 在方法区中
//    }
//
//    public void test3() {
//
//    }
//
//    public static void test4() {
//
//    }
//
//    public static void main(String[] args) {
////        test1();
////        test2();
////        test3();  //静态成员函数只能调用静态数据，所以test3调用失败
//        test4();
//    }
//}

class Person {

    public Person() {
        //通过this指针调用方法 - 原理是this指针是当前对象的引用
        //只在构造方法里写 - 在构造方法里说明这个对象还没完成实例化构造但是分配了内存，才可以调用this去构造
        //只能调用一次 - 调用一次已经构造好了，不多调用
        //只能写在第一行
        //习惯使用this
//        System.out.println("Hello");   // err
        this("张三", 20);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //静态代码块和静态变量执行顺序和定义顺序有关，实例代码也一样
    static {
//        this.name = "张飞"   //err - 静态代码块不依赖于一个对象，所以不能对对象进行操作
        count = 20;
        System.out.println("静态代码块");  //一般用于初始化静态成员变量
    }

    private String name;
    private int age;
    public static int count = 0;

    {
         System.out.println("实例代码块/构造代码块");  //一般用于初始化实例成员变量
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TestDemo {

    public static void test1() {
        Person p1 = new Person();  //先对对象分配内存空间，之后调用对应的构造方法
        System.out.println(Person.count);

        System.out.println("-------------------------------------");
        Person p2 = new Person("张飞",50);  //这次不会使用静态代码块，静态代码块只会使用一次
        System.out.println(Person.count);
        System.out.println(p2);
    }

    public static void test2() {
        Person p1 = new Person();
        System.out.println(p1);

        String ret = new Person().toString();   //匿名对象，只能创建对象的时候使用
        System.out.println(ret);
    }

    public static void main(String[] args) {
//        test1();
        test2();
    }
}
