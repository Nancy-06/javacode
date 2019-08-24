package Test0824;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.Arrays;
import java.util.List;

public class Tree {
    //根据前序和中序确定树
    public static Node buildTree1(List<Character> preorder,List<Character> inorder){
        if(preorder.size()==0){
            return null;
        }
        char rootValue=preorder.get(0);
        int leftCount=inorder.indexOf(rootValue);
        Node root=new Node(rootValue);
        List<Character> leftPreorder=preorder.subList(1,1+leftCount);
        List<Character> leftInorder=inorder.subList(0,leftCount);
        Node left=buildTree1(leftPreorder,leftInorder);
        root.left=left;
        List<Character> rightPreorder=preorder.subList(1+leftCount,preorder.size());
        List<Character> rightInorder=inorder.subList(leftCount+1,inorder.size());
        Node right=buildTree1(rightPreorder,rightInorder);
        root.right=right;
        return root;
    }
    //根据中序和后序确定树
    public static Node buildTree2(List<Character> inorder,List<Character> postorder){
        if(inorder.size()==0){
            return null;
        }
        char rootValue=postorder.get(postorder.size()-1);
        int leftCount=inorder.indexOf(rootValue);
        Node root=new Node(rootValue);
        List<Character> leftInorder=inorder.subList(0, leftCount);
        List<Character> leftPostorder=postorder.subList(0,leftCount);
        Node left=buildTree2(leftInorder,leftPostorder);
        root.left=left;
        List<Character> rightInorder=inorder.subList(leftCount+1,inorder.size());
        List<Character> rightPostorder=postorder.subList(leftCount,postorder.size()-1);
        Node right=buildTree2(rightInorder,rightPostorder);
        root.right=right;
        return root;
    }
    public static void main(String[] args) {
        List<Character> preorder= Arrays.asList('A','B','D','E','G','C','F','H');
        List<Character> inorder=Arrays.asList('D','B','G','E','A','C','F','H');
        List<Character> postorder=Arrays.asList('D','G','E','B','H','F','C','A');
        Node root=buildTree1(preorder,inorder);
        Node root1=buildTree2(inorder,postorder);
        System.out.println("成功");

    }
}

