package likou_nowcoder_test;

/**
 * @author guoyao
 * @create 2020/1/21
 */
public class Test0121 {
    //力扣58：最后一个单词的长度
    public static int lengthOfLastWord(String s) {
        if(s==null){
            return 0;
        }
        String [] str=s.split(" ");
        if(str.length==0){
            return 0;
        }
        String index=str[str.length-1];
        return index.length();
    }

    //力扣88.合并两个有序数组
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int f1=m-1;
        int f2=n-1;
        int f=n+m-1;
        while(f1>=0&&f2>=0){
            if(nums1[f1]>nums2[f2]){
                nums1[f]=nums1[f1];
                f1--;
            }
            else{
                nums1[f]=nums2[f2];
                f2--;
            }
            f--;
        }
        while(f2>=0){
            nums1[f]=nums2[f2];
            f2--;
            f--;
        }
    }
    public static void main(String[] args) {
        //System.out.println(lengthOfLastWord(""));
        int [] nums1={1,2,3};
        int[] nums2={2,3,6};
        merge(nums1,3,nums2,3);
        System.out.println(nums1.toString());
    }
}
