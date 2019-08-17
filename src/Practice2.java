public class Practice2 {
    public static void main(String[] args) {
        int [] [] array={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int i;
        int j=0;
        int searchfor=11;
        boolean find=false;
        search:
        for( i=0;i<array.length;i++){
            for(j=0;j<array[i].length;j++){
                if(array[i][j]==searchfor){
                    find=true;
                    break search;
                }
            }
        }
        if(find){
            System.out.println("Find " + searchfor + " at " + i + "." +j);
        }
        else{
            System.out.println(searchfor+"not in the array");
        }
    }
}

