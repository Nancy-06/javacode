package code_practice.day_05;

/**
 * @author guoyao
 * @create 2020/3/10
 */
public class Test4 {

    //最近公共祖先
    public static int getLCA(int a, int b) {
        while(a!=b){
            if(a>b){
                a=a/2;
            }
            else{
                b=b/2;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getLCA(11,2));
    }
}
