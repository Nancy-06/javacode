package code_practice.day_10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/26
 */

//找出n个数里最小的K个
public class Test2 {

    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      List<Integer> list=new ArrayList<>();
      while(scanner.hasNext()){
          list.add(scanner.nextInt());
      }
      int k=list.get(list.size()-1);
      list.remove(list.size()-1);
      int [] array=new int[list.size()];
      for(int i=0;i<list.size();i++){
          array[i]=list.get(i);
      }
      Arrays.sort(array);
      for(int i=0;i<k-1;i++){
          System.out.print(array[i]+" ");
      }
        System.out.println(array[k-1]);
    }
}
