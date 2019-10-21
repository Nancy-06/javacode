package Practices;

import java.text.SimpleDateFormat;
import java.util.Date;

//打印当前时间
public class TimeDemo {
    public static void main(String[] args) throws Exception{
        while(true){
            Date date=new Date();
            SimpleDateFormat fmt=new SimpleDateFormat("Y-M-d HH:mm:ss");
            System.out.println(fmt.format(date));
            Thread.sleep(1000);//每隔一秒输出
        }

    }
}
