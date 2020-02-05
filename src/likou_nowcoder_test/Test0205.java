package likou_nowcoder_test;

/**
 * @author guoyao
 * @create 2020/2/5
 */
public class Test0205 {
    //力扣125：验证回文串
    public static boolean isPalindrome(String s) {
        if(s==null){
            return true;
        }
        s=s.toLowerCase();
        int length=s.length();
        StringBuffer sb=new StringBuffer(length);
       char [] ch=s.toCharArray();
       for(int i=0;i<length;i++){
           if((ch[i]>='0'&&ch[i]<='9')||(ch[i]>='a'&&ch[i]<='z')){
               sb.append(ch[i]);
           }
       }
       String a=sb.toString();
       String b=sb.reverse().toString();
       if(a.equals(b)){
           return true;
       }
       return false;
    }

    //力扣443：压缩字符串
    public static int compress(char[] chars) {
        int count=0;
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            int j=1;
            while(i+1<chars.length&&chars[i+1]==ch){
                j++;
                i++;
            }
            chars[count++]=ch;
            if(j>1){
              String s=Integer.toString(j);
             for(int k=0;k<s.length();k++){
                 chars[count++]=s.charAt(k);
             }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s="race a car";
        //System.out.println(isPalindrome(s));
        char [] ch={'a','a','b','b','b'};
        System.out.println(compress(ch));
    }
}
