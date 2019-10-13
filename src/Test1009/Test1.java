package Test1009;
//输出0到n中数字2出现了几次
public class Test1 {
    public static int countNumberOf2s(int  n) {
        int count=0;
        while(n!=0){
            if(n%10==2){
                count++;
            }
            if((n/10)%10==2) {
                count++;
            }
            n--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumberOf2s(22));
    }
}
