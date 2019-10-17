package Practices;

/**
 * 因为要实现对Person对象的排序，所以要在Person类中要实现Comparable接口，
 * 实现compareTo(）方法
 */
public class Person implements Comparable<Person> {
    public String name;
    public int age;
    public int rank;

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }

    @Override
    //这里只比较了年龄
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
