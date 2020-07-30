package code_practice.trees;

import java.util.*;

/**
 * @author guoyao
 * @create 2020/7/20
 */
public class Test4 {

    //层次遍历
    public static void levelTravarsal(TreeNode root){
        if(root == null){
            return ;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode newRoot = queue.peek();
            System.out.println(newRoot.val);
            if(newRoot.left != null){
                queue.add(newRoot.left);
            }
            if(newRoot.right != null){
                queue.add(newRoot.right);
            }
        }
    }

    // 二叉树的层次遍历：从上到下打印出二叉树的每个节点，
    // 同一层的节点按照从左到右的顺序打印。
    public int[] levelOrder1(TreeNode root){
        if (root == null){
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            arrayList.add(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        int [] array = new int [arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++){
            array[i] = arrayList.get(i);
        }
        return array;
    }

    //从上到下按层打印二叉树，
    // 同一层的节点按从左到右的顺序打印，每一层打印到一行。
    public List<List<Integer>> levelOrder2(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return null;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> array = new ArrayList<>();
            int count = queue.size();
            for(int i = 0; i < count; i++){
                TreeNode node = queue.poll();
                array.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            result.add(array);
        }
        return result;
    }


    //请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，
    // 第三行再按照从左到右的顺序打印，其他行以此类推。
    public List<List<Integer>> levelOrder3(TreeNode root){
        if(root == null){
            return null;
        }
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            LinkedList<Integer> list= new LinkedList<>();
            for(int i = 0; i < count; i++){
                TreeNode node = queue.poll();
                if(result.size()%2 == 0){
                    list.addLast(node.val);
                }else{
                    list.addFirst(node.val);
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            result.add(list);
        }
        return result;
    }

    //二叉树的层次遍历，自底向上遍历
    public List<List<Integer>> levelOrder4(TreeNode root){
        LinkedList<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < count; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            result.addFirst(list);
        }
        return result;
    }

}
