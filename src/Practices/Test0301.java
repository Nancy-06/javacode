package Practices;

/**
 * @author guoyao
 * @create 2020/3/1
 */
public class Test0301 {
    //理解实参和形参的关系
    //进行的是传值调用，形参的变化不影响实参的数值
    public static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
    }

    public static void show(int i){
        i=10;
        System.out.println("形参传值调用："+"形参i 修改值="+i);
    }

    //传引用类型参数，形参的变化影响实参的变化
    public static void swap(int [] array){
        int temp=array[0];
        array[0]=array[1];
        array[1]=temp;
    }

    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        swap(a,b);
//        System.out.println("a="+a+",b="+b);
//        int i=20;
//        show(i);
//        System.out.println(i);
        int [] array={10,20};
        swap(array);
        System.out.println("a="+array[0]+",b="+array[1]);
    }
}
