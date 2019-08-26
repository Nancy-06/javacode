package Test0825;

public class SBDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("I");
        sb.append("love");
        sb.append("java");
        String s="I"+"love"+"java";
        System.out.println(sb.toString());
        System.out.println(s);
    }
}
