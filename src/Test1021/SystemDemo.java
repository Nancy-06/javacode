package Test1021;

import java.util.*;

//System类
public class SystemDemo {
    public static void main(String[] args) {
        /**
       // System类的getProperties()用于获取当前系统的全部属性
        //获取当前系统的全部属性
        Properties proterties=System.getProperties();
        //获得所有系统属性的key，返回Enumeration对象
        Enumeration propertyName=proterties.propertyNames();
        while(propertyName.hasMoreElements()){
            //获取系统属性的键key
            String key=(String)propertyName.nextElement();
            //获取当前键key对应的value
            String value=System.getProperty(key);
            System.out.println(key+"--->"+value);
        }
         **/
        //System类的currentTimeMillis()方法，
        // 返回一个long类型的值，该值表示当前时间与1970年1月1日0点0分0秒之间的时间差，单位是毫秒，也称为时间戳
        long startTime=System.currentTimeMillis();         //循环开始当前的时间
        int sum=0;
        for(int i=0;i<100000000;i++){
            sum+=i;
        }
        long endTime=System.currentTimeMillis();          //循环结束后的当前时间
        System.out.println("程序运行的时间为："+(endTime-startTime)+"毫秒");
    }
}
