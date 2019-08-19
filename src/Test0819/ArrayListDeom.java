package Test0819;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDeom {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>(100);
        Set<String> set=new HashSet<>();
        set.add("作者");
        set.add("鲁迅");
        set.add("狂人日记");
        List<String>list3=new ArrayList<>(set);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
