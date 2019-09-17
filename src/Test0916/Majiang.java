package Test0916;

public class Majiang implements Comparable<Majiang> {
    public String color;
    public String value;
    public Majiang(String color,String value){
        this.color=color;
        this.value=value;
    }

    @Override
    public int compareTo(Majiang o) {
        return this.value.compareTo(o.value);
    }
}
