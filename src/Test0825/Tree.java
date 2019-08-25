package Test0825;

import com.sun.deploy.xml.XMLNodeBuilder;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
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
    //层次遍历
    public static void levelOrderTraversal(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node front=queue.remove();
            System.out.println(front.value);
            if(front.left!=null){
               queue.add(front.left);
            }
            if(front.right!=null){
                queue.add(front.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root=buildTrue();
        levelOrderTraversal(root);
    }
}
