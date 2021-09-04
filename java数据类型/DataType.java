/**
 * 本节熟悉java的各种内置数据类型
 */

/*
	java标识符：数字，字母，下划线，$  不能以数字开头
	$符号可以开头，但是不建议
 */
public class DataType {
	// public static void main(String[] args) {
	// 	int max = Interger.MAX_VALUE;
	// 	System.out.println(max);

	// 	int min = Interger.MIN_VALUE;
	// 	//java中没有全局变量
	// 	//在类的内部，方法的外部的变量叫做属性或者成员变量
	// 	System.out.println(min);
	// }
	//
	
	/**
	 * 双精度浮点数
	 * @param args [description]
	 */
	public static void main(String[] args) {
		double a = 1.6;
		System.out.println("a = " + a);
		System.out.println("max = " + Double.MAX_VALUE);
		System.out.println("min = " + Double.MIN_VALUE);
	}

	/**
	 * String[] args说明
	 * @param args [description]
	 */
	public static void main2(String[] args) {  //String[] args 是记录运行时输入的命令行内容的，称为运行时命令行参数
		for(int i = 0;i < args.length;i++) {
			System.out.println(args[i]);
		}
	}

	/**
	 * long类型讲解
	 * @param args [description]
	 */
	public static void main1(String[] args) {
		long a = 10L;   //8字节，不建议写小写l
		long max = Long.MAX_VALUE;
		long min = Long.MIN_VALUE;
		System.out.println("最大值：" + max);
		System.out.println("最小值：" + min);
		System.out.println("a的值为：" + a);    //字符串拼接

		int b = 10;
		int c = 20;
		System.out.println(b + c);   //这是30
		System.out.println("b + c = " + (b + c));   //这是字符串拼接 b + c = 30
		System.out.println("b + c = " + b + c);   //字符串拼接 b + c = 1020
	}
}