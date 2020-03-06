package code_practice.day_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author guoyao
 * @create 2020/3/6
 */

public class Test1 {
    //富翁换钱
//    public static void main(String[] args) {
//        int n=10*30;
//        int m=(int)Math.pow(2,30)-1;
//        System.out.println(n+" "+m);
//    }

    //说反话
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(
                new InputStreamReader(System.in)
        );
        String line=reader.readLine();
        String [] words=line.split(" ");
        for(int i=0;i<words.length-1;i++){
            System.out.printf("%s",words[words.length-1-i]+" ");
        }
        System.out.println(words[0]);
    }
}
