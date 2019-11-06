package Test1105;

/**
 * @author guoyao
 * @create 2019/11/5
 */

//构造方法
class Person{
    int age;
    String name;
    //定义无参构造方法
    public Person(){
        System.out.println("无参构造方法");
    }
    //定义有一个参数的有参构造方法
    public Person(int age){
        this.age=age;
    }
    //定义有两个参数的有参构造方法
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void speak(){
        System.out.println("我叫"+name+",我今年"+age+"岁了！");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person(20);
        Person p3=new Person(20,"李四");
        p2.speak();
        p3.speak();
    }
}
