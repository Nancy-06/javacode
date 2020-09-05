package code_practice.day_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author guoyao
 * @create 2020/9/5
 */

//两种排序算法
public class Test12 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] strs = new String[n];
        for(int i = 0; i < n; i++){
            strs[i] = br.readLine();
        }
        if(islength(strs) && isLexico(strs)){
            System.out.println("both");
        }
        else if(islength(strs)){
            System.out.println("lengths");
        }
        else if(isLexico(strs)){
            System.out.println("lexicographically");
        }
        else{
            System.out.println("none");
        }
    }

    public static boolean islength(String [] strs){
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < strs[i - 1].length()){
                return false;
            }
        }
        return true;
    }

    public static boolean isLexico(String [] strs){
        for(int i = 1; i < strs.length; i++){
            if(strs[i].compareTo(strs[i - 1]) < 0){
                return false;
            }
        }
        return true;
    }
}
