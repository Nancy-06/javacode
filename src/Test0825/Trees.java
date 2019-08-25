package Test0825;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Trees {
    //根据先序+中序数组确定二叉树（利用数组）
    public static Node  buildTree1(char [] preorder,char [] inorder) {
        if(preorder.length==0){
            return null;
        }
        char rootValue=preorder[0];
        int leftCount=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==rootValue){
                leftCount=i;
            }
        }
        char [] leftPreorder= Arrays.copyOfRange(preorder,1,leftCount+1);
        char [] leftInorder=Arrays.copyOfRange(inorder,0,leftCount);
        char [] rightPreorder=Arrays.copyOfRange(preorder,leftCount+1,preorder.length);
        char [] rightInorder=Arrays.copyOfRange(inorder,leftCount+1,inorder.length);
        Node root=new Node(rootValue);
        Node left=buildTree1(leftPreorder,leftInorder);
        Node right=buildTree1(rightPreorder,rightInorder);
        root.left=left;
        root.right=right;
        return root;
    }
    //根据中序+后序确定二叉树（数组）
    public static Node buildTree2(char [] inorder,char [] postorder){
        if(inorder.length==0){
            return null;
        }
        char rootValue=postorder[postorder.length-1];
        int leftCount=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==rootValue){
                leftCount=i;
            }
        }
        char [] leftInorder=Arrays.copyOfRange(inorder,0,leftCount);
        char [] leftPostorder=Arrays.copyOfRange(postorder,0,leftCount);
        char [] rightInorder=Arrays.copyOfRange(inorder,leftCount+1,inorder.length);
        char [] rightPostorder=Arrays.copyOfRange(postorder,leftCount,postorder.length-1);
        Node root=new Node(rootValue);
        Node left=buildTree2(leftInorder,leftPostorder);
        Node right=buildTree2(rightInorder,rightPostorder);
        root.left=left;
        root.right=right;
        return root;
    }
    //只利用“前序”构建二叉树
    public static class ReturnValue{
        Node root;
        int used;
    }
    public static ReturnValue buildTreePreorder(List<Character> preorder){
        if(preorder.size()==0){
            ReturnValue rv=new ReturnValue();
            rv.root=null;
            rv.used=0;
            return rv;
        }
        char rootValue=preorder.get(0);
        if(rootValue=='#'){
            ReturnValue rv=new ReturnValue();
            rv.root=null;
            rv.used=1;
            return rv;
        }
        ReturnValue leftPreoder=buildTreePreorder(preorder.subList(1,preorder.size()));
        ReturnValue rightPreorder=buildTreePreorder(preorder.subList(1+leftPreoder.used,preorder.size()));
        Node root=new Node(rootValue);
        root.left=leftPreoder.root;
        root.right=rightPreorder.root;
        ReturnValue rv=new ReturnValue();
        rv.root=root;
        rv.used=1+leftPreoder.used+rightPreorder.used;
        return rv;
    }
    public static void main(String[] args) {
        char[] preorder={'A','B','D','E','G','C','F','H'};
        char [] inorder={'D','B','G','E','A','C','F','H'};
        char [] postorder={'D','G','E','B','H','F','C','A'};
        List<Character> preoder1=Arrays.asList('A','B','C','#','#','#','D','#','E','#','#');
        Node root=buildTree1(preorder,inorder);
        Node root1=buildTree2(inorder,postorder);
        ReturnValue root2=buildTreePreorder(preoder1);
        System.out.println("成功");
    }
}
