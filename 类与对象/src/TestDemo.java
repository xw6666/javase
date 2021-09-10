
/**
 * 访问限定修饰符：public protected private
 */
class Person {
    //字段->成员变量 定义在方法外边 类的里边
    //实例化成员变量：对象里面
    //实例成员没有初始化，默认值为对应的0值。引用类型默认为null，简单类型默认为0
    //char对应\u0000  boolean对应false
    public String name;
    public int age;            //实例成员变量
    public char ch;
    public boolean bool;

    public static int size = 10;   //静态成员变量 - 不属于对象

    Person() {
        System.out.println("Person的默认构造函数调用");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person的有参构造函数调用");
    }

    public void showName() {
        System.out.println("name:" + name);
    }

    public void showAge() {
        System.out.println("age:" + age);
    }

    public static void func1() {
        System.out.println("Person::func1()");
        size = 11;
//        age = 100;  //静态方法不能访问非静态数据
    }

    public void show() {
        System.out.println("我叫" + name + "，今年" + age + "岁。");
    }

}

public class TestDemo {

    public static void test2() {
        Person per = new Person("张三", 20);
        per.show();
    }

    public static void test1() {
        Person p1 = new Person();  //实例化一个对象->通过new操作符 p1是个引用，管理着堆上new出来的对象
        Person p2 = new Person("李四", 20);
//        p1.age = 18;
//        p1.name = "张三";
//        System.out.println(p1.name);
//        p1.showAge();
//        p2.showName();
//        p2.showAge();
        System.out.println(p1.ch);  //\u0000
        System.out.println(p1.bool);//false
        System.out.println(p1.name);
        System.out.println(Person.size);   //静态成员变量 - 类名.静态成员变量
        Person.func1();  //被static修饰直接用类名调用 - 在方法区中
    }

    public void test3() {

    }


    public static void main(String[] args) {
//        test1();

//        test3();  //静态成员函数只能调用静态数据，所以test3调用失败
    }
}
