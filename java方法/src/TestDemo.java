import java.util.Scanner;

public class TestDemo {
    public static int maxNum(int a, int b) {
        return a > b ? a : b;
    }

    public static double maxNum(double a, double b) {
        return a > b ? a : b;
    }

    public static int maxThreeNum(int a, int b, int c) {
        return maxNum(maxNum(a, b), c);
    }

    public static long fac(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }

    public static int digitSum(int n) {
        if (n / 10 == 0) {
            return n;
        } else {
            return n % 10 + digitSum(n / 10);
        }
    }

    public static long fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
//        int a = 32, b = 40, c = 15;
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        b = sc.nextInt();
//        System.out.println(maxThreeNum(a, b, c));
//        System.out.println(fac(5));
//        System.out.println(maxNum(12.5, 39.5));

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
//            System.out.println(digitSum(n));
            System.out.println(fib(n));
        }
    }
}