package Test0920;

import sun.rmi.runtime.NewThreadAction;

import java.util.Arrays;

class Student{
    public String sex;
    public String major;
    public Student(String sex,String major){
        this.sex=sex;
        this.major=major;
    }
}
public class Test2 {
    public static int [] search(Student [] students,String majorKnow){
        int [] result=new int[2];
        //记录女生的人数
        int i=0;
        //记录男生的人数
        int j=0;
        int len=students.length;
        for(int k=0;k<len;k++){
            if(students[k].major==majorKnow){
                if(students[k].sex=="女"){
                    i++;
                }
                if(students[k].sex=="男"){
                    j++;
                }
            }
        }
        result[0]=i;
        result[1]=j;
        return result;
    }

    public static void main(String[] args) {
        Student stu1=new Student("女","计算机");
        Student stu2=new Student("男","计算机");
        Student stu3=new Student("女","计算机");
        Student stu4=new Student("男","网络");
        Student stu5=new Student("男","计算机");
        Student stu6=new Student("女","网络");
        Student stu7=new Student("男","网络");
        Student stu8=new Student("男","计算机");

        Student [] students={stu1,stu2,stu3,stu4,stu5,stu6,stu7,stu8};
        int [] array=search(students,"计算机");
        System.out.println(Arrays.toString(array));
    }
}
