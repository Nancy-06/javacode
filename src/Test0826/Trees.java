package Test0826;

import java.util.Stack;

public class Trees {
    public static Node buildTrue(){
        Node n1=new Node('A');
        Node n2=new Node('B');
        Node n3=new Node('C');
        Node n4=new Node('D');
        Node n5=new Node('E');
        Node n6=new Node('F');
        Node n7=new Node('G');
        Node n8=new Node('H');
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;

        n2.right=n5;
        n3.left=n6;
        n3.right=n7;
        n5.right=n8;
        return n1;
    }
    //非递归先序遍历
    public static void preorder(Node root){
        Stack<Node> stack=new Stack<>();
        Node cur=root;
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                System.out.print(cur.value);
                stack.push(cur);
                cur=cur.left;
            }
            Node top=stack.pop();
            cur=top.right;
        }
    }
    //非递归中序遍历
    public static void inorder(Node root){
        Stack<Node> stack=new Stack<>();
        Node cur=root;
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            Node top=stack.pop();
            System.out.print(top.value);
            cur=top.right;
        }
    }
    //非递归后序遍历
    public static void postorder(Node root){
        Stack<Node> stack=new Stack<>();
        Node cur=root;
        Node last=null;
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            Node top=stack.peek();
            if(top.right==null||top.right==last){
                stack.pop();
                System.out.print(top.value);
                last=top;
            }
            else{
                cur=top.right;
            }
        }
    }

    public static void main(String[] args) {
        Node root=buildTrue();
        System.out.print("先序遍历：");
        preorder(root);
        System.out.println();
        System.out.print("中序遍历：");
        inorder(root);
        System.out.println("");
        System.out.print("后序遍历：");
        postorder(root);
    }
}
