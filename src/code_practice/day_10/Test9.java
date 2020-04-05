package code_practice.day_10;

/**
 * @author guoyao
 * @create 2020/3/31
 */
//构建乘积数组
public class Test9 {

    public int [] multiply(int [] A){
        int length=A.length;
        int [] B=new int[length];
        for(int i=0;i<length;i++){
            B[i]=1;
            for(int j=0;j<length;j++){
                if(i!=j){
                    B[i]=B[i]*A[j];
                }
            }
        }
        return B;
    }

    public int [] multiply1(int [] A){
        int length=A.length;
        int [] B=new int[length];
        if(length!=0){
            B[0]=1;
            //计算下三角连乘
            for(int i=1;i<length;i++){
                B[i]=B[i-1]*A[i-1];
            }
            int temp=1;
            //计算上三角
            for(int j=length-2;j>=0;j--){
                temp*=A[j+1];
                B[j]*=temp;
            }
        }
        return B;
    }
}
