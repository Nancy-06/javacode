package Test1021;

/**
 * @author guoyao
 * @create 2019/10/24
 */
//内部类
/**
class Outer{
    private String str="hello";
    //定义一个内部类
    class Inner{
        //定义一个普通方法
        public void print(){
            System.out.println(str);
        }
    }
    //在外部类中定义一个方法，该方法负责产生内部类对象并且调用print()方法
    public void fun(){
        //内部类对象
        Inner in=new Inner();
        in.print();
    }
}
**/

//内部类来实现多继承
class A{
    private String name="A类的私有域";
    public String getName(){
        return name;
    }
}

class B{
    private int age=20;
    public int getAge(){
        return age;
    }
}

class Outter{
    private class InnerClassA extends A{
        public String name(){
            return super.getName();
        }
    }
    private class InnerClassB extends B{
        public int age(){
            return super.getAge();
        }
    }
    public String name(){
        return new InnerClassA().name();
    }
    public int age(){
        return new InnerClassB().age();
    }
}

public class Test1 {
    public static void main(String[] args) {
        //外部类对象
        //Outer out=new Outer();
        //out.fun();
        Outter outter=new Outter();
        System.out.println(outter.name());
        System.out.println(outter.age());
    }
}
