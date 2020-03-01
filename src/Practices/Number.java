package Practices;

/**
 * @author guoyao
 * @create 2020/3/1
 */
public class Number {
    public void test(int x){
        x=x+10;
        System.out.println("形参传值调用："+"形参x 修改值="+x);
    }
    public static void main(String [] args){
        Number n = new Number();
        int x=20;
        System.out.println("形参传值调用："+"形参X 初始值="+x);
        n.test(x);
        System.out.println("形参传值调用："+"形参X 修改值="+x);
    }
}
