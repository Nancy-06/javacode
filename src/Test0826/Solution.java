package Test0826;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
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
    //层次遍历利用二维数组形式写出
    public static class Element{
        int level;
        Node node;
    }
    public static List<List<Character>>levelOrder(Node root){
        List<List<Character>> retList=new ArrayList<>();
        if(root==null){
            return retList;
        }
        Queue<Element> queue=new LinkedList<>();
        Element e=new Element();
        e.node=root;
        e.level=0;
        queue.add(e);
        while(!queue.isEmpty()){
            Element front=queue.remove();
            if(front.level==retList.size()){
                retList.add(new ArrayList<>());
            }
            retList.get(front.level).add(front.node.value);

            if(front.node.left!=null){
                Element l=new Element();
                l.node=front.node.left;
                l.level=front.level+1;
                queue.add(l);
            }
            if(front.node.right!=null){
                Element m=new Element();
                m.node=front.node.right;
                m.level=front.level+1;
                queue.add(m);
            }
        }
        return retList;
    }

    //判断是否为完全二叉树
    public static boolean isComplete(Node root){
        if(root==null){
            return true;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        //层次遍历，直到遇到null
        while(true){
            Node front=queue.poll();
            if(front==null){
                break;
            }
            queue.add(front.left);
            queue.add(front.right);
        }
        //判断队列中剩余元素都是null
        while(!queue.isEmpty()){
            Node node=queue.poll();
            if(node!=null){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Node root=buildTrue();
        System.out.println(levelOrder(root));
        System.out.println(isComplete(root));
    }
}
