package code_practice.day_19;

/**
 * @author guoyao
 * @create 2020/6/12
 */
public class Test10 {

    //各位相加
    //递归
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
        int next = 0;
        while(num != 0){
            next = next + num %10;
            num /= 10;
        }
        return addDigits(next);
    }

    // 数学法
    public int addDigits1(int num){

        return (num -1) % 9 +1;
    }
}
