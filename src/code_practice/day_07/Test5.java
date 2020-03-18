package code_practice.day_07;


import java.util.*;


/**
 * @author guoyao
 * @create 2020/3/15
 */
 //找出两个字符串中不一样的字符(坏键盘打字)
public class Test5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String originalString=sc.nextLine();
        String typedOutString=sc.nextLine();
        ArrayList<Character> wornOutKeys=new ArrayList<>();
        int size=originalString.length();
        int iOriginal=0;
        int iTypedOut=0;
        while(iOriginal<size){
            //假如没有损坏
            boolean wornOut=false;
            char originalCh=originalString.charAt(iOriginal);
            //全部大写
            char originalUpper=Character.toUpperCase(originalCh);
            if(iTypedOut>=typedOutString.length()){
                //输出的字符串已经结束了
                wornOut=true;
            }
            else{
                char typedOutCh=typedOutString.charAt(iTypedOut);
                char typedOutUpper=Character.toUpperCase(typedOutCh);
                if(originalUpper!=typedOutUpper){
                    //应该看到输出的字符没有输出
                    wornOut=true;
                }
            }
            if(wornOut){
                if(!wornOutKeys.contains(originalUpper)){
                    wornOutKeys.add(originalUpper);
                }
                iOriginal++;
            }
            else{
                iOriginal++;
                iTypedOut++;
            }
        }
        for(int i=0;i<wornOutKeys.size();i++){
            System.out.print(wornOutKeys.get(i));
        }
        System.out.println();
    }


}
