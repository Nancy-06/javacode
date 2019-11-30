package likou_nowcoder_test;


import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/30
 */

//最难的问题
public class Test113002 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            char [] ch=new char[150];
            //密码
            String s1="A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
            //原文
            String s2="V W X Y Z A B C D E F G H I J K L M N O P Q R S T U";
            for(int i=0;i<s1.length();i++){
                ch[s1.charAt(i)]=s2.charAt(i);
            }
            String str=scanner.nextLine();
            String result="";
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    result+=' ';
                }
                else{
                    result+=ch[str.charAt(i)];
                }
            }
            System.out.println(result);
        }


    }
}
