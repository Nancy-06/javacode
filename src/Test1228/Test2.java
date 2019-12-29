package Test1228;

/**
 * @author guoyao
 * @create 2019/12/29
 */



//回溯法求解0-1背包
public class Test2{
    int [] p;  //物品的价值数组
    int [] w;  //物品的重量数组
    int c;     //最大可以拿的数组
    int count; //物品的个数
    int cw;    //当前的重量
    int cp;   //当前的价值
    int  bestp;  //目前最优装载的价值
    int r;     //剩余物品的价值
    int [] cx;  //存放当前解
    int [] bestx;  //存放最终解
    public int loading(int [] weight,int [] value,int capacity){
        count=weight.length-1;
        w=weight;
        p=value;
        c=capacity;
        cw=0;
        bestp=0;
        cx=new int [count+1];
        bestx=new int[count+1];
        for(int i=1;i<=count;i++){
            r+=p[i];
        }
        backTrack(1);
        return bestp;
    }

    public void backTrack(int t){
        if(t>count){
            if(cp>bestp){
                for(int i=1;i<=count;i++){
                    bestx[i]=cx[i];
                }
                bestp=cp;
            }
            return;
        }
        r-=p[t];
        if(cw+w[t]<=c){
            cx[t]=1;
            cp+=p[t];
            cw+=w[t];
            backTrack(t+1);
            cp-=p[t];
            cw-=w[t];
        }
        if(cp+r>bestp){
            cx[t]=0;
            backTrack(t+1);
        }
        r+=p[t];
    }

    public static void main(String[] args) {
        int [] w1={0,15,25,40,20,15,24};
        int [] p1={0,10,5,20,2,14,23};
        int c1=30;
        Method2 m=new  Method2();
        int max=m.loading(w1,p1,c1);
        System.out.println(max);
    }
}


