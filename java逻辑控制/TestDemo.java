import java.util.Scanner;
import java.util.Random;
public class TestDemo {
	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(a);
		//nextline()和next()区别
		//next遇到空格会结束，nextline读一行
	}

	public static void main2(String[] args) {
		//if-else条件判断一定是bool表达式
		Scanner scanInt = new Scanner(System.in);
		while(scanInt.hasNextInt()) {
			int num = scanInt.nextInt();
			if(num > 0) {
				System.out.println("num为正数");
			} else if (num ==  0) {
				System.out.println("num为0");
			} else {
				System.out.println("num为负数");
			}
		}
	}

	/**
	 * 计算1到100的和
	 * @param args [description]
	 */
	public static void main3(String[] args) {
		int i = 1;
		int ret = 0;
		while(i <= 100) {
			ret += i;
			i++;
		}
		System.out.println(ret);
	}

	/**
	 * 计算n!
	 * @param args [description]
	 */
	public static void main4(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int ret = 1;
		for(int i = 1;i <= num;i++) {
			ret *= i;
		}
		System.out.println( num + "! = " + ret);
		scan.close();
	}

	/**
	 * 计算1!+2!+3!+4!+5!
	 * @param args [description]
	 */
	public static void main5(String[] args) {
		int sum = 0;
		int ret = 1;
		for(int i = 1;i <= 5;i++) {
			ret *= i;
			sum += ret;
		}
		System.out.println(sum);
	} 

	public static void main6(String[] args) {
		for(byte i = 0;i < 129;i++) {
			System.out.print(i);
		}
	}
	/**
	 * 输出乘法口诀表
	 * @param args [description]
	 */
	public static void main7(String[] args) {
		for(int i = 1;i <= 9;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(i + "*" + j + "=" + (i * j));
				System.out.printf("\t");
			}
			System.out.println();
		}
	}
	/**
	 * 判断素数
	 * @param args [description]
	 */
	public static void main8(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int num = sc.nextInt();
			if(num <= 1) {
				System.out.println(num + "不是素数！");
				continue;
			}
			//判断是否为素数
			int i = 0;
			for(i = 2;i <= (int)Math.sqrt(num);i++) {
				if(num % 2 == 0) {
					System.out.println(num + "不是素数！");
					break;
				}
			}
			if(i > Math.sqrt(num)) {
				System.out.println(num + "是素数！");
			}
		}
	}
	/**
	 * 模拟实现输入密码登录，输入三次提示退出程序
	 * @param args [description]
	 */
	public static void main(String[] args) {
		int sec = 3;
		Scanner sc = new Scanner(System.in);
		while(sec > 0) {
			sec--;
			System.out.println("请输入密码：");
			String input = sc.nextLine();
			if (input.equals("123456")) {
				System.out.println("密码正确，登入成功！");
				break;
			} else {
				System.out.println("密码错误，你还有" + sec + "次输入机会。");
			}
			
		}

		if(sec <= 0) {
			System.out.println("密码输入错误三次，退出程序");
		}
	}
}