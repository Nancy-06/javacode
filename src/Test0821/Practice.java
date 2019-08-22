package Test0821;
import java.math.BigInteger;
//java大数处理（相加，相减，相乘，相除，取反）
public class Practice{
    public static void main(String[] args) {
        BigInteger bigInteger1=new BigInteger("012345678901234567890123456789");
        BigInteger bigInteger2=new BigInteger("999999999999999999999999999999");
        //add 相加
        bigInteger1=bigInteger1.add(bigInteger2);
        System.out.println(bigInteger1);
        //subtract 相减
        bigInteger1=bigInteger1.subtract(bigInteger2);
        System.out.println(bigInteger1);
        //Multiply 相乘
        bigInteger1=bigInteger1.multiply(bigInteger2);
        System.out.println(bigInteger1);
        //divide 相除
        bigInteger1=bigInteger1.divide(bigInteger2);
        System.out.println(bigInteger1);
        //negate 取反
        bigInteger1=bigInteger1.negate();
        System.out.println(bigInteger1);
        //powers 指数运算
        bigInteger1=bigInteger1.pow(10);
        System.out.println(bigInteger1);
    }
}

