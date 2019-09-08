package Test0906;

import java.util.*;

public class BinarySearchTree {
    //1.纯key模型 ：Set
    //2.key-value模型：Map
    private static class Node{
        int key;
        int value;
        Node left;
        Node right;
    }
    private static Node root=null;

    /**
     * 查找
     * @param key 关键字
     * @return 找到了返回赌对应的value，如果没有找到，返回-1
     */
    public static int get(int key){
        Node cur=root;
        while(cur!=null){
            if(key==cur.key){
                return cur.value;
            }
            else if(key<cur.key){
                cur=cur.left;
            }
            else{
                cur=cur.right;
            }
        }
        return -1;
    }

    /**
     * 在二叉树找到合适的位置并放入key-value
     * @param key 要放入的值
     * @param value  key的映射
     * @return  如果有Key返回原来的key对应的value，如果没有返回-1
     */
    public static int put(int key,int value){
        if(root==null){
            root=new Node();
            root.key=key;
            root.value=value;
            return -1;
        }
        Node cur=root;
        Node parent=null;
        while (cur != null) {
            if(key==cur.key){
                int oldValue=cur.value;
                return oldValue;
            }
            else if(key<cur.key){
                parent=cur;
                cur=cur.left;
            }
            else{
                parent=cur;
                cur=cur.right;
            }
        }
        Node node=new Node();
        node.key=key;
        node.value=value;
        if(key<parent.key){
            parent.left=node;
        }
        else{
            parent.right=node;
        }
        return -1;
    }

    /**
     * 查找
     * @param key  要查找的值
     * @param defaultValue   默认返回的值
     * @return 如果有key，返回key对应的value，如果没有返回默认的defaultValue
     */
    public static int getOrDefault(int key,int defaultValue){
        Node cur=root;
        while(cur!=null){
            if(key==cur.key){
                return cur.value;
            }
            else if(key<cur.key){
                cur=cur.left;
            }
            else{
                cur=cur.right;
            }
        }
        return defaultValue;
    }

    /**
     * 查找key,利用层序遍历
     * @return 返回所有key的不重复集合
     */
    public static Set<Integer> keySet(){
        Set<Integer> set=new HashSet<>();
        if(root==null){
            return set;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node front=queue.poll();
            set.add(front.key);
            if(front.left!=null){
                queue.add(front.left);
            }
            if(front.right!=null){
                queue.add(front.right);
            }
        }
        return set;
    }

    /**
     * 利用中序遍历
     * @return
     */
    public static Set<Integer> keySet2(){
        Set<Integer> set=new HashSet<>();
        inorderTraversal(set,root);
        return set;
    }

    private static void inorderTraversal(Set<Integer> set, Node root) {
        if(root!=null){
            inorderTraversal(set,root.left);
            set.add(root.key);
            inorderTraversal(set,root.right);
        }
    }

    /**
     *查找value，利用层序遍历
     * @return 返回所有的value的可重复集合
     */
    public static Set<Integer> valueSet(){
        Set<Integer> set=new HashSet<>();
        if(root==null){
            return set;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node front=queue.poll();
            set.add(front.value);
            if(front.left!=null){
                queue.add(front.left);
            }
            if(front.right!=null){
                queue.add(front.right);
            }
        }
        return set;
    }

    /**
     * 判断是否包含key
     * @param key  要找的值
     * @return  如果包含，返回true，否则返回false
     */
    public static boolean containsKey(int key){
        if(root==null){
            return false;
        }
        Node cur=root;
        while(cur!=null){
            if(key==cur.key){
                return true;
            }
            else if(key<cur.key){
                cur=cur.left;
            }
            else{
                cur=cur.right;
            }
        }
        return false;
    }

    /**
     * 判断是否包含value
     * @param value  要找的值
     * @return  如果包含，返回true，否则返回false
     */
    public static boolean containsValue(int value){
        if(root==null){
            return false;
        }
        Node cur=root;
        while(cur!=null){
            if(value==cur.value){
                return true;
            }
            else if(value<cur.value){
                cur=cur.left;
            }
            else{
                cur=cur.right;
            }
        }
        return false;
    }
}