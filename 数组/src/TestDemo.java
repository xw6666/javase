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

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        String ret = Arrays.toString(arr);
        System.out.println(ret);
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
