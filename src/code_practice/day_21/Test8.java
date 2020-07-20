package code_practice.day_21;

/**
 * @author guoyao
 * @create 2020/7/20
 */
public class Test8 {

    // 配对交换
    public int exchangeBits(int num) {

        int ans = 0, count = 0;
        while(num > 0){
            int last = (num & 1);
            num >>= 1;
            if(count %2 == 0){
                last <<= 1*(count + 1);
            }else{
                last <<= 1*(count - 1);
            }
            ans |= last;
            count++;
        }
        return ans;
    }
}
