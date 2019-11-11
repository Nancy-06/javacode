package likou_nowcoder_test;

import java.util.*;


/**
 * @author guoyao
 * @create 2019/11/11
 */

//n个数里出现次数大于等于n/2的数
    //ctrl+D结束输入
public class Test30 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            list.add(scanner.nextInt());

        }
        solution(list);
    }

    public static void solution(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : list) {
            int count = map.getOrDefault(i, 0);
            map.put(i, count + 1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int number=entry.getKey();
            int count=entry.getValue();
            if(count>=list.size()/2){
                System.out.println(number);
            }
        }
    }
}
