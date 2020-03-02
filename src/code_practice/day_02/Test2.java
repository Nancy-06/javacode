package code_practice.day_02;

/**
 * @author guoyao
 * @create 2020/3/2
 */
public class Test2 {

    //2的个数
    //时间复杂度高
    public static int count(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            count+=num(i);
        }
        return count;
    }

    private static int num(int i) {
        int count=0;
        while(i>0){
            if(i%10==2){
                count++;
            }
            i/=10;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(count(12));
    }
}
