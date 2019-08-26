package Test0825;

import java.util.Arrays;
import java.util.List;

public class Solution {
    //求树的高度
    public static int treeHeight(Node root){
        if(root==null){
            return 0;
        }
        int left=treeHeight(root.left);
        int right=treeHeight(root.right);
        int height=Math.max(left,right)+1;
        return height;
    }
    //判断是否为平衡二叉树
    public static boolean isBalanced(Node root){
        if(root==null){
            return true;
        }
        boolean leftBalance=isBalanced(root.left);
        if(!leftBalance){
            return false;
        }
        boolean rightBalance=isBalanced(root.right);
        if(!rightBalance){
            return false;
        }
        int leftHeight=treeHeight(root.left);
        int rightHeight=treeHeight(root.right);
        int count=leftHeight-rightHeight;
        if(count==1||count==0||count==-1){
            return true;
        }
        return false;
    }
    //二叉树的最近公共祖先
    public static boolean search(Node root,Node p){
        if(root==null){
            return false;
        }
        if(root==p){
            return true;
        }
        if(search(root.left,p)){
            return true;
        }
        if(search(root.right,p)){
            return true;
        }
        return false;
    }
    public static Node lowestCommonAncestor(Node root,Node p,Node q){
        if(root==p||root==q){
            return root;
        }
        boolean pInleft=search(root.left,p);
        boolean qInleft=search(root.left,q);
        if(pInleft&&qInleft){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(!pInleft&&!qInleft){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
    //二叉树创建字符串
    public static void preorder(StringBuilder sb,Node root){
        if(root==null){
            return;
        }
        sb.append("(");
        sb.append(root.value);
        if(root.left==null&&root.right!=null){
            sb.append("()");
        }
        else{
            preorder(sb,root.left);
        }
        preorder(sb,root.right);
        sb.append(")");
    }
    public static String tree2(Node t){
        if(t==null){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        preorder(sb,t);
        String r=sb.toString();
        return r.substring(1,r.length()-1);
    }

    public static Node buildTree1(){
        Node n1=new Node('A');
        Node n2=new Node('B');
        Node n3=new Node('C');
        Node n4=new Node('D');
        Node n5=new Node('E');
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        return n1;
    }
    public static void main(String[] args) {
        System.out.println(isBalanced(buildTree1()));
        Node n1=new Node('A');
        Node n2=new Node('B');
        Node n3=new Node('C');
        Node n4=new Node('D');
        Node n5=new Node('E');
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        System.out.println(lowestCommonAncestor(n1,n4,n5).value);
        System.out.println(tree2(buildTree1()));
    }
}
