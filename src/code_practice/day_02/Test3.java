package code_practice.day_02;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/2
 */
public class Test3 {

    //在霍格奥茨找零钱
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] s1= scanner.next().split("[.]");
        String [] s2=scanner.next().split("[.]");
        int s1Knut=(Integer.valueOf(s1[0])*17+
                Integer.valueOf(s1[1]))*29+Integer.valueOf(s1[2]);
        int s2Knut=(Integer.valueOf(s2[0])*17+
                Integer.valueOf(s2[1]))*29+Integer.valueOf(s2[2]);
        int num=s2Knut-s1Knut;
        int knut=num%29;
        int sickle=num/29%17;
        int galleon=num/29/17;
        System.out.println(galleon+"."+
                Math.abs(sickle)+"."+Math.abs(knut));
    }
}
