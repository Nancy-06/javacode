package code_practice.day_17;

/**
 * @author guoyao
 * @create 2020/5/21
 */


public class Test11 {
    //左旋转字符串
    public String reverseLeftWords(String s, int n) {

        if(s == "" || s == null){
            return null;
        }
        char [] ch = new char[n];
        for(int i=0;i<n;i++){
            ch[i] = s.charAt(i);
        }
        String s1 =  s.substring(n-1);
        StringBuffer sb = new StringBuffer(s1);
        sb.append(ch);
        return sb.toString();
    }

    public String reverseLeftWords2(String s, int n){
        return s.substring(n)+s.substring(0,n);
    }

    //打印从1到最大的n位数
    public int[] printNumbers(int n) {

        int result = (int)Math.pow(10,n);
        int [] array = new int [result-1];
        for(int i = 0;i < result-1 ; i++){
            array[i] = i+1;
        }
        return array;
    }
}
