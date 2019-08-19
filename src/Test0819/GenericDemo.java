package Test0819;

public class GenericDemo<T> {
    private T f;
    private void set (T f){
        this.f=f;
    }
    public T get(){
        return f;
    }

    public static void main(String[] args) {
        GenericDemo<Boolean> f1=new GenericDemo<>();
        f1.set(new Boolean(false));
        Boolean b1=f1.get();
        System.out.println(b1);
        GenericDemo<Integer> f2=new GenericDemo<>();
        f2.set(new Integer(10));
       Integer b2=f2.get();
        System.out.println(b2);

    }
}
