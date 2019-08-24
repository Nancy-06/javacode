package Test0824;

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
    //求二叉树中的结点个数
    //遍历思想
    public  static int count=0;
    public static void calcCount1(Node root){
        if(root==null){
            return;
        }
        count++;
        calcCount1(root.left);
        calcCount1(root.right);
    }
    //汇总思想
    public static int calcCount2(Node root){
        if(root==null){
            return 0;
        }
        int left=calcCount2(root.left);
        int right=calcCount2(root.right);
        int count=left+right+1;
        return count;
    }
    //求二叉树中的叶子结点个数
    public static int leafCount=0;
    public static void calcLeafCount1(Node root){
        if(root==null){
            return;
        }
        calcLeafCount1(root.left);
        if(root.left==null&&root.right==null){
            leafCount++;
        }
        calcLeafCount1(root.right);
    }
    public static int calcLeafCount2(Node root){
        if(root==null){
            return 0;
        }
        //代表只有一个结点的数
        if(root.left==null&&root.right==null){
            return 1;
        }
        int left=calcLeafCount2(root.left);
        int right=calcLeafCount2(root.right);
        return left+right;
    }
    //二叉树的高度
    public static int calcHeight(Node root){
        if(root==null){
            return 0;
        }
        int left=calcHeight(root.left);
        int right=calcHeight(root.right);
        //左子树和右子树里面的最大值
        int height=Math.max(left,right)+1;
        return height;
    }
    //第k层的结点个数
    public static int calcKlevel(Node root,int k){
        if(root==null){
            return 0;
        }
        if(k==1){
            return 1;
        }
        int left=calcKlevel(root.left,k-1);
        int right=calcKlevel(root.right,k-1);
        return left+right;
    }

    //查找
    public static Node search(Node root,char val){
        if(root==null){
            return null;
        }
        if(root.value==val){
            return root;
        }
        Node left=search(root.left,val);
        if(left!=null){
            return left;
        }
        Node right=search(root.right,val);
        if(right!=null) {
            return right;
        }
        return null;
    }
    public static boolean search1(Node root,char val){
        if(root==null){
            return false;
        }
        if(root.value==val){
            return true;
        }
        if(search1(root.left,val)){
            return true;
        }
        if(search1(root.right,val)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node root=buildTrue();

        calcCount1(root);
        System.out.println("结点个数：");
        System.out.println(count);
        System.out.println(calcCount2(root));

        calcLeafCount1(root);
        System.out.println("叶子结点个数：");
        System.out.println(leafCount);
        System.out.println(calcLeafCount2(root));
        System.out.println("二叉树的高度：");
        System.out.println(calcHeight(root));
        System.out.println("第k层结点的个数：");
        System.out.println(calcKlevel(root,3));
        System.out.println("查找结点：");
        Node tree=search(root,'A');
        System.out.println(tree);
        System.out.println(search1(root,'G'));
    }
}
