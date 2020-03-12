package code_practice.day_06;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/12
 */

//删除公共字符
public class Test4 {

//    public static String remove(String s1,String s2){
//        String [] strA=s1.split(" ");
//        char [] ch=s2.toCharArray();
//        StringBuffer strB=new StringBuffer();
//        for(int i=0;i<strA.length;i++){
//            StringBuffer sb=new StringBuffer(strA[i]);
//            int length=sb.length();
//            for(int j=0;j<length;j++){
//                for(int k=0;k<ch.length;k++){
//                    if(sb.charAt(j)==ch[k]){
//                        sb.deleteCharAt(j);
//                        length--;
//                    }
//                }
//            }
//            if(i==strA.length-1){
//                strB.append(sb);
//            }else{
//                strB.append(sb+" ");
//            }
//        }
//        return strB.toString();
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String s1=scanner.nextLine();
//        String s2=scanner.nextLine();
//        System.out.println(remove(s1,s2));
//    }


    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        HashMap<Integer,Character> map=new HashMap<>();
        int index=0;
        for(int i=0;i<s2.length();i++){
            map.put(index,s2.charAt(i));
            index++;
        }

        for(int i=0;i<s1.length();i++){
            if(!map.containsValue(s1.charAt(i))){
                System.out.print(s1.charAt(i));
            }
        }
    }
}
