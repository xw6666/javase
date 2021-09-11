class Calculator {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public int add() {
        return this.num1 + this.num2;
    }

    public int sub() {
        return this.num1 - this.num2;
    }

    public int mul() {
        return this.num2 * this.num1;
    }

    public int div() {
        return this.num1 / this.num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}

class Person {

//    {
//        System.out.println("实例化代码块。。。");  //这个在构造方法前面，所以先执行
//    }

    public Person() {
        this.name = "张三";
        this.age = 20;
//        System.out.println("Person类的默认构造方法调用");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person p) {
        this.name = p.getName();
        this.age = p.getAge();
    }

    private String name;
    private int age;

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

class MyValue {

    public MyValue(int num) {
        this.val = num;
    }

    private int val = 0;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}

public class ClassDemo {


    public static void test1() {
        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(5);
        System.out.println(calculator.add());
        System.out.println(calculator.sub());
        System.out.println(calculator.mul());
        System.out.println(calculator.div());
    }

    public static void test2() {
        Person p1 = new Person();
        Person p2 = new Person("李四", 30);
        Person p3 = new Person(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    public static void swap(MyValue val1, MyValue val2) {
        int temp = val1.getVal();
        val1.setVal(val2.getVal());
        val2.setVal(temp);
    }

    public static void test3() {
        //交换两个数的值

        //交换
        MyValue value1 = new MyValue(10);
        MyValue value2 = new MyValue(20);
        System.out.println("交换前：val1 = " + value1.getVal() + ", val2 = " + value2.getVal());
        swap(value1, value2);
        System.out.println("交换后：val1 = " + value1.getVal() + ", val2 = " + value2.getVal());
    }

    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }
}
