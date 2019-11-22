package likou_nowcoder_test;

/**
 * @author guoyao
 * @create 2019/11/21
 */

//另类加法
public class Test45 {

    public static int addAB(int A, int B) {
         if(B==0){
             return A^B;
         }
        return addAB(A^B,(A&B)<<1);
    }

    public static void main(String[] args) {
        System.out.println(addAB(3,5));
    }
}
