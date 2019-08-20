package Test0820;

public class PockCard {
    String colors;
    int val;
    PockCard(int val,String colors){
        this.val=val;
        this.colors=colors;
    }

    @Override

    public String toString() {
        return String.format("[%d,%s]",val,colors);
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(!(obj instanceof PockCard)){
            return false;
        }
        PockCard other=(PockCard)obj;
        return this.val==other.val&&
                this.colors.equals(other.colors);
        //String类型的equals直接用来比较
    }


}
