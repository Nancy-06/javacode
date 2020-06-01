package code_practice.day_18;

/**
 * @author guoyao
 * @create 2020/5/29
 */
//求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case
// 等关键字及条件判断语句（A?B:C）。
public class Test7 {

    //等差数列求和
    public int sumNums(int n) {
        return (int) (Math.pow(n,2) + n)>>1;
    }

    //递归
    public int sumNums1(int n){
        int sum = 0;
        boolean flag = n>0 &&(sum+=sumNums1(n-1))>0;
        return sum;
    }
}
