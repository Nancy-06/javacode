package Test1027;

/**
 * @author guoyao
 * @create 2019/10/27
 */
//匿名内部类

//定义动物类接口
interface Animal{
    void shout();
}
public class Test2 {
    public static void main(String[] args) {
        //定义匿名内部类作为参数传递给animalShout()方法
        animalShout(new Animal(){
            @Override
            public void shout() {
                System.out.println("wangwang……");
            }
        });
    }
    public static void animalShout(Animal an){
        an.shout();
    }
}
