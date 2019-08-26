package Test0825;

import java.util.Scanner;

class ReturnValue{
    Node root;
    int used;
}
public class Main {
    private static ReturnValue buildTree(char [] preorder){
        return null;
    }
    private static void inorderTraversal(Node root){
        if(root==null){
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.value+"");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String preorderLine=scanner.nextLine();
        char [] preorder=preorderLine.toCharArray();
        ReturnValue rv=buildTree(preorder);
        inorderTraversal(rv.root);
        System.out.println(rv.used);
    }
}
