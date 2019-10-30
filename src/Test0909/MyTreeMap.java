package Test0909;

import java.util.*;

//这里的K,V是类型变量，形参
public class MyTreeMap<K,V> {
    //这里的K,V是类型变量，形参
    public static class Entry<K,V>{
        //这里的K,V是类型变量，是K,V背后类型的运行

        private K key;
        private V value;
        private Entry<K,V> left;
        private Entry<K,V> right;
    }
    private Entry<K,V> root;
    private Comparator<K> comparator=null;
    public MyTreeMap(Comparator<K> comparator){
        this.comparator=comparator;
    }
    public MyTreeMap(){

    }
    public V get(K key){
        Entry<K,V> cur=root;
        while(cur!=null){
            int r;
            if(comparator!=null){
                r=comparator.compare(key,cur.key);
            }
            else{
                Comparable<K> KComparable=(Comparable<K>) key;
                r=KComparable.compareTo((cur.key));
            }
            if(r==0){
                return cur.value;
            }
            else if(r<0){
                cur=cur.left;
            }
            else{
                cur=cur.right;
            }
        }
        return null;
    }
}
