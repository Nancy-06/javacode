package code_practice.day_03;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/4
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int jia_win=0,jia_ping=0,jia_lose=0,
                yi_win=0,yi_ping=0,yi_lose=0;
        int jia_win_c=0, jia_win_j=0, jia_win_b=0,
                yi_win_c=0,  yi_win_j=0,yi_win_b=0;
        char a,b,c,d;
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++) {
            a = scanner.next().charAt(0);
            b = scanner.next().charAt(0);
            //甲赢
            if (a == 'C' && b == 'J') {
                jia_win++;
                yi_lose++;
                jia_win_c++;
            }
            //甲赢
            if (a == 'J' && b == 'B') {
                jia_win++;
                yi_lose++;
                jia_win_j++;
            }
            //甲赢
            if (a == 'B' && b == 'C') {
                jia_win++;
                yi_lose++;
                jia_win_b++;
            }
            //乙赢
            if (a == 'J' && b == 'C') {
                jia_lose++;
                yi_win++;
                yi_win_c++;
            }
            //乙赢
            if (a == 'B' && b == 'J') {
                jia_lose++;
                yi_win++;
                yi_win_j++;
            }
            //乙赢
            if (a == 'J' && b == 'B') {
                jia_lose++;
                yi_win++;
                yi_win_b++;
            }
            //平
            if (a == 'J' && b == 'J') {
                jia_ping++;
                yi_ping++;
            }
            //平
            if (a == 'B' && b == 'B') {
                jia_ping++;
                yi_ping++;
            }
            //平
            if (a == 'C' && b == 'C') {
                jia_ping++;
                yi_ping++;
            }
        }
        //求甲最大的获胜手势
        if(jia_win_b>=jia_win_j){
            if(jia_win_b>=jia_win_j){
                c='B';
            }
            else{
                c='J';
            }
        }
        else{
            if(jia_win_c>=jia_win_j){
                c='C';
            }
            else{
                c='J';
            }
        }
        //求乙最大的获胜手势
        if(yi_win_b>=yi_win_j){
            if(yi_win_b>=yi_win_j){
                d='B';
            }
            else{
                d='J';
            }
        }
        else{
            if(yi_win_c>=yi_win_j){
                d='C';
            }
            else{
                d='J';
            }
        }
        System.out.println(jia_win+" "+jia_ping+" "+jia_lose);
        System.out.println(yi_win+" "+yi_ping+" "+yi_lose);
        System.out.println(c+" "+d);
    }
}
