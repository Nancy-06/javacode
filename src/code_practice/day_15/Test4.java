package code_practice.day_15;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/23
 */
//判断密码
public class Test4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            if(check1(str)&&check2(str)&&check3(str)){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }

    //1.长度超过8位
    public static boolean check1(String str){
        if(str==null||str.length()<=8){
            return false;
        }
        return true;
    }

    //2.包括大小写字母，数字，其他符号，以上四种至少三种
    public static boolean check2(String str){
        int shuzi=0,daxie=0,xiaoxie=0,qita=0;
        char [] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='0'&&ch[i]<='9'){
                shuzi=1;
                continue;
            }
            else if(ch[i]>='A'&&ch[i]<='Z'){
                daxie=1;
                continue;
            }
            else if(ch[i]>='a'&&ch[i]<='z'){
                xiaoxie=1;
                continue;
            }
            else{
                qita=1;
                continue;
            }
        }
        int sum=shuzi+daxie+xiaoxie+qita;
        if(sum>=3){
            return true;
        }
        else{
            return false;
        }
    }

    //3.不能有相同长度超过2的子串重复
    public static boolean check3(String str){
        for(int i=0;i<str.length()-2;i++){
            String s=str.substring(i,i+3);
            if(str.substring(i+1).contains(s)){
                return false;
            }
        }
        return true;
    }
}
