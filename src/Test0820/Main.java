package Test0820;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.*;
public class Main {
    public static void swap(ArrayList<PockCard> cards,int i,int j){
        PockCard x=cards.get(i);
        PockCard y=cards.get(j);
        cards.set(i,y);
        cards.set(j,x);
    }

    public static void main(String[] args) {
        ArrayList<PockCard> cards=new ArrayList<>(52);
        String []colors={"♥","♦","♠","♣"};
        for(int i=0;i<4;i++){
            for(int j=1;j<=13;j++){
                PockCard card=new PockCard(j,colors[i]);
                cards.add(card);
            }
        }
        //洗牌，使牌无序
        Random random=new Random(20190820);
        for(int i=51;i>0;i--){
            int j=random.nextInt(i);
            swap(cards,i,j);
        }
        System.out.println(cards);
        //给三个人发牌，每人五张
        System.out.println(cards.subList(52-15,52));
        ArrayList<PockCard> A=new ArrayList<>();
        ArrayList<PockCard> B=new ArrayList<>();
        ArrayList<PockCard> C=new ArrayList<>();
        for(int i=0;i<15;i++){
            PockCard card =cards.remove(cards.size()-1);  //尾删
            switch(i%3){
                case 0:
                    A.add(card);break;
                case 1:
                    B.add(card);break;
                case 2:
                    C.add(card);break;
            }
        }
        System.out.println(cards.size());
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        //A抓到手里的牌，有没有红心A
        PockCard heartA=new PockCard(12,"♥");

        for(PockCard o:A){
            if(o.equals(heartA)){
                System.out.println("找到");
                A.remove(o);

            }
        }
         /**

        if(A.contains(heartA)){
            System.out.println("找到");
        }
        else{
            System.out.println("没有找到");
        }
**/
        //找到heartA并删除

        Iterator<PockCard> it=A.iterator();
        while(it.hasNext()){
            PockCard o=it.next();
            if(o.equals(heartA)){
                it.remove();
            }
        }
        System.out.println(A);
         /**
        for(int i=0;i<A.size();i++){
            PockCard o=A.get(i);
            if(o.equals(heartA)){
                A.remove(o);
            }
        }
        System.out.println(A);
         **/
        Iterator<PockCard> it1=A.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        ListIterator<PockCard> it2=A.listIterator();
        System.out.println(it2.next());
        System.out.println(it2.next());
        System.out.println(it2.previous());
    }
}
