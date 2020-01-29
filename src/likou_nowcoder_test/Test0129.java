package likou_nowcoder_test;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/1/29
 */
public class Test0129 {
    //力扣917：仅仅反转字母
    public static String reverseOnlyLetters(String S) {
        char [] ch=S.toCharArray();
        for(int i=0,j=S.length()-1;i<j;i++,j--){
            while(i<j){
                if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z') {
                    break;
                }
                else{
                    i++;
                }

            }
            while(i<j){
                if (ch[j] >= 'a' && ch[j] <= 'z' || ch[j] >= 'A' && ch[j] <= 'Z') {
                    break;
                }
                else{
                    j--;
                }
            }
            char c=ch[i];
            ch[i]=ch[j];
            ch[j]=c;
        }
        return new String (ch);
    }

    //力扣905：按奇偶排序树组
    public static int[] sortArrayByParity(int[] A) {
        for (int i = 0, j = A.length - 1; i < j; i++, j--) {
            while (i < j) {
                if (A[i] % 2 == 1) {
                    break;
                } else {
                    i++;
                }
            }
            while (i < j) {
                if (A[j] % 2 == 0) {
                    break;
                } else {
                    j++;
                }
            }
            int n = A[i];
            A[i] = A[j];
            A[j] = n;
        }
        return A;
    }
    public static void main(String[] args) {
        String s="acnei-rfvr";
        //System.out.println(reverseOnlyLetters(s));
        int [] A={3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(A)));
    }
}
