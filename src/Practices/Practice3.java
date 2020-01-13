package Practices;

/**
 * @author guoyao
 * @create 2020/1/13
 */
//static分析

class Person1{
    //实例变量，存放在内存中
    public int age;
    //实例变量
    public String name;
    //实例变量
    public String sex;
    //类变量也叫静态变量，编译时已经产生，属于类本身，并且只有一份，存放在方法区
    public static int count;
    //被final修饰的叫常量，也属于对象，被final修饰，后续不可更改
    public final int SIZE=10;
    //静态的常量，属于类本身，只有一份，被final修饰，后续不可更改
    public static final int COUNT=99;
    //实例成员方法
    public void eat(){
        //局部变量
        int a=10;
        System.out.println("eat()!");
    }

    //实例成员方法
    public void sleep(){
        //局部变量
        int a=10;
        System.out.println("sleep()!");
    }
    //静态成员方法
    public static void staticTest(){
        //不能访问非静态成员
        //set="men";  //错误的
        System.out.println("staticTest()!");
    }
}

public class Practice3 {
    public static void main(String[] args) {
        //产生对象，实例化对象
        Person1 p=new Person1();
        System.out.println(p.age);  //默认值为0
        System.out.println(p.name);  //默认值为null
        //System.out.println(p.count);  //会有警告
        //正确的访问方式
        System.out.println(Person1.count);
        System.out.println(Person1.COUNT);
        Person1.staticTest();
        //总结：所有被static所修饰的方法或者属性，全都不依赖于对象
        p.eat();
        p.sleep();
    }
}
