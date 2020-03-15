package code_practice.day_07;

import java.util.TreeMap;

/**
 * @author guoyao
 * @create 2020/3/14
 */

//锤子剪刀布
public class Test2 {

    private static class Record{
        public int win;
        public int tie;
        public int lose;
        TreeMap<String,Integer> winCount;
        Record(){
            this.win=0;
            this.tie=0;
            this.lose=0;
            this.winCount=new TreeMap<>();
            this.winCount.put("B",0);
            this.winCount.put("C",0);
            this.winCount.put("J",0);
        }
    }


}
