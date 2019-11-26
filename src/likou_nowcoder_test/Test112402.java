package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/24
 */
public class Test112402 {
    //镜像树
    public void Mirror(TreeNode root) {
        if(root==null){
            return ;
        }
       TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        Mirror(root.left);
        Mirror(root.right);
    }

    //火车进站
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int [] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=scanner.nextInt();
            }

        }
    }

}
