package IO流;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyao
 * @create 2019/12/5
 */
public class CloneTest {
    public static void main(String[] args) {
        Person p=new Person(1,"张三","102@qq.com");
        List<Cloth> cloths=new ArrayList<>();
        cloths.add(new Cloth("A","希望"));
        cloths.add(new Cloth("B","渴望"));
        p.setCloths(cloths);
        try {
            //浅拷贝
            //1.实现cloneable接口
            //2.重写Object.clone()方法
            Person p2=(Person) p.clone();
            p.setName("小白");   //浅拷贝是对简单类型的属性是真正的拷贝
            p.getCloths().get(0).setName("C");  //对复杂对象是修改引用
            System.out.println(p2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}

class Person implements Cloneable,Serializable{
    private Integer id;
    private  String name;
    private String email;
    private List<Cloth> cloths=new ArrayList<>();

    public Person(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cloths=" + cloths +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cloth> getCloths() {
        return cloths;
    }

    public void setCloths(List<Cloth> cloths) {
        this.cloths = cloths;
    }
}

class Cloth implements Serializable{
    private String name;
    private String brand;

    public Cloth(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}