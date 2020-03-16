package code_practice.day_07;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/14
 */
//字符串加解密
public class Test3 {

    //字符串加密过程
    public static String encrypt(String str){
        char [] aucPassword=str.toCharArray();
        for(int i=0;i<aucPassword.length;i++){
            if(aucPassword[i]>='a'&&aucPassword[i]<'z') {
                aucPassword[i] -= 31;
            }
            else if(aucPassword[i]>='A'&&aucPassword[i]<'Z') {
                aucPassword[i] += 33;
            }
            else if(aucPassword[i]>='0'&&aucPassword[i]<'9'){
                aucPassword[i]+=1;
            }
            else if(aucPassword[i]=='Z'){
                aucPassword[i]='a';
            }
            else if(aucPassword[i]=='z'){
                aucPassword[i]='A';
            }
            else if(aucPassword[i]=='9'){
                aucPassword[i]='0';
            }
        }
        return new String(aucPassword);
    }

    //字符串解密过程
    public static String unEncrypt(String str){
        char [] aucPassword=str.toCharArray();
        for(int i=0;i<aucPassword.length;i++){
            if(aucPassword[i]>'a'&&aucPassword[i]<='z') {
                aucPassword[i] -= 33;
            }
            else if(aucPassword[i]>'A'&&aucPassword[i]<='Z') {
                aucPassword[i] += 31;
            }
            else if(aucPassword[i]>'0'&&aucPassword[i]<='9'){
                aucPassword[i]-=1;
            }
            else if(aucPassword[i]=='A'){
                aucPassword[i]='z';
            }
            else if(aucPassword[i]=='a'){
                aucPassword[i]='Z';
            }
            else if(aucPassword[i]=='0'){
                aucPassword[i]='9';
            }
        }
        return new String(aucPassword);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str1=scanner.nextLine();
            String str2=scanner.nextLine();
            System.out.println(encrypt(str1));
            System.out.println(unEncrypt(str2));
        }

    }
}
