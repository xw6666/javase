/**
 *文档注释 
 */

/*
块注释
 */

//行注释
//如果一个类是public的，那么这个类的类名一定要和文件名相同
//一个文件只能有一个public类

public class HelloWorld{
	public static void main(String[] args){
		//1.整形int - 4字节，和机器字长无关
		int a = 10;

		System.out.println(a);  //打印并换行
		System.out.print(a);   //打印不换行
		System.out.printf("%d\n", a);

		System.out.println("Hello world!");
	}
}