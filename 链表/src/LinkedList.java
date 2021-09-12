
class Node {

    public Node() {

    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public int val;
    public Node next;

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

public class LinkedList {
    public Node head;

    //得到单链表长度
    public int size() {
        int size = 0;
        Node cur = head;
        while(cur != null) {
            cur = cur.next;
            size++;
        }

        return size;
    }

    //头插法
    public void addFirst(int data) {
        head = new Node(data,head);
    }

    //尾插法
    public void addLast(int data) {
        //1.头节点为null
        //2.头节点不为null
        if(head == null) {
            addFirst(data);
        } else {
            Node cur = head;
            while(cur.next != null) {
                cur = cur.next;
            }
            //到达最后一个结点处
            cur.next = new Node(data, null);
        }
    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {
        //首先判断坐标合法性
        if(index < 0 || index > this.size()) {
            return false;
        }

        //插入
        if(index == 0) {
            //头插
            this.addFirst(data);
        } else if(index == this.size()) {
            //尾插
            this.addLast(data);
        } else {
            Node cur = this.head;
            for(int i = 0;i < index - 1;i++) {
                cur = cur.next;
            }
            //到达插入点
            cur.next = new Node(data, cur.next);
        }

        return true;
    }

    //显示链表
    public void display() {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
        System.out.println("null");
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        //遍历
        Node cur = head;
        while(cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public boolean remove(int key) {
        if(head != null) {
            //分头节点是目标和非头节点是目标两种情况
            if(head.val == key) {
                head.val = 0;
                head = head.next;  //删除头节点
                return true;
            } else {
                Node cur = head;
                Node prev = cur;
                while(cur != null && cur.val != key) {
                    prev = cur;
                    cur = cur.next;
                }

                if(cur != null) {
                    //说明val == key
                    prev.next = cur.next;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        while(this.contains(key)) {
            remove(key);
        }
    }

    //清空链表
    public void clear() {
        head = null;
    }
}
