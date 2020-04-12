package code_practice.day_13;

import java.util.*;

/**
 * @author guoyao
 * @create 2020/4/8
 */

//36901--火车进站
public class Test7 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            //输入火车数量
            int n=in.nextInt();
            //输入火车编号
            int [] A=new int[n];
            for(int i=0;i<n;i++){
                A[i]=in.nextInt();
            }
            int start=0;
            //计算n个火车的出站的编号的排列组合
            ArrayList<int []> result=new ArrayList<>();
            Permutation(A,start,n,result);
            //出栈的结果，一个元素一个记录
            Set<String> sortResult=new TreeSet<>();
            //循环排列组合
            for(int [] out:result){
                //判断是否满足出栈要求（后进先出）
                if(isLegal(A,out,n)){
                    //满足的组合，输入结果，每一个编号用空格分割
                    StringBuffer sb=new StringBuffer();
                    for(int i=0;i<n-1;i++){
                        sb.append(out[i]+" ");
                    }
                    sb.append(out[n-1]);
                    sortResult.add(sb.toString());
                }
            }
            //最后输出所有的符合出栈要求的组合
            for(String list:sortResult){
                System.out.println(list);
            }
        }
    }

    /**
     *
     * @param in 火车编号数组
     * @param out 火车站顺序
     * @param n 火车数量
     * @return
     */
    private static boolean isLegal(int[] in, int[] out, int n) {
        //栈：存储进站的火车编号
        LinkedList<Integer> stack=new LinkedList<>();
        int i=0;
        int j=0;
        while(i<n){
            if(in[i]==out[j]){
                i++;
                j++;
            }else{
                if(stack.isEmpty()){
                    stack.push(in[i]);
                    i++;
                }else{
                    int top=stack.peek();
                    if(top==out[j]){
                        j++;
                        stack.pop();
                    }else if(i<n){
                        stack.push(in[i]);
                        i++;
                    }
                }
            }
        }
        while(!stack.isEmpty()&&j<n){
            int top=stack.pop();
            if(top==out[j]){
                j++;
            }else{
                return false;
            }
        }
        return true;
    }

    /**
     * 求出所有排列
     * @param a
     * @param start
     * @param n
     * @param result
     */
    private static void Permutation(int[] a, int start, int n, ArrayList<int[]> result) {
        if(start==n){
            return;
        }
        if(start==n-1){
            int [] B=a.clone();
            result.add(B);
            return;
        }
        for(int i=start;i<n;i++){
            swap(a,start,i);
            Permutation(a,start+1,n,result);
            swap(a,start,i);
        }
    }

    private static void swap(int[] a, int start, int i) {
        int t=a[start];
        a[start]=a[i];
        a[i]=t;
    }

    //判断栈的弹出和弹入序列
    public static boolean judge(int [] a1,int [] a2){
        if(a1==null||a2==null||a1.length!=a2.length){
            return false;
        }
        Stack<Integer> stack=new Stack<>();
       for(int i=0;i<a1.length;i++){
           stack.push(a1[i]);
           int j=0;
           while(!stack.isEmpty()&&stack.peek()==a2[j]){
               stack.pop();
               j++;
           }
       }
      return stack.isEmpty();

    }
}
