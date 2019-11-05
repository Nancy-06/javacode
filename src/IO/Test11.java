package IO;

import java.io.*;

/**
 * @author guoyao
 * @create 2019/10/29
 */
public class Test11 {
    //反序列化：对象的对象被序列化之后会生成二进制文件保存在文件中，通过这些二进制数据可以恢复序列化之前的java对象
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("g:\\java\\test5.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Person person =(Person) ois.readObject();
            System.out.println("---------从文件中读取后---------");
            System.out.println("Person对象的id："+person.getId());
            System.out.println("Person对象的name："+person.getName());
            System.out.println("Person对象的age："+person.getAge());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}