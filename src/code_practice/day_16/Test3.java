package code_practice.day_16;

/**
 * @author guoyao
 * @create 2020/5/7
 */

//不用加减乘法做加法--利用数学方法推导出，利用位运算进行求解
public class Test3 {
    public int add(int a,int b){
        while(b!=0){ //当进位为0时退出
            int c=(a&b)<<1; //c=进位
            a^=b;  //a=非进位
            b=c;  //b=进位
        }
        return a;
    }
}
