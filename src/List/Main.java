package List;

public class Main {
    public static void main(String[] args) {
        MyArrayList myarraylist=new MyArrayList();
        Iterator it=myarraylist.iterator();
        myarraylist.add(3);
        myarraylist.add(1,4);
        int val1=myarraylist.get(0);
        int val2=myarraylist.get(1);
        int size=myarraylist.size();
        while(it.hasNext()){
            System.out.println(it.next());
        }
     }

}