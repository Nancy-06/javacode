package likou_nowcoder_test;

/**
 * @author guoyao
 * @create 2020/2/23
 */
public class Test0223 {
    //1299:将每个元素替换为右侧最大的元素
    public int[] replaceElements(int[] arr) {
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            int cur=arr[i];
            arr[i]=max;
            max=Math.max(cur,max);
        }
        return arr;
    }
    public int[] replaceElements1(int[] arr) {
       if(arr.length==1){
           arr[0]=-1;
       }
        for(int i=0;i<arr.length-1;i++){
            int max=arr[i+1];
            for(int j=i+1;j<arr.length;j++){
                if(max<arr[j]){
                    max=arr[j];
                }
            }
            arr[i]=max;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}
