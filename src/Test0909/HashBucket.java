package Test0909;

import java.util.Random;

public class HashBucket {
    private static class Node{
        private int key;
        private int value;
        private Node next;
    }
    private Node [] array;
    private int size;
    HashBucket(){
        array=new Node [15];
        size=0;
    }
    private int hashFunction(int key,int capacity){
        return key%capacity;
    }
    public int get(int key){
        int index=hashFunction(key,array.length);
        Node head=array[index];
        Node cur=head;
        while(cur!=null){
            if(key==cur.key){
                return cur.value;
            }
            cur=cur.next;
        }
        return -1;
    }

    public int put(int key,int value){
        int index=hashFunction(key,array.length);
        Node head=array[index];
        Node cur=head;
        while(cur!=null){
            if(key==cur.key){
                int oldValue=cur.value;
                cur.value=value;
                return oldValue;
            }
            cur=cur.next;
        }
        Node node=new Node();
        node.key=key;
        node.value=value;
        node.next=head;
        array[index]=node;
        size++;
        return -1;
    }

    public int remove(int key){
        int index=hashFunction(key,array.length);
        Node head=array[index];
        Node cur=head;
        Node prev=null;
        while(cur!=null){
            if(cur.key==key){
                int oldValue=cur.value;
                if(cur==head){
                    array[index]=head.next;
                }
                else{
                    prev.next=cur.next;
                }
                size--;
                return oldValue;
            }
            prev=cur;
            cur=cur.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        HashBucket map=new HashBucket();
        Random random=new Random(20190911);
        for(int i=0;i<20;i++){
            int r=random.nextInt(100);
            map.put(r,r+100);
        }
        System.out.println("Success");
    }









}
