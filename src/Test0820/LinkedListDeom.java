package Test0820;

import java.util.LinkedList;

public class LinkedListDeom {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.push("C");
        list.push("java");
        list.push("数据结构");
        list.push("操作系统");
        list.push("计算机原理");
        System.out.println(list.size());
        System.out.println(list.getFirst());
        //System.out.println(list.getLast());
       // System.out.println(list.peekFirst());
        //System.out.println(list.peekLast());
       // System.out.println(list.pollFirst());
        //System.out.println(list.pollFirst());
        //System.out.println(list.pollLast());
        //System.out.println(list.size());
        System.out.println(list.pop());
    }
}
