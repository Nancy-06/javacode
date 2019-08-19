package Test0819;
//杨辉三角实现
import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate1(int numsRows){
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numsRows;i++){
            List<Integer> nums=new ArrayList<>();
            nums.add(1);
            for(int j=0;j<i-1;j++){
                List<Integer> num=list.get(i-1);
                int n=num.get(j)+num.get(j+1);
                nums.add(n);
            }
            if(i!=0){
                nums.add(1);
            }
            list.add(nums);
        }
        return list;
    }

   public List<List<Integer>> generate2(int numRows){
       List<List<Integer>> list=new ArrayList<>();
       for(int n=0;n<numRows;n++){
           list.add(new ArrayList<>());
       }
       list.get(0).add(1);
       list.get(1).add(1);
       list.get(1).add(1);
       for(int i=2;i<numRows;i++){
           List<Integer> nums=list.get(i);
           nums.add(1);
           for(int j=1;j<i;j++){
               int num=list.get(i-1).get(j-1)+list.get(i-1).get(j);
               nums.add(num);
           }
           nums.add(1);
       }
       return list;
   }

   private static void printPascalsTriangle(Solution s,int m){
       System.out.println(s.generate1(m));
       System.out.println(s.generate2(m));
   }

    public static void main(String[] args) {
        Solution solution=new Solution();
        printPascalsTriangle(solution,5);
    }
}
