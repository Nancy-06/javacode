package Practices;

import java.util.*;
//具体的比较类（比较器），实现Comparator接口
public class PersonRankComparator implements Comparator<PersonComparator> {
    @Override
    public int compare(PersonComparator o1, PersonComparator o2) {
        return (o1.age-o2.age);
    }
}
