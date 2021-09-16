import com.xw.demo.*;

public class TestDemo {

    public static void func(Animal animal) {
       //参数设置为父类引用，通过引用子类对象进行向上转移
       //向上转移后因为重写函数产生多态
       animal.move();
       animal.sleep();
    }

    public static void main(String[] args) {
        func(new Fish("Tom"));
        func(new Dog("Jack"));
    }
}
