import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	/**
	 * 猜数字游戏
	 * @param args [description]
	 */
	public static void main(String[] args) {
		//放置随机数
		Random random = new Random();
		int ret = random.nextInt(100) + 1;  //将随机数区间设置在[1,100]

		//提示玩家
		System.out.println("我心中已想好了一个1到100的数字，请你猜猜看：");
		Scanner sc = new Scanner(System.in);
		int time = 1;
		int num = sc.nextInt();
		while(true) {
			if(num == ret) {
				System.out.println("恭喜你猜中数字！一共用了" + time + "次！");
				break;
			} else if (num < ret) {
				System.out.println("你猜的数字偏小，请再试一次：");
				num = sc.nextInt();
				time++;
			} else {
				System.out.println("你猜的数字偏大，请再试一次：");
				num = sc.nextInt();
				time++;
			}
		}
	}
}