package code_practice.day_16;

/**
 * @author guoyao
 * @create 2020/5/5
 */
//1-n整数中1出现的次时
public class Test1 {
    public int countDigitOne(int n){

        //求每个位的数字所用
        int index=1;
        int count=0;
        int high=n,cur=0,low=0;
        while(high>0){
            high/=10;
            cur=(n/index)%10;
            low=n-(n/index)*index;
            if(cur==0){
                count+=high*index;
            }
            if(cur==1){
                count+=high*index+low+1;
            }
            if(cur>1){
                count+=(high+1)*index;
            }
            index*=10;
        }
        return count;
    }
}
