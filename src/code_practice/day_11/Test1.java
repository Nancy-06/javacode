package code_practice.day_11;

/**
 * @author guoyao
 * @create 2020/3/29
 */
//实现一颗二叉搜索树
public class Test1 {

    private Node root;
    //插入结点
    public void add(int value){
        Node newNode=new Node(value);
        if(root==null){
            //如果第一个结点为空
            root=newNode;
        }
        else{
            Node current=root;
            //current结点的父结点
            Node parent;
            //循环查找插入的位置
           while(true){
               parent=current;
               //如果插入的值小于当前结点的值，从左子树查找
               if(value<current.value){
                   current=current.left;
                   //直到当前结点为null
                   if(current==null){
                       //设置当前结点的父结点的左子树为新创建的结点
                       parent.left=newNode;
                       return;
                   }
               }
               //如果插入的值大于当前结点的值，从右子树查找
               else{
                   current=current.right;
                   //直到当前结点为null
                   if(current==null){
                       //设置当前结点的父结点的右子树为新创建的结点
                       parent.right=newNode;
                       return;
                   }
               }
           }
        }
    }

    //查找结点
    public Node find(int value){
        Node current=root;
        while(current.value!=value){
            if(value<current.value){
                current=current.left;
            }
           else{
                current=current.right;
            }
            if(current==null){
                return null;
            }
        }
        return current;
    }
}
