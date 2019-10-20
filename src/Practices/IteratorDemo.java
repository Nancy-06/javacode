package Practices;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//迭代器
public class IteratorDemo {
    /**
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
       Iterator<Integer> iterator=list.iterator();
       while(iterator.hasNext()){
           int it=iterator.next();
           System.out.print(it);
       }
    }
     **/
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }
    }
}
