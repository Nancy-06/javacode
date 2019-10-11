package Test1009;

class Human{
    String name;
    int age;
    public Human(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Student extends Human{
    String num;
    String className;
    public Student(String name, int age,String num,String className) {
        super(name, age);
        this.num=num;
        this.className=className;
    }
    public void eat(){
        System.out.println(name+"在吃饭");
    }
}
public class Test4 {
    public static void main(String[] args) {
        Student student=new Student("张三",20,"o1","计科");
        student.eat();
    }
}
