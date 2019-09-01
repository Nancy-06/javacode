package Practices;

//方法重载
public class Overload {
    //一个普通的方法，不带参数
    void test(){
        System.out.println("No");
    }
    //重载上面的方法，并且带了一个整形参数
    void test(int a){
        System.out.println("a:"+a);
    }
    //重载上面的方法，并且带了两个整形参数
    void test(int a,int b){
        System.out.println("a and b:"+a+" "+b);
    }

    //重载上面的参数，并且带了一个双精度参数
    void test(double a){
        System.out.println("double a:"+a);
    }

    public static void main(String[] args) {
        Overload overload=new Overload();
        overload.test();
        overload.test(2);
        overload.test(2,3);
        overload.test(2.0);
    }
}

