package Practices;

/**
 * @author guoyao
 * @create 2020/1/14
 */
//抽象类
abstract class Person2{
    //属性
    private String name;
    //普通方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //{}为方法体，所有抽象方法上不包含方法体
    public abstract void getPersonInfo();   //抽象方法
}
class Student extends Person2{
    public void getPersonInfo() {
        System.out.println("I am student");
    }
}

public  class Test {
    public static void main(String[] args) {
        //实例化子类，向上转型
        Person2 per=new Student();
        per.getPersonInfo();
    }
}
