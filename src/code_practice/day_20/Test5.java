package code_practice.day_20;

/**
 * @author guoyao
 * @create 2020/6/18
 */
public class Test5 {

    //判断子树
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if(t1 == null){
            return t2 == null;
        }
        return sameTree(t1, t2)
                || checkSubTree(t1.left,t2)
                || checkSubTree(t1.right, t2);


    }

    //判断两棵树是否相等
    public boolean sameTree(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1 == null || t2 == null){
            return false;
        }
        return t1.val == t2.val
                && sameTree(t1.left, t2.left)
                && sameTree(t1.right, t2.right);
    }

}
