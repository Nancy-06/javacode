package code_practice.day_17;

/**
 * @author guoyao
 * @create 2020/5/17
 */
public class Test6 {

    //连续的最长公共子字符串
    public static String judge(String s1,String s2){
        if(s1==null||s2==null){
            return null;
        }
        if(s1==""||s2==""){
            return null;
        }
        String max=null;
        String min=null;
        if(s1.length()<s2.length()){
            min=s1;
            max=s2;
        }else{
            min=s2;
            max=s1;
        }
        String result=null;
        for(int i=0;i<min.length();i++){
            for(int start=0,end=min.length()-i;end<=min.length();start++,end++){
                result=min.substring(start,end);
                if (max.contains(result)) {
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String s1="abcdefg";
        String s2="adefgwgrweg";
        String result=judge(s1,s2);
        System.out.println(result);
    }
}
