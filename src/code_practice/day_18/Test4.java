package code_practice.day_18;

/**
 * @author guoyao
 * @create 2020/5/25
 */
public class Test4 {


    public String reverseWords(String s) {
//        //去掉s的前面和后面的空格
        //字符串前面有空格，split会分割为一个""
//        s = s.trim();
        String [] str = s.split("");
        StringBuffer sb = new StringBuffer();
        for(int i = str.length-1; i>=0; i--){
            if(str[i].equals(" ")){
                continue;
            }
            if(i == 0){
                sb.append(str[i].trim());
            }else{
                sb.append(str[i].trim()).append(" ");
            }
        }
        return sb.toString();
    }
}
