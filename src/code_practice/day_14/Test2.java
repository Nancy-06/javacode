package code_practice.day_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/10
 */

//成绩排序

class Student{
    String name;
    int score;
    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }
}

public class Test2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int numPeople=scanner.nextInt();
            int option=scanner.nextInt();
            //输入人名和对应的成绩
            List<Student> studentList=new ArrayList<>();
            for(int i=0;i<numPeople;i++){
                studentList.add(new Student(scanner.next(),scanner.nextInt()));
            }
            //降序
            if(option==0){
                studentList.sort((o1,o2)->o2.score-o1.score);
            }else if(option==1){
                studentList.sort((o1,o2)->o1.score-o2.score);
            }
            for(Student student:studentList){
                System.out.println(student.name+" "+student.score);
            }
        }

    }

}
