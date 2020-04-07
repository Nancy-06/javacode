package code_practice.day_11;

import java.util.*;

/**
 * @author guoyao
 * @create 2020/3/29
 */

//二叉树的遍历及构建
public class test2 {

   static int i=0;
    //中序遍历
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.printf("%c ",root.value);
        inorder(root.right);
    }
    //建树
    public static Node build(String str){
        Node root=null;
        if(str.charAt(i)!='#'){
            root=new Node(str.charAt(i));
            i++;
            root.left=build(str);
            root.right=build(str);
        }
        else{
            i++;
        }
        return root;
    }

    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String s=scanner.nextLine();
            i=0;
            Node root=build(s);
            inorder(root);
            System.out.println();
        }
    }

    //方法2：利用栈，将输入转为字符数组，依次push入栈，遇到#不push而是pop，输出为中序遍历
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while(scanner.hasNext()){
//            char [] array= scanner.nextLine().toCharArray();
//            Stack<Character> stack=new Stack<>();
//            stack.push(array[0]);
//            for(int i=1;i<array.length-1;i++){
//                if(array[i]=='#'){
//                    System.out.print(stack.pop()+" ");
//                }
//                else{
//                    stack.push(array[i]);
//                }
//            }
//        }
//    }
}
