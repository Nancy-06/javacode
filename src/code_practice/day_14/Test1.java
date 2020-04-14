package code_practice.day_14;

/**
 * @author guoyao
 * @create 2020/4/10
 */

//子串判断
public class Test1 {
    public static boolean []  judge(String [] array,int n,String s){
        boolean [] result=new boolean[n];
        for(int i=0;i<n;i++){
            if(s.contains(array[i])){
                result[i]=true;
            }
            else{
                result[i]=false;
            }
        }
        return result;
    }

}
