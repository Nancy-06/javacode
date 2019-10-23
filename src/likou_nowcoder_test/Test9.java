package likou_nowcoder_test;

//题目：二进制中1的个数
//题目链接：https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tqId=11164&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
public class Test9 {
    public static int NumberOf1(int n) {
        int count=0;
        int val=1;
        while(val!=0){
            if((n&val)!=0){
                count++;
            }
            val=val<<1;
        }
        return count;
    }
    //最优解
    public static int NumberOf2(int n){
        int count=0;
        while(n!=0){
            count++;
            n=(n-1)&n;

        }
        return count;
    }

    public static void main(String[] args) {
        int m=-4;
        System.out.println(NumberOf2(m));
    }
}
