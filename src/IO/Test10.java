package IO;

import java.io.*;

/**
 * @author guoyao
 * @create 2019/10/29
 */
public class Test10 {
    //对象序列化，将对象的数据永久的保存在文件中，这个过程就是对象的序列化,把java对象转换为字节序列的过程
    public static void main(String[] args) {
        //创建person对象
        Person person=new Person("p1","张三",20);
        System.out.println("---------写入文件前----------");
        System.out.println("Person对象的id："+person.getId());
        System.out.println("Person对象的name："+person.getName());
        System.out.println("Person对象的age："+person.getAge());
        try {
            //创建文件输出流对象，将数据写入文件中
            FileOutputStream fos=new FileOutputStream("g:\\java\\test5.txt");
            //创建对象输出流对象，用于处理输出流对象写入的数据
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //将Person对象输出到输出流
            oos.writeObject(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//当对象进行序列化时，必须要保证对象实现Serialzable接口，它是java提供的通用数据保存和读取的接口
class Person implements Serializable{
    private String id;
    private String name;
    private int age;

    public  Person(String id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
