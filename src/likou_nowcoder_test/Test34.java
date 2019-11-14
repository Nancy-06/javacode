package likou_nowcoder_test;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/14
 */

//删数
public class Test34 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            if(n>1000){
                n=999;
            }
            Queue<Integer> queue=new LinkedList<>();
            for(int i=0;i<n;i++){
                queue.add(i);
            }
            while(queue.size()!=1){
                int count=2;
                while(count--!=0){
                    int temp=queue.peek();
                    queue.poll();
                    queue.add(temp);
                }
                queue.poll();
            }
            System.out.println(queue.peek());
        }

    }
}
