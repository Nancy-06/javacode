package likou_nowcoder_test;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2019/11/27
 */

//子串判断
public class test112701 {
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        boolean [] boo=new boolean[n];
        for(int i=0;i<n;i++){
           boo[i]=isSub(p[i],s);
        }
        return boo;
    }

    public static boolean isSub(String sub,String s){
        if(s.indexOf(sub)!=-1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String [] p={"a","b","c","d"};
        String s="abc";
        int n=4;
        boolean [] boo=chkSubStr(p,n,s);
        System.out.println(Arrays.toString(boo));
    }
}
