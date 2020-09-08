package code_practice.day_24;

/**
 * @author guoyao
 * @create 2020/9/6
 */
public class Test13 {

    /**
     * N/A
     * @param num int整型
     * @return bool布尔型
     */
    public static boolean isPerfectSquare (int num) {
        // write code here
        if(num == 1){
            return true;
        }
        for(int i = 2; i < num / 2; i++){
            if(i * i == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(81));
    }
}
