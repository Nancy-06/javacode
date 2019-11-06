package Test1105;

/**
 * @author guoyao
 * @create 2019/11/5
 */
//this关键字

class Human{
       int age;
       String name;
       public Human(){
           //System.out.println("无参构造方法被调用了…");
       }
       public Human(int age){
           //调用了无参的构造方法
           this();
           this.age=age;
           System.out.println("有参的构造方法被调用了…");
       }

       public Human(String name,int age){
           this(age);
           this.name=name;
           System.out.println("有参的构造方法被调用了…");
       }
       public int getAge(){
           return this.age;
       }

       public void openMouth(){

       }

       public void speak(){
           this.openMouth();
       }

       //this调用当前对象
       public void print(){
           System.out.println("print方法"+this);
       }



}
public class Test2 {
    public static void main(String[] args) {
        Human h1=new Human();
        System.out.println("main方法"+h1);
        h1.print();
        System.out.println("======================");
        Human h2=new Human();
        System.out.println("main方法"+h2);
        h2.print();
    }
}
