package Practices;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        PersonComparator[] people=new PersonComparator[5];
        Random random=new Random(20190922);
        for(int i=0;i<people.length;i++){
            people[i]=new PersonComparator();
            people[i].age=random.nextInt(60);
        }
        System.out.println(Arrays.toString(people));
        PersonRankComparator personRankComparator=new PersonRankComparator();
        Arrays.sort(people,personRankComparator);
        System.out.println(Arrays.toString(people));
    }
}
