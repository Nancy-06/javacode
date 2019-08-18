package List;

public class Main {
    private static void test(List list){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.set(1,200));
        System.out.println(list);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());


    }

    public static void main(String[] args) {
        MyArrayList arrayList=new MyArrayList();
        MyLinkedList likedList=new MyLinkedList();
        test(arrayList);
        test(likedList);
    }

}