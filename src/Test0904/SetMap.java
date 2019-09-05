package Test0904;

import java.util.*;

public class SetMap {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        //添加，重复元素不打印
        set.add("Hello");
        set.add("Java");
        set.add("C++");
        set.add("Java");
        set.add("java");
        System.out.println(set);
        set.remove("C++");
        //remove(O)删除集合中的O
        System.out.println(set);
        //contains(O)判断O是否在集合中
        System.out.println(set.contains("Love"));
        //返回迭代器
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //清空集合
        set.clear();
        System.out.println(set);
    }
}
