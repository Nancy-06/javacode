package Practices;

/**
 * @author guoyao
 * @create 2020/2/14
 */
public class Sort1 {
    //插入排序
    //平均时间复杂度：O(n^2)
    //稳定性：稳定
    public static void insertSort(int [] array){
        for(int i=0;i<array.length-1;i++){
            int key=array[i+1];
            int j;
            for(j=i;j>=0&&key<array[j];j--){
                array[j+1]=array[j];
            }
            array[j+1]=key;
        }
    }

    //希尔排序
    //平均时间复杂度：O(n^1.3-1.4) 
    //稳定性：不稳定
    public static void shellSort(int [] array){
        int grep=array.length;
        while(true){
            grep=grep/3+1;
            insertSortWithGrep(array,grep);
            if(grep==1){
                return;
            }
        }
    }

    private static void insertSortWithGrep(int[] array, int grep) {
        for(int i=0;i<array.length-grep;i++){
            int key=array[i+grep];
            int j;
            for(j=i;j>=0&&key<array[j];j--){
                array[j+grep]=array[j];
            }
            array[j+grep]=key;
        }
    }


}
