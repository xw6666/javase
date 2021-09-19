
//public class TestDemo {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while(scanner.hasNextInt()) {
//            int score = scanner.nextInt();
//            if (score <= 100 && score >= 90) {
//                System.out.println("完美");
//            } else if (score < 90 && score >= 80) {
//                System.out.println("优秀");
//            } else if (score < 80 && score >= 70) {
//                System.out.println("有前途");
//            } else if (score < 70 && score >= 60) {
//                System.out.println("还可以");
//            } else if (score < 60 && score >= 0) {
//                System.out.println("不及格");
//            } else {
//                System.out.println("输入错误");
//            }
//        }
//    }
//}

//class Swap {
//    public int a;
//    public int b;
//
//    public void set(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    public void swap(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    @Override
//    public String toString() {
//        return "Swap{" +
//                "a=" + a +
//                ", b=" + b +
//                '}';
//    }
//}
//
//public class TestDemo {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        Swap s = new Swap();
//        s.set(a, b);
//        System.out.println(s.toString());
//        s.swap(s.b, s.a);
//        System.out.println(s.toString());
//    }
//
//}


//public class TestDemo {
//    public static void menu() {
//        System.out.println("********************************");
//        System.out.println("********************************");
//        System.out.println("********* 0. 睡觉 ***************");
//        System.out.println("********* 1. 吃饭 ***************");
//        System.out.println("********* 2. 上课 ***************");
//        System.out.println("********* 3. 运动 ***************");
//        System.out.println("********* 4. 娱乐 ***************");
//        System.out.println("********* 5. 外出 ***************");
//        System.out.println("********************************");
//        System.out.println("********************************");
//    }
//
//    /**
//     * 练习switch - case语句
//     * 作者：20计科伍锦融
//     * 写于2021年9月17日
//     *
//     * @param args
//     */
//    public static void main(String[] args) {
//        menu();
//        int input = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        while(scanner.hasNextInt()) {
//            do {
//                input = scanner.nextInt();
//                switch (input) {
//                    case 0:
//                        System.out.println("我正在睡觉，别烦我");
//                        break;
//                    case 1:
//                        System.out.println("我正在吃饭，晚会在交流");
//                        break;
//                    case 2:
//                        System.out.println("我正在上课，不许打扰我哦");
//                        break;
//                    case 3:
//                        System.out.println("我正在运动，一起减肥吧");
//                        break;
//                    case 4:
//                        System.out.println("我正在娱乐，在看嘎嘎们");
//                        break;
//                    case 5:
//                        System.out.println("我正在外出购物，一起逛街吧");
//                        break;
//                    default:
//                        System.out.println("输入非法,请重新输入:>");
//                }
//            } while (input < 0 || input > 5);
//        }
//    }
//}
