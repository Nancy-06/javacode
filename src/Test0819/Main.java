package Test0819;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class Person{}
class Bird{}

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        List<Person> list2=new LinkedList<>();
        ArrayList<Bird> list3=new ArrayList<>();
        /**
         * instanceof关键字：
         * 他的前一个操作符是一个引用变量，后一个操作数通常是一个类（也可以是接口），
         * 用于判断前面的对象是否是后面的类，或者子类、实现类的实例，
         * 如果是返回true，否则返回false
         */
        System.out.println(list1 instanceof ArrayList);
        System.out.println(list2 instanceof ArrayList);
        System.out.println(list3 instanceof ArrayList);
        /**
         * getClass表示对象的类类型
         */
        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        System.out.println(list3.getClass());
    }
}

