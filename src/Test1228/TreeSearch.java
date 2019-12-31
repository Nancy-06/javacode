package Test1228;

/**
 * @author guoyao
 * @create 2019/12/31
 */
//二叉树搜索
class TreeNode{
    double value;
    TreeNode left;
    TreeNode right;

}

public class TreeSearch {
    //在二叉树里插入结点
    static TreeNode root=null;
    public static void insert(double data) {
        TreeNode p=new TreeNode();
        p.value=data;
        if(root==null){
            root=p;
        }
        else {
            TreeNode q = new TreeNode();
            TreeNode current = root;
            while (true) {
                q = current;
                if (data > current.value) {
                    current=current.right;
                    if(current==null){
                        q.right=p;
                        return;
                    }
                }
                else{
                    current=current.left;
                    if(current==null){
                        q.left=p;
                        return;
                    }
                }
            }
        }
    }

    //查找值，返回要查找的值
    public static boolean treeSerch(TreeNode current,double n){
        while(current==null){
            return false;
        }
        if(current.value==n){
            return true;
        }
        if(treeSerch(current.left,n)){
            return true;
        }
        if(treeSerch(current.right,n)){
            return true;
        }
        return false;

    }
    public static void inorder(TreeNode head){
        if(head==null){
            return;
        }
        inorder(head.left);
        System.out.println(head.value);
        inorder(head.right);
    }
    public static void main(String[] args) {
        float [] array={3,4,5,2,1,7,8};
        for(int i=0;i<array.length;i++){
            insert(array[i]);
        }
        // inorder(root);
        System.out.println(treeSerch(root,8));
    }
}

