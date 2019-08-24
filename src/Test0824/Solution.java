package Test0824;

public class Solution {
    public static Node buildTree1(){
        Node n1=new Node('A');
        Node n2=new Node('B');
        Node n3=new Node('C');
        Node n4=new Node('D');
        Node n5=new Node('E');
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        return n1;
    }
    public static Node buildTree2(){
        Node n1=new Node('B');
        Node n2=new Node('D');
        Node n3=new Node('E');
        n1.left=n2;
        n1.right=n3;
        return n1;
    }
    public static Node buildTree3(){
        Node n1=new Node('B');
        Node n2=new Node('E');
        Node n3=new Node('D');
        n1.left=n2;
        n1.right=n3;
        return n1;
    }

   //判断是否为相同的树
    public static boolean isSameTree(Node p,Node q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return  p.value==q.value
                &&isSameTree(p.left,q.left)
                &&isSameTree(p.right,q.right);

    }
    //判断t是否为tree的子树
    public static boolean search(Node tree,Node t){
       if(t==null){
           return false;
       }
       if(tree.value==t.value&&isSameTree(tree,t)){
           return true;
       }
       if(search(tree.left,t)){
           return true;
       }
       return search(tree.right,t);
    }
    //判断是否互为镜像的树
    public static boolean isMirror(Node p,Node q){
      if(p==null&&q==null){
          return true;
      }
      if(p==null||q==null){
          return false;
      }
      return p.value==q.value
              &&isMirror(p.left,q.right)
              &&isMirror(p.right,q.left);
    }

    public static void main(String[] args) {
        Node tree1=buildTree1();
        Node tree2=buildTree2();
        Node tree3=buildTree3();
        System.out.println(isSameTree(tree1,tree1));
        System.out.println(search(tree1,tree2));
        System.out.println(isMirror(tree2,tree3));
    }
}
