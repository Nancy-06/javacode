package code_practice.day_19;

import java.util.Stack;

/**
 * @author guoyao
 * @create 2020/6/7
 */
public class Test4 {

    //后继者
    TreeNode result, pre;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null || p == null || result != null){
            return null;
        }
        inorderSuccessor(root.left,p);
        if( pre == p){
            result = root;
        }
        pre = root;
        if(result == null){
            inorderSuccessor(root.right,p);
        }
        return result;
    }

    //整数的各位积和之差
    public int subtractProductAndSum(int n) {
//        String s = String.valueOf(n);
//        char [] ch = s.toCharArray();
//        int sum = 0;
//        int product = 1;
//        for(int i = 0; i < ch.length; i++){
//            sum += (ch[i]-48);
//            product *= (ch[i]-48);
//        }
//        return (product-sum);


        int product = 1;
        int sum = 1;
        while( n != 0){
            product *= n%10;
            sum += n%10;
            n/=10;
        }
        return product-sum;
    }
}
