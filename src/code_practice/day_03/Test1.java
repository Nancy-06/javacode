package code_practice.day_03;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/3/3
 */
public class Test1 {

    //寻找第K大
    public static int findKth(int [] a,int n,int k){
        Arrays.sort(a);
        int result=0;
        int i;
        for(i=n-1;i>0;i--){
            if(a[i]==a[i-1]){
                continue;
            }
            else{
                result+=1;
                if(result==k){
                    break;
                }
            }
        }
        return a[i];
    }

    //快排的思想(大的数在前，小的数在后)
    public static  int findK(int [] a,int n,int k){
        return find(a,0,n-1,k);
    }

    private static  int find(int[] a, int low, int high, int k) {
        int part=partatin(a,low,high);
        if(k==part-low+1){
            return a[part];
        }
        else if(k>part-low+1){
            return find(a,part+1,high,k-part+low-1);
        }
        else{
            return find(a,low,part-1,k);
        }
    }

    private static int partatin(int[] a, int low, int high) {
        int key=a[low];
        while(low<high){
            while(low<high&&a[high]<=key){
                high--;
            }
            a[low]=a[high];
            while(low<high&&a[low]>=key){
                low++;
            }
            a[high]=a[low];
        }
        a[low]=key;
        return low;
    }

    public static void main(String[] args) {
        int [] a={3,4,2,1,5,7,4};
        System.out.println(findK(a,7,7));
    }
}
