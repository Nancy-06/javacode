package Test1014;
//类的封装

class Student{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String stuName) {
        this.name = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int stuAge) {
        //下面对传入的参数进行检查
        if(stuAge<=0){
            System.out.println("年龄不合法");
        }
        else{
            this.age =stuAge;
        }
    }

    public void intoduce(){
        System.out.println("大家好，我叫"+name+",我今年"+age+"岁！");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setAge(30);
        stu.setName("张三");
        stu.intoduce();
    }
}
