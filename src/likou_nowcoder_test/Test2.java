package likou_nowcoder_test;

//题目：9.回文数
//题目链接：https://leetcode-cn.com/problems/palindrome-number/
public class Test2 {
    public static boolean isPalindrome(int x){
       if(x<0){
           return false;
       }
       if(x==0){
           return true;
       }
       int y=0;
       int count=0;
       int temp=x;
       while(temp!=0){
          y=temp%10;
          count=count*10+y;
          temp=temp/10;
       }
       if(count==x){
           return true;
       }
       return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
