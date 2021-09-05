

public class HomeWork {
	/**
	 * 实现给定两个int值，交换变量的值
	 * @param args [description]
	 */
	public static void main1(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
	/**
	 * 给定三个变量，求其中最大值与最小值
	 * @param args [description]
	 */
	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		int c = 10;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		if(b > c) {
			int temp = b;
			b = c;
			c = temp;
		}

		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		System.out.println("max = " + c);
		System.out.println("min = " + a);
	}
}