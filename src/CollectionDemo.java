//Collection接口的常用方法演示
import java.util.*;
import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        /**
         * 返回集合中元素的个数
         */
        System.out.println(list.size());
        /**
         * 判断集合是否为空，为空返回true，不为空返回false
         */
        System.out.println(list.isEmpty());
        /**
         * 将元素放入到集合中
         */
        list.add("2019");
        list.add("2019");
        list.add("08");
        list.add("18");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        Object[] array=list.toArray();
        System.out.println(Arrays.toString(array));
        for(String s:list){
            System.out.println(s);
        }
        /**
         * 如果元素e出现，删除其中一个
         */
        list.remove("2019");
        for(String s:list){
            System.out.println(s);
        }
        /**
         * 删除集合中所有的元素
         */
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
