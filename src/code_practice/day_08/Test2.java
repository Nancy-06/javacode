package code_practice.day_08;

import java.util.*;

/**
 * @author guoyao
 * @create 2020/3/17
 */

//单词倒排
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            char [] ch=str.toCharArray();
            Stack<Character> stack=new Stack<>();
            List<Character> list=new ArrayList<>();
            int index=ch.length-1;
            while(index>=0){
                if((ch[index]>='a'&&ch[index]<='z')||
                        (ch[index]>='A'&&ch[index]<='Z')){
                    stack.push(ch[index]);
                    index--;
                }
                else{
                    while(!stack.empty()){
                        list.add(stack.pop());
                        if(stack.empty()&&index!=0){
                            list.add(' ');
                        }
                    }
                    index--;
                }
            }
            while(!stack.empty()){
                list.add(stack.pop());
            }
            for(int j=0;j<list.size();j++){
                System.out.print(list.get(j));
            }
        }
    }
}
