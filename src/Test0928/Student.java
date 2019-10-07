package Test0928;

class Human{
    int age;
    String sex;
    String name;
    public Human(int age,String sex,String name){
        this.age=age;
        this.sex=sex;
        this.name=name;
    }
    @Override
    public boolean equals(Object obj) {
        if(age==((Human)obj).age&&sex.equals(((Human)obj).sex)&&name.equals(((Human)obj).name)){
            return true;
        }
        return false;
    }
}
public class Student {
    public static void main(String[] args) {
        Human h1=new Human(20,"男","张三");
        Human h2=new Human(20,"男","张三");
        System.out.println(h1.equals(h2));
    }
}
