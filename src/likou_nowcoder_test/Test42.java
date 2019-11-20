package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/20
 */

//超长正整数相加
public class Test42 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String addend=scanner.next();
        String augend=scanner.next();
        Test42 t=new Test42();
        System.out.println(t.addLongInteger(addend,augend));

    }

    public  String addLongInteger(String addend,String augend){
        if(addend==null||"".equals(addend)){
            return augend;
        }
        if(augend==null||"".equals(augend)){
            return addend;
        }
        StringBuffer result=new StringBuffer();
        //将两个数逆置
        String s1=new StringBuffer(addend).reverse().toString();
        String s2=new StringBuffer(augend).reverse().toString();
        int len1=s1.length();
        int len2=s2.length();
        int maxLen=Math.max(len1,len2);
        boolean isFull=false;//判断是否溢出
        int fullNumber =0;//表示溢出的数
        if(len1<len2){//短的数长度补0
            for(int i=len1;i<len2;i++){
                s1+="0";
            }
        }
        else{
            for(int i=len2;i<len1;i++){
                s2+="0";
            }
        }
        for(int i=0;i<maxLen;i++){
            int sum=Integer.parseInt(s1.charAt(i)+"")+Integer.parseInt(s2.charAt(i)+"");
            sum+= fullNumber;
            if(sum>=10){
                if(i==maxLen-1){  //计算到最后一位
                    isFull=true;
                }
                fullNumber =1;  //表示溢出，进位
                result.append(sum-10);
            }
            else{    //没溢出
                fullNumber =0;
                result.append(sum);
            }
        }
        if(isFull){
            result.append(fullNumber);
        }
        return result.reverse().toString();
    }
}
