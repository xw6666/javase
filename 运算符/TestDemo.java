public class TestDemo {

	/**
	 * !运算符
	 * @param args [description]
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(!(a < b)); //false     
		System.out.println(10 > 20 && 10 / 0 == 3123);  //false - 不会计算后面的表达式
		// System.out.println(true == 0);   //err - 不能比较      
		
		// & |  按位与和按位或，操作数为boolean类型时也表示逻辑运算（不推荐这样使用）
	}

	/**
	 * 取模运算符
	 * @param args [description]
	 */
	public static void main2(String[] args) {
		//以下稳扎稳打列竖式计算
		//注意：java中浮点数也可以取模
		System.out.println(10 % 3);    //1
		System.out.println(-10 % 3);    //-1
		System.out.println(10 % -3);    //1
		System.out.println(-10 % -3);   //-1 

	}

	/**
	 * 除法运算符/
	 * @param args [description]
	 */
	public static void main1(String[] args) {

		System.out.println(5 / 2);    //2
		System.out.println(5.0 / 2);   //2.5
		System.out.println((float)5 / 2);   //2.5
		System.out.println((float)(5 / 2));   //2.0
	}
}