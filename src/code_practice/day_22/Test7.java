package code_practice.day_22;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/7/31
 */
public class Test7 {

    //实现递归的二分算法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        int cur = sc.nextInt();
        System.out.println(search(array,0, n-1, cur));
    }

    private static int search(int[] array,int start, int end, int cur) {

        int mid = (start + end) / 2;
        if(start > end){
            return -1;
        }
        if(cur > array[mid]){
            return search(array, mid +1, end, cur);
        }
        else if(cur < array[mid]){
            return search(array, start, mid - 1, cur);
        }
        else if(cur == array[mid]){
            return mid;
        }
        return -1;
//        int right = end;
//        int left = 0;
//
//        while(left <= right){
//            int mid = (right - left)/2 + left;
//            if(array[mid] < cur){
//                left++;
//            }
//            else if(array[mid] > cur){
//                right--;
//            }
//           else if(array[mid] == cur){
//                return mid;
//            }
//        }
//        return -1;
    }
}

