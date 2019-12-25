package Test1210;

import com.sun.jmx.snmp.internal.SnmpSubSystem;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/12/25
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password="1234";
        String name="1";
        int k=3;
        while(k!=0){
            String na=scanner.nextLine();
            String pw=scanner.nextLine();
            k--;
            if(na.equals(name)&&pw.equals(password)){
                System.out.println("输入成功");
                break;
            }
            else if(k!=0){
                System.out.println("请重新输入");
            }
        }
        if(k==0){
            System.out.println("密码错误，没有机会了");
        }
    }
}
