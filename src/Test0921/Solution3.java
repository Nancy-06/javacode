package Test0921;

//统计每个专业所对应的男女生数目
import jdk.management.resource.internal.ResourceNatives;

import java.util.*;
class Student{
    public int sex;//男1 女2
    public String major;
    public Student(int sex,String major){
        this.sex=sex;
        this.major=major;
    }
}
public class Solution3 {
    public static void main(String[] args) {
        String [] majors={"计算机","数学","自动化","网络","物联网"};
        Student[] students=new Student[1000];
        Random majorRandom=new Random(20190922);
        Random sexRandom=new Random(20190922);
        for(int i=0;i<students.length;i++){
            int m=majorRandom.nextInt(5);
            int n=sexRandom.nextInt(2);
            students[i]=new Student(n,majors[m]);
        }
        Map<String,int []> counts=new HashMap<>();
        for(String major:majors){
            counts.put(major,new int [2]);
        }
        for(Student student:students){
            int [] cun=counts.get(student.major);
            cun[student.sex]++;
        }
        for(Map.Entry<String ,int []> entry:counts.entrySet()){
            String major=entry.getKey();
            int [] cnt= entry.getValue();
            System.out.printf("专业：%s,男生：%d,女生：%d%n",major,cnt[0],cnt[1]);
        }
    }


}
