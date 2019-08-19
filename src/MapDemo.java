//Map接口常用方法
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        /**
         * 表示Map中的数量
         */
        System.out.println(map.size());
        /**
         * 判断是否为空
         */
        System.out.println(map.isEmpty());
        /**
         * 根据指定的K找对应的V
         */
        System.out.println(map.get("作者"));
        /**
         * 根据指定的k找对应的V，没有找到用默认值表示
         */
        System.out.println(map.getOrDefault("作者","路遥"));
        /**
         * 判断Map中是否包含Key
         */
        System.out.println(map.containsKey("作者"));
        /**
         * 判断Map中是否包含Value
         */
        System.out.println(map.containsValue("路遥"));
        /**
         * put(k  key,v,value)
         * 将指定的K-V放入Map
         */
        map.put("作者","鲁迅");
        map.put("标题","狂人日记");
        map.put("发表时间","1918年");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者","佚名"));
        System.out.println(map.containsKey("标题"));
        System.out.println(map.containsValue("狂人日记"));
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }


}