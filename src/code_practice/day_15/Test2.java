package code_practice.day_15;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/22
 */

//36857--整数与IP地址间的转换
public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            //输入IP地址字符串
            String ip=sc.nextLine();
            //输入10进制表示的IP地址字符串
            String ip10=sc.nextLine();
            //IP地址转换为10进制字符串
            System.out.println(convertIp10(ip));
            //进制IP地址转换为IP地址
            System.out.println(convertIp(ip10));
        }
    }


    //IP地址转换为10进制字符串
    private static long convertIp10(String ip) {
        String [] ips=ip.split("\\.");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<ips.length;i++){
            sb.append(binaryString(ips[i]));
        }
        return Long.parseLong(sb.toString(),2);
    }

    //十进制转换为8位二进制
    private static String binaryString(String s ) {
        StringBuffer sb=new StringBuffer();
        int num=Integer.parseInt(s);
        int k=1<<7;
        for(int i=0;i<8;i++){
            int flag=(num&k)==0?0:1;
            sb.append(flag);
            num=num<<1;
        }
        return sb.toString();
    }

    //进制IP地址转换为IP地址
    private static String convertIp(String ip10) {
        StringBuffer sb=new StringBuffer();
        //长整型转二进制字符串（JDK Long的静态方法 ）
        String ip2=Long.toBinaryString(Long.parseLong(ip10));
        String as="";
        if(ip2.length()<32){
            for(int i=0;i<32-ip2.length();i++){
                as+="0";
            }
        }
        ip2=as+ip2;
        //IP地址每一段进行拼接
        String [] ips=new String [4];
        ips[0]=ip2.substring(0,8);
        ips[1]=ip2.substring(8,16);
        ips[2]=ip2.substring(16,24);
        ips[3]=ip2.substring(24);
        for(int i=0;i<4;i++){
            sb.append(Integer.parseInt(ips[i],2));
            if(i!=3){
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
