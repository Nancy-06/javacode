package Test1014;
//多态
public class Test2 {
    int x;
    int y;
    int z;
    void print(int x){
        System.out.println(x);
    }
    void print(int x,int y){
        System.out.println(x+y);
    }
    void print(int x,int y,int z){
        System.out.println(x+y+z);
    }

    public static void main(String[] args) {
        Test2 t=new Test2();
        t.print(2);
        t.print(2,3);
        t.print(2,3,4);
    }
}
