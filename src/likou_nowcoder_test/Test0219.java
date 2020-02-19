package likou_nowcoder_test;

/**
 * @author guoyao
 * @create 2020/2/19
 */
public class Test0219 {
    //1.求二叉树结点的个数
    public static int count=0;
    public static void calcCount1(TreeNode root){
        if(root==null){
            return;
        }
        calcCount1(root.left);
        count++;
        calcCount1(root.right);
    }
    public static int calcCount2(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=calcCount2(root.left);
        int right=calcCount2(root.right);
        return left+right+1;
    }
    //2.求二叉树中叶子结点的个数
    public static int leafCount=0;
    public static void calcLeafCount1(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            leafCount++;
        }
        calcCount2(root.left);
        calcCount2(root.right);
    }
    public static int calcLeafCount2(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int left=calcCount2(root.left);
        int right=calcCount2(root.right);
        return left+right;
    }
}
