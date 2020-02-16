package Practices;

/**
 * @author guoyao
 * @create 2020/2/16
 */
class Main{
    public static void hello(){
        System.out.println("hello");
    }
}

class Base{
    public  Base(String s){
        System.out.print("B");
    }
}
public class Test0216 extends Base {

    public Test0216(String s) {
        //父类中有有参的构造方法，
        // 所以在子类的构造器中一定要使用super(参数)指定调用父类的有参构造器
        super(s);
        System.out.println("D");
    }

    public static boolean isAdmin(String userld){
        return userld.toLowerCase()=="admin";
    }

    public  int aMethod(){
        //Java中静态变量只能在类主体重定义，
        // 不能在方法中定义，静态变量属于类而不属于方法
        //static int i;
        int i=0;
        i++;
        return i;
    }
    public static void main(String[] args) {

        //结果为false,执行toLowerCase(0时会重新new String，
        // 相当于String创建了两个，地址不一样，而==判断的是地址，
        //所以会返回false
        System.out.println(isAdmin("Admin"));
        //静态方法不依附于对象，只看类型，在编译时就确定了
        Main m=null;
        m.hello();
        new Test0216("C");
    }
}
