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
        int[] array = {1, 2, 3, 4, 5, 6};
        //1.通过Arrays.copeOf
        int[] ret1 = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(ret1));

        //2.通过System.arraycopy  底层由c/c++实现 - 很快
        int[] ret2 = new int[array.length];
        System.arraycopy(ret1, 0, ret2, 0, ret2.length);
        System.out.println(Arrays.toString(ret2));
        //3.通过clone
        int[] ret3 = array.clone();   //产生array的副本 这个方法是object的方法 object是所有类的父类
        array[1] = 1;
        System.out.println(Arrays.toString(ret3));
        //4.for循环
        int[] ret4 = new int[array.length];
        for (int i = 0; i < ret4.length; i++) {
            ret4[i] = array[i];
        }
        System.out.println(Arrays.toString(ret4));
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = (arr[i] > max ? arr[i] : max);
        }

        return max;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = (arr[i] < min ? arr[i] : min);
        }
        return min;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void test3() {
        //找到数组最大值
        int[] arr = {2, 4, 1, 6, 9, 3, 8, 7, 5};
        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println("min = " + min + " max = " + max);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 4));
    }

    /**
     * 判断数组是否为升序
     * 是 返回true
     * 不是 返回false
     */
    public static boolean isUp(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 升序冒泡排序
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;  //true表示已经排序好
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //交换
                if (arr[j] > arr[j + 1]) {
                    //如果需要交换就还没有排序好
                    flag = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(flag == true) {
                break;
            }
        }
    }

    /**
     * Arrays常用方法
     */
    public static void test4() {
        //fill - 填充
        int[] arr1 = new int[10];
        Arrays.fill(arr1, 3, 7, 6);   //把arr数组[3,7)填充为6
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1, 6);   //把arr所有空间填为6
        arr1[1] = 3;
        System.out.println(myToString(arr1));
        System.out.println(isUp(arr1));
        bubbleSort(arr1);

    }

    /**
     * 二维数组
     */
    public static void test5() {
        //3种创建方式
        int[][] arr1 = {{1,2,3},{4,5,6}};
        int[][] arr2 = new int[][]{{2,3,4},{5,6,7,8}};   //java二维数组可以是不规则的，因为本质上是n个一维数组组成
        int[][] arr3 = new int[3][];       //列省略
        //数组遍历
        for(int i = 0;i < arr2.length;i++) {
            for(int j = 0;j < arr2[i].length;j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(arr1));
        for(int i = 0;i != arr2.length;i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }

        for (int[] i:arr2) {
            for(int j:i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//
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
