package Test1009;
//继承
/**
class Animal{
    String name="动物";
    void shout(){
        System.out.println("动物发出叫声");
    }
}
 //继承
class Dog extends Animal{
    public void printName(){
        System.out.println("name="+name);
    }
}
 //重写父类的方法
class Cat extends Animal{
    void shout{
        System.out.println("喵喵……");
    }
}
 //super调用父类的属性，方法
class Dog extends Animal{
    String name="犬类";
    void shout(){
        super.shout();
    }
    void printName(){
        System.out.println("name="+super.name);
    }
}
**/
//super调用父类的构造方法
class Animal{
    public Animal(String name){
        System.out.println("我是一只"+name);
    }
}
class Dog extends Animal{
    public Dog(){
        super("小狗狗");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        //dog.printName();
        //dog.shout();
    }
}
