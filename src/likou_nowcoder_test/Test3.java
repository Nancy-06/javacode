package likou_nowcoder_test;

//7.整数反转
//题目链接：https://leetcode-cn.com/problems/reverse-integer/
public class Test3 {
    public static int reverse(int x) {
        int y=0;
        long count=0;
        int temp=x;
        while(temp!=0){
            y=temp%10;
            count=count*10+y;
            temp=temp/10;
        }
        if((int)count!=count){
            return 0;
        }
        else{
            return (int) count;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
