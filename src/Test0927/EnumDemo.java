package Test0927;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

//枚举
enum Gender{
    FEMALE,MALE
}
public class EnumDemo {
    public static void main(String[] args) {
        Gender gender=Gender.FEMALE;
        System.out.println(gender);
        //打印所有的Gender
        System.out.println(Arrays.toString(Gender.values()));
        Gender g=Gender.valueOf("FEMALE");
        System.out.println(g);
    }


}
