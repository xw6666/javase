import java.util.Arrays;

public class TestDemo {

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
        System.out.println();
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    //两倍复制数组并打印
    public static int[] twoPatse(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = 2 * arr[i];
        }
        //Array是操作数组的工具类
        System.out.println(Arrays.toString(ret));

        return ret;
    }

    //实现Array下的toString
    public static String myToString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += Integer.toString(arr[i]);
            if (i < arr.length - 1) {
//                ret += Integer.toString(arr[i]);
                ret += ", ";
            }
        }

        ret += "]";
        return ret;
    }

    public static void test1() {
        int[] array1 = {4, 51, 2, 4, 7, 8};
//        Arrays.sort(array1);
//        System.out.println(Arrays.toString(array1));

        //交换两个数
//        int[] arr = {5, 10};
//        System.out.println("交换前：" + Arrays.toString(arr));  //将数组以字符串输出
//        swap(arr);
//        System.out.println("交换后：" + Arrays.toString(arr));

        //打印数组自行实现
        Arrays.sort(array1);
        String ret = myToString(array1);
        System.out.println(ret);
    }

    public static void test2() {
        //数组拷贝
        int[] array = {1,2,3,4,5,6};
        //1.通过Arrays.copeOf
        int[] ret1 = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret1));

        //2.通过System.arraycope  底层由c/c++实现 - 很快
        int[] ret2 = new int[array.length];
        System.arraycopy(ret1,0,ret2,0,ret2.length);
        System.out.println(Arrays.toString(ret2));
        //3.通过clone
        int[] ret3 = array.clone();   //产生array的副本 这个方法是object的方法 object是所有类的父类
        array[1] = 1;
        System.out.println(Arrays.toString(ret3));
        //4.for循环
        int[] ret4 = new int[array.length];
        for(int i = 0;i < ret4.length;i++){
            ret4[i] = array[i];
        }
        System.out.println(Arrays.toString(ret4));
    }

    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void main3(String[] args) {
        int[] arr1 = {2, 4, 1, 6, 9, 3, 8, 7, 5};
//        String ret = Arrays.toString(arr);
//        System.out.println(ret);
//        int a = 0;
//        System.out.println(a);
//
//        int[] array = null;   //代表array引用的是个空对象
//        System.out.println(array);
        int[] arr2 = twoPatse(arr1);
        //排序并打印数组
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(myToString(arr2));

    }

    /**
     * 数组遍历与传参
     *
     * @param args
     */
    public static void main2(String[] args) {
        int[] arr = {1, 2};
        //java面向对象，直接调用属性得到长度
//        System.out.println(arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        //数组越界 - 报异常
//        System.out.println(arr[100]);

        //foreach - 左边是数组元素的类型
//        for (int val : arr) {
//            System.out.print(val + " ");
//        }
//        System.out.println();
        printArray(arr);
        swap(arr);
        printArray(arr);
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //调用Array对象中的toString
        System.out.println(Arrays.toString(nums));
    }

    /**
     * java的数组内存开辟在堆上，地址存储在栈上
     * 栈上的地址是拿不到的
     * 堆区给你的是假地址，经过哈希处理的
     *
     * @param args
     */
    public static void main1(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[]{11, 22, 33, 44};  //4个元素
        int[] arr3 = new int[4];   //没有赋值
        System.out.println(arr1);
    }
}
