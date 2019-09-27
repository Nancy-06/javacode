package Test0925;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.util.*;

public class TreesOrNot {
    //非递归先序遍历
    public static void preorder(Node root){
        Stack<Node> stack=new Stack<>();
        Node cur=root;
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                System.out.println(cur.value);
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
            System.out.println(cur.value);
            Node top=stack.pop();
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
                System.out.println(top);
                last=top;
            }
            else{
                cur=top.right;
            }
        }
    }
}
