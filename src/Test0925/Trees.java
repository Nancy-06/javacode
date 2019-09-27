package Test0925;

public class Trees {
    //递归先序遍历
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }
    //递归中序遍历
    public static void inorder( Node root){
        if(root==null){
            return;
        }
        preorder(root.left);
        System.out.println(root.value);
        preorder(root.right);
    }
    //递归后序遍历
    public static void postorder( Node root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.println(root.value);
    }
}
