package Test0902;

public class Person implements Comparable<Person>{
    public String name;
    public int age;
    public int rank;

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
