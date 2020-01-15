package Practices;

/**
 * @author guoyao
 * @create 2020/1/15
 */
//异常
public class Test0115 {
    public static void main(String[] args) {
        //System.out.println(10/0);
        /**
        int [] arr={1,2,3};
        System.out.println(arr[100]);
         */
        /**
        //处理异常
        int [] arr={1,2,3};
        try{
            System.out.println("before");
            arr=null;
            System.out.println(arr[100]);
            System.out.println("after");
        }catch(ArrayIndexOutOfBoundsException e){
            //打印出现异常的调用栈
            System.out.println("数组下标越界异常");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("空指针异常");
            e.printStackTrace();
        }
        System.out.println("after try catch");
         **/
        //System.out.println(divide(10,0));
        System.out.println(func());
    }
    public static int divide(int x,int y)throws ArithmeticException{
        if(y==0){
            throw new ArithmeticException("抛出除0异常");
        }
        return x/y;
    }
    public static int func(){
        try{
            return 10;
        }finally {
            return 20;
        }
    }
}
