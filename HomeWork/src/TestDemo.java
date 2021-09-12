import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()) {
            int score = scanner.nextInt();
            if (score <= 100 && score >= 90) {
                System.out.println("完美");
            } else if (score < 90 && score >= 80) {
                System.out.println("优秀");
            } else if (score < 80 && score >= 70) {
                System.out.println("有前途");
            } else if (score < 70 && score >= 60) {
                System.out.println("还可以");
            } else if (score < 60 && score >= 0) {
                System.out.println("不及格");
            } else {
                System.out.println("输入错误");
            }
        }
    }
}
