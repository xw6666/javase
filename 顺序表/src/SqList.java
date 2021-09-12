import java.util.Arrays;
import java.util.Queue;
import java.util.Vector;

public class SqList {

    private int[] elem;   //数组
    private int length;   //长度
    public static final int capacity = 10;   //初始容量

    public SqList() {
        this.elem = new int[capacity];
        this.length = 0;
    }

    // 打印顺序表
    public void display() {
        String ret = "[";
        for (int i = 0; i < this.length; i++) {
            ret += Integer.toString(elem[i]);
            if (i < this.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        System.out.println(ret);
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (pos <= this.length) {
            //移动
            for (int i = this.length - 1; i >= pos; i--) {
                this.elem[i + 1] = this.elem[i];
            }
            //插入
            this.elem[pos] = data;
            //改变length
            length++;
        }
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.length; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置，找不到返回-1
    public int search(int toFind) {
        for (int i = 0; i < this.length; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos >= 0 && pos < length) {
            return this.elem[pos];
        }
        return -1;
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos >= 0 && pos < length) {
            this.elem[pos] = value;
        }
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int key = 0;
        while(key < length) {
            if(key == toRemove) {
                break;
            }
            key++;
        }

        if(key < length) {
            //覆盖元素
            for(int i = key + 1;i < this.length;i++) {
                this.elem[i - 1] = this.elem[i];
            }
            //长度改变
            length--;
        }

    }

    // 获取顺序表长度
    public int size() {
        return this.length;
    }

    // 清空顺序表
    public void clear() {
        for(int i = 0;i < this.length;i++) {
            this.elem[i] = 0;
        }
        length = 0;
    }
}

class TestDemo {
    public static void main(String[] args) {
        SqList l = new SqList();
        l.add(0, 1);
        l.add(0, 2);
        l.add(0, 3);
        l.add(0, 4);
        l.display();
        l.remove(2);
        l.display();
        System.out.println(l.size());
        if(l.contains(3)) {
            int pos = l.search(3);
            System.out.println(pos);
            l.setPos(pos, 2);
            l.display();
        }
        l.clear();
        l.display();
    }
}