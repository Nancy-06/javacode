package code_practice.day_23;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/8/15
 */
//小团的旅游线路
public class Test10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arrayList.add(sc.next() + " " + sc.next());
        }
        System.out.println(arrayList.size());
        System.out.println(result(arrayList));
    }

    public static int result(ArrayList<String> arrayList){
        int res = 0;
        if(arrayList == null || arrayList.size() == 0){
            return 0;
        }
        int size = arrayList.size();
        int i = 0;
        while(i < size){
            String sb = arrayList.get(i).split(" ")[0];
            while(i < size){
                if(i < size && sb.equals(arrayList.get(i).split(" ")[1])){
                    res ++;
                   // System.out.println(sb);
                    break;
                }
                i++;
            }
            i++;
        }
        return res;
    }

}
