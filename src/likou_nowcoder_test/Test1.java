package likou_nowcoder_test;

//题目：45832下厨房
//题目链接：https://www.nowcoder.com/questionTerminal/ca5c9ba9ebac4fd5ae9ba46114b0f476

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<String> set=new HashSet<>();
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            String [] array=str.split(" ");
            for(int i=0;i<array.length;i++){
                set.add(array[i]);
            }
        }
        System.out.println(set.size());
    }
}
