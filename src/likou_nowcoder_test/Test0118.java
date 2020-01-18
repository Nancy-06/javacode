package likou_nowcoder_test;

/**
 * @author guoyao
 * @create 2020/1/18
 */
public class Test0118 {
    //实现函数 ToLowerCase() ，该函数接收一个字符串参数 str ，并将该字符串中的大写字母转换成小写字母，
    //之后返回新的字符串 。
    public static String toLowerCase(String str){
        return str.toLowerCase();
    }


    //旋转数组
    // 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
    public void rotate(int []nums,int k){
        int length=nums.length;
        k%=length;
        for(int i=0;i<k;i++){
            int temp=nums[length-1];
            for(int j=length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
        }
    }
    public static void main(String[] args) {
        System.out.println(toLowerCase("HELLO"));
    }
}
