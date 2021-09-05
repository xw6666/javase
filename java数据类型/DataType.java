/**
 * 本节熟悉java的各种基本内置数据类型
 * java当中8中基本数据类型：boolean byte short char int long float double
 * 包装类：                Boolean Byte Short Character Interger Long Float Double
 * 大小：                   无规定   1    2        2        4      8    4     8
 *
 * java中的数据类型分为两大类：
 * 1.基本数据类型
 * 2.引用数据类型 - 类 String 数组 抽象类 接口 枚举...
 */

/*
	java标识符：数字，字母，下划线，$  不能以数字开头
	$符号可以开头，但是不建议
 */

//对于小于4个字节的数据类型进行运算，都先统一提升为整型
//对于整型和long混合运算，统一提升为long

public class DataType {

	/**
	 * 常量：字面常量和final修饰的变量
	 * @param args [description]
	 */
	public static void main10(String[] args) {
		final int MAXNUM = 50;
		// MAXNUM = 20;  //err
	}

	/**
	 * java字符串类型
	 * @param args [description]
	 */
	public static void main9(String[] args) {
		String str = "\"Hello world!\"";
		System.out.println(str);

	}

	/**
	 * boolean类型 
	 * 1.java中 布尔类型没有明确大小
	 * 2.java中 布尔类型 只有两个取值 true 和 false
	 * 3.java中 没有所谓的0是假，非0是真 真只有true，假只有false
	 * @param args [description]
	 */
	public static void main8(String[] args) {
		boolean a = true;
		boolean b = false;
		System.out.println(a);
		System.out.println(b);
	}

	/**
	 * short - 短整型
	 * @param args [description]
	 */
	public static void main7(String[] args) {
		short sh = 50;
		System.out.println("short的最大值为" + Short.MAX_VALUE);
		System.out.println("short的最小值为" + Short.MIN_VALUE);
	}
	
	/**
	 * byte(字节)类型   范围：-128~127
	 * @param args [description]
	 */
	public static void main6(String[] args) {
		byte b1 = Byte.MAX_VALUE;   //在这里加1，先整型提升，之后要回到byte，会有精度损失，所以报错
		byte b2 = Byte.MIN_VALUE;
		System.out.println("byte的最大值为" + b1);   //如果这里的b1加1，会被整型提升为整型然后打印
		System.out.println("byte的最小值为" + b2);
		// byte d = 130;   java不允许超过范围
		System.out.println(Integer.MAX_VALUE + 1);    //默认整型打印，所以会从最大值溢出到最小值
		
	}

	/**
	 * char类型
	 * @param args [description]
	 */
	public static void main5(String[] args) {
		//java中的char占两个字节
		//使用unicode字符集，包含ascii码
		char ch = '你';
		System.out.println(ch);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
	}


	/**
	 * float介绍
	 * @param  args [description]
	 * @return      [description]
	 */
	public static void main4(String[] args) {
		float a = 1.56f;    //4个字节 - 如果后面不加f，默认还是double
		//尝试把double赋值给float
		// double b = 1.87;    - err，因为不会隐式转换
		// a = b;
		System.out.println("max = " + Float.MAX_VALUE);
		System.out.println("min = " + Float.MIN_VALUE);
	}

	/**
	 * 整数
	 * @param args [description]
	 */
	public static void main0(String[] args) {
		int max = Integer.MAX_VALUE;
		System.out.println(max);

		int min = Integer.MIN_VALUE;
		//java中没有全局变量
		//在类的内部，方法的外部的变量叫做属性或者成员变量
		System.out.println(min);
		// int a = Integer.MAX_VALUE + 1;   //这是可以的，因为整型提升只是到int，int加1以后变为负数最大值赋值给int没问题

	}
	
	
	/**
	 * 双精度浮点数
	 * @param args [description]
	 */
	public static void main3(String[] args) {
		double a = 1.6;
		System.out.println("a = " + a);
		System.out.println("max = " + Double.MAX_VALUE);
		System.out.println("min = " + Double.MIN_VALUE);
	}

	/**
	 * String[] args说明
	 * @param args [description]
	 */
	public static void main(String[] args) {  //String[] args 是记录运行时输入的命令行内容的，称为运行时命令行参数
		for(int i = 0;i < args.length;i++) {
			System.out.println(args[i]);
		}

		//将int转换成字符串
		int num = 10;

		String str1 = num + "";  //方法一：字符串拼接 后面加个空串
		String str2 = String.valueOf(num);   //方法二：使用String内valueOf函数
		System.out.println(str1);
		System.out.println(str2);
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