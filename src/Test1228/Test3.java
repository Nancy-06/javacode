package Test1228;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;


/**
 * @author guoyao
 * @create 2019/12/30
 */




//分支限界法求0-1背包问题

//子集空间树结点类型
class Bnode{
    //父节点
    Bnode parent;
    //左儿子结点
    boolean leftChild;

    public Bnode(Bnode parent, boolean leftChild) {
        this.parent = parent;
        this.leftChild = leftChild;
    }
}

//优先级队列的结点
class HeapNode implements Comparable{
    //活结点
    Bnode liveNode;
    //结点的价值上界
    int upperProfit;
    //结点所相应的价值
    int profit;
    //结点所相应的重量
    int weight;
    //活结点在自己树中所处的层序号
    int level;

    public HeapNode(Bnode liveNode, int upperProfit, int profit, int weight, int level) {
        this.liveNode = liveNode;
        this.upperProfit = upperProfit;
        this.profit = profit;
        this.weight = weight;
        this.level = level;
    }

    @Override
    //降序排列
    public int compareTo(Object x) {
        int xs=((HeapNode) x).upperProfit;
        if(upperProfit>xs){
            return -1;
        }
        if(upperProfit<xs){
            return 1;
        }
        return 0;
    }
}

class Element implements Comparable{
    //背包编号
    int id;
    //单位重量编号
    int d;

    public Element(int id, int d) {
        this.id = id;
        this.d = d;
    }

    @Override
    public int compareTo(Object o) {
        int xs=((Element)o).d;
        if(d>xs){
            return -1;
        }
        if(d==xs){
            return 0;
        }
        return 1;
    }

    public boolean equals(Object o){
        return d==((Element) o).d;
    }
}

public class Test3 {
    //背包容量
    int c;
    //物品总数
    int n;
    //物品重量数组
    int[] w;
    //物品价值数组
    int[] p;
    //当前重量
    int cw;
    //当前价值
    int  cp;
    //最优解
    int [] bestx;
    //活结点优先队列
    LinkedList<HeapNode>  heap;
    //节点所相应价值的上界
    public int bound(int i){
        int cleft=c-cw;  //剩余容量
        int b=cp;
        while(i<=n&&w[i]<=cleft){
            cleft-=w[i];
            b+=p[i];
            i++;
        }
        if(i<=n){
            b+=p[i]*cleft/w[i];
        }
        return b;
    }

    public void addLiveNode(int up,int pp,int ww,int lev,Bnode par,boolean ch){
        Bnode b=new Bnode(par,ch);
        HeapNode node=new HeapNode(b,up,pp,ww,lev);
        heap.add(node);
        Collections.sort(heap);
    }

    public int bbKnapsack(){
        Bnode enode=null;
        int i=1;
        int bestp=0; //当前最优解
        int up=bound(1);  //价值上界

        while(i!=n+1){
            int wt=cw+w[i];
            if(wt<=c){ //左孩子节点可行
                if(cp+p[i]>bestp){
                    bestp=cp+p[i];
                }
                addLiveNode(up,cp+p[i],i=1,i+1,enode,true);
            }
            up=bound(i+1);
            if(up>=bestp){
                addLiveNode(up,cp,cw,i+1,enode,false);
            }
            HeapNode node=heap.poll();
            enode=node.liveNode;
            cw=node.weight;
            cp=node.profit;
            up=node.upperProfit;
            i=node.level;
        }
        //构造当前最优解
        for(int j=n;j>0;j--){
            bestx[j]=(enode.leftChild)? 1:0;
            enode=enode.parent;
        }
        return cp;
    }

    //返回最大价值
    public int knapsack(int [] pp,int []ww,int cc){
        c=cc;
        n=pp.length-1;
        int ps=0; //统计所有背包的价值总量
        int ws=0; //统计所有背包的重量之和
        Element  [] q=new Element[n];
        int [] xx=new int[n+1];
        for(int i=1;i<=n;i++){
            if(ww[i]!=0){
                q[i-1]=new Element(i,pp[i]/ww[i]);
                ps+=pp[i];
                ws+=ww[i];
            }

        }
        if(ws<=c){
            for(int i=1;i<n;i++){
                xx[i]=1;
            }
            return ps;
        }
        Arrays.sort(q);
        //初始化数据成员
        p=new int [n+1];
        w=new int [n+1];
        for(int i=1;i<=n;i++){
            p[i]=pp[q[i-1].id];
            w[i]=ww[q[i-1].id];
        }
        cw=0;
        cp=0;
        bestx=new int [n+1];
        heap=new LinkedList<HeapNode>();
        int maxp=bbKnapsack();
        for(int i=1;i<=n;i++){
            xx[q[i-1].id]=bestx[i];
        }
        return maxp;
    }
}

