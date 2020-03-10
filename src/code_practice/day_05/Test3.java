package code_practice.day_05;

/**
 * @author guoyao
 * @create 2020/3/10
 */

//空格替换
public class Test3 {
    public static String replaceSpace(String iniString, int length) {
        StringBuffer sb=new StringBuffer(iniString);
        char [] ch={'%','2','0'};
        for(int i=0;i<length;i++){
            if(sb.charAt(i)==' '){
                sb.deleteCharAt(i);
                length--;
                sb.insert(i,ch);
                length+=ch.length;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str="Hello  world";
        System.out.println(replaceSpace(str,12));
    }
}
