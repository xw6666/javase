public class TestDemo {
    static void test1() {
        LinkedList list = new LinkedList();
        System.out.println(list.head);  //null
        list.addFirst(1);
        System.out.println(list.head);
        list.addLast(2);
        System.out.println(list.head);
        System.out.println(list.size());
        list.display();
    }
    static void test2() {
        LinkedList list = new LinkedList();
        list.addLast(0);
        list.addLast(1);
//        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        boolean ret = list.addIndex(0, 2);
//        System.out.println(ret);
//        boolean searchAns1 = list.contains(2);
//        boolean searchAns2 = list.contains(5);
//        System.out.println("ans1 = " + searchAns1 + " ans2 = " + searchAns2);
        list.display();
        System.out.println("-----------------------------------");
        if(list.contains(2)) {
            boolean removeRet = list.remove(5);
            System.out.println(removeRet);
        }
        list.display();

    }
    public static void test3() {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(1);
        list.display();
        System.out.println("-----------------------");
        list.removeAllKey(1);
        list.display();
        System.out.println("-----------------------");
        list.clear();
        list.display();
    }



    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }
}
