package Test0920;

public class Test1 {
    public  void judge(int year){
        String[] array={"鼠","牛","虎","兔","龙","蛇","马","羊","猴","鸡","狗","猪"};
        int val=Math.abs(year-2008)%12;
       for(int i=0;i<array.length;i++){
           if(i==val){
               System.out.println(array[i]);
           }
       }
    }

    public static void main(String[] args) {
        Test1 test=new Test1();
        test.judge(1960);
    }
}
