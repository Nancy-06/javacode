package code_practice.day_01;

/**
 * @author guoyao
 * @create 2020/2/29
 */
public class Test1 {
    //数组中的逆序对
    //法1：暴力法
    public static int count(int [] array,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]>array[j]){
                    sum=sum+1;
                }
            }
        }
        return sum;
    }
    //法2：分治思想
    public static int count1(int [] array,int n){
        if(array==null||n==0){
            return 0;
        }
        return mergeSort(array,0,n-1);
    }

    private static int mergeSort(int[] array, int l, int r) {
        if(l==r){
            return 0;
        }
       int mid=(l+r)/2;
        //逆序对的总数=左边数组中的逆序对的数量+右边数组中逆序对的数量
        // +左右结合成新的顺序数组时中出现的逆序对的数量；
        return mergeSort(array,l,mid)+mergeSort(array,mid+1,r)+
                marge(array,l,mid,r);

    }

    private static int marge(int[] array, int left,int mid, int right) {
        int [] temp=new int [right-left+1];
        int index=0;
        int i=left;
        int j=mid+1;
        //新增，用来累加数组逆序对
        int inverseNum=0;
        while(i<=mid&&j>=right){
            if(array[i]<=array[j]){
                temp[index++]=array[i++];
            }
            else{
                //当前一个数组元素大于后一个数组元素时，累加逆序对
                //s[i]>s[j]  推导出 s[i]…s[mid]>s[j]
                inverseNum+=(mid-i+1);
                temp[index++]=array[j+1];
            }
        }
        while(i<=mid){
            temp[index++]=array[i++];
        }
        while(j<=right){
            temp[index++]=array[j++];
        }
        for(int k=0;k<temp.length;k++){
            array[left++]=temp[k];
        }
        return inverseNum;
    }
    
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,0};
        System.out.println(count(array,array.length));
    }
}
