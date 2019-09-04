package Test0904;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        //Map<key,value>
        //put<key,value>  设置 key 对应的 value,key重复，则不打印
        //他们打印的顺序与key值的顺序无关
        map.put(1,"hello");
        map.put(1,"Hello");
        map.put(2,"Java");
        map.put(3,"java");
        map.put(10,"C++");
        System.out.println(map);
        //返回key对应的value
        System.out.println(map.get(2));
        //查不到返回null
        System.out.println(map.get(50));
        //返回 key 对应的 value，key 不存在，返回默认值（defaulltValue）
        System.out.println(map.getOrDefault(2,"默认值"));
        System.out.println(map.getOrDefault(4,"默认值"));
        System.out.println(map);
        //打印所有的key
        for(Integer key:map.keySet()){
            System.out.println(key);
        }
        //打印所有的key
        for(String value:map.values()){
            System.out.println(value);
        }
        //删除key对应的映射关系
        map.remove(1);
        System.out.println(map);
        //按key-value映射关系打印
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry);
        }
    }
}
