package Test1106;

/**
 * @author guoyao
 * @create 2019/11/9
 */
class Animal{
    String name="动物";
    public Animal(String name){
        System.out.println("我是一只"+name);
    }
    void shout(){
        System.out.println("动物发出叫声");
    }
}
class Dog extends Animal{
    public Dog(){
        super("沙皮狗");
    }
    String name="犬类";
    void shout(){
        super.shout();
    }
    void printName(){
        System.out.println("name="+super.name);
    }
}
public class Test3 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        //dog.shout();
        //dog.printName();
    }
}
