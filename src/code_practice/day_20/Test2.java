package code_practice.day_20;

/**
 * @author guoyao
 * @create 2020/6/13
 */
public class Test2 {
    //不用加号的加法
    public int add(int a, int b) {

        int sum = 0;
        int carry = 0;
        while(b != 0){
            //异或计算未进位的部分
            sum = a^b;
            // 进位部分
            carry = (a&b) <<1;
            // 保存未进位的部分，再次计算
            a = sum;
            // 保存进位部分，再次计算
            b = carry;
        }
        return a;
    }
}
