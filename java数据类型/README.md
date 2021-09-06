# java基本数据类型介绍

[TOC]

## 介绍

java基本数据类型有：<mark>**byte  short  char  int  long  float  double  boolean**</mark>

---

## byte类型

在java中，有和C/C++没有的byte类型，这个类型占1个字节，是一个有符号数，所以范围为 -2^7 ~ 2^7-1。

``` java
public static void main6(String[] args) {
		byte b1 = Byte.MAX_VALUE;   //在这里加1，先整型提升，之后要回到byte，会有精度损失，所以报错
		byte b2 = Byte.MIN_VALUE;
		System.out.println("byte的最大值为" + b1);   //如果这里的b1加1，会被整型提升为整型然后打印
		System.out.println("byte的最小值为" + b2);
		// byte d = 130;   java不允许超过范围赋值
		System.out.println(Integer.MAX_VALUE + 1);    //默认整型打印，所以会从最大值溢出到最小值
}
```

输出结果：

![image-20210906105040260](C:\Users\晓伍\AppData\Roaming\Typora\typora-user-images\image-20210906105040260.png)

***

## short类型

short类型在java中占2个字节，它的包装类为<mark>Short</mark>，所以取值范围为 -2^15~2^15 -1。

```java
	public static void main(String[] args) {
		short sh = 50;
		System.out.println("short的最大值为" + Short.MAX_VALUE);
		System.out.println("short的最小值为" + Short.MIN_VALUE);
	}
```



运行结果：
![image-20210906105403599](C:\Users\晓伍\AppData\Roaming\Typora\typora-user-images\image-20210906105403599.png)

***

## char类型

java的char类型和C/C++的有很大的不同，它占了<mark>两个字节</mark>，使用Unicode字符集，这个字符集包括了ASCii，所以我们可以直接把汉字当做一个字符了。包装类为<mark>Character</mark>。

```java
	public static void main5(String[] args) {
		//java中的char占两个字节
		//使用unicode字符集，包含ascii码
		char ch = '你';
		System.out.println(ch);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
	}
```

运行结果：

![image-20210906105700258](C:\Users\晓伍\AppData\Roaming\Typora\typora-user-images\image-20210906105700258.png)

因为打印以字符输出，所以输出了很奇怪的东西。

***

## int类型

java中的int类型不论在那种字长的机器上都只占<mark>四个字节</mark>，这和C/C++不同，而且，需要注意的是，如果是小于四个字节的数据类型在进行运算时，都会被整形提升至int类型。int类型的包装类为<mark>Integer</mark>。

```java
	public static void main(String[] args) {
		int a = 10;
		System.out.println("int类型的最大值为：" + Integer.MAX_VALUE);  //2^31-1
		System.out.println("int类型的最小值为：" + Integer.MIN_VALUE);  //-2^31
	}
```

运行结果：

![image-20210906113723822](C:\Users\晓伍\AppData\Roaming\Typora\typora-user-images\image-20210906113723822.png)

***

## long类型

java中long类型占8个字节，包装类为Long，当一个数赋值给long时，在这个数后面加上l或者L，最好是L，因为便于区分1和L。

``` java
	public static void main(String[] args) {
		long a = 10L;   //8字节，不建议写小写L
		long max = Long.MAX_VALUE;
		long min = Long.MIN_VALUE;
		System.out.println("最大值：" + max);   //2^63-1
		System.out.println("最小值：" + min);   //-2^63
		System.out.println("a的值为：" + a);    //字符串拼接

		int b = 10;
		int c = 20;
		System.out.println(b + c);   //这是30
		System.out.println("b + c = " + (b + c));   //这是字符串拼接 b + c = 30
		System.out.println("b + c = " + b + c);   //字符串拼接 b + c = 1020
	}
```

运行结果：

![image-20210906114106524](C:\Users\晓伍\AppData\Roaming\Typora\typora-user-images\image-20210906114106524.png)

***

## float类型与double类型

float类型占4个字节，而double类型占8个字节，它们的包装类分别为Float和Double，使用java默认浮点数为double类型，也就是说，当对一个float变量赋值时，在值后面加上f。

```java
	public static void main(String[] args) {
		float a = 1.56f;    //4个字节 - 如果后面不加f，默认还是double，编译器报错
		//尝试把double赋值给float
		// double b = 1.87;    
		// a = b;  //err，因为不会隐式转换
		System.out.println("float max = " + Float.MAX_VALUE);
		System.out.println("float min = " + Float.MIN_VALUE);
		System.out.println("double max = " + Double.MAX_VALUE);
		System.out.println("double min = " + Double.MIN_VALUE);
	}
```



运行结果：

![image-20210906114805263](C:\Users\晓伍\AppData\Roaming\Typora\typora-user-images\image-20210906114805263.png)

***

## boolean类型

java中的bool值类型，和C/C++有很大的不同，在C/C++中，0表示false，非0表示true，而java中只有true和false

这两个值，他们共同构成boolean，boolean没有明确的大小，包装类为Boolean。

```java
	public static void main8(String[] args) {
		boolean a = true;
		boolean b = false;
        //boolean c = 1;    //err - 1不是boolean类型，这个类型只有true和false
		System.out.println(a);
		System.out.println(b);
	}
```

运行结果：

![image-20210906115157220](C:\Users\晓伍\AppData\Roaming\Typora\typora-user-images\image-20210906115157220.png)

***The end***