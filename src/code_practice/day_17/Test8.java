package code_practice.day_17;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author guoyao
 * @create 2020/5/18
 */

//圆圈中最后剩下的数字
public class Test8 {

    //会超时
    public static int lastRemaining(int n, int m) {

        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            queue.add(i);
        }
        int index=1;
        while(queue.size()!=1){
            if(index!=m){
                int val=queue.poll();
                queue.add(val);
                index++;
            }else{
                queue.poll();
                index=1;
            }
        }
        return queue.poll();
    }

    //迭代法
    public static int lastRemaining2(int n, int m){
        int ans=0;
        for(int i=2;i<=n;i++){
            ans=(ans+m)%i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(5,3));
    }
}
