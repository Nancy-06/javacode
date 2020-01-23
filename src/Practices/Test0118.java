package Practices;

/**
 * @author guoyao
 * @create 2020/1/18
 */
//字符串
public class Test0118 {
    public static void main(String[] args) {
        String str="helloworld";
        //将字符串变为字符数组
        char [] data=str.toCharArray();
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
        //将字符数组转为字符串
        System.out.println(new String(data)); //全部转换
        System.out.println(new String(data,5,5));
        //String转byte[]
        byte[] data1=str.getBytes();
        for(int i=0;i<data1.length;i++){
            System.out.print(data1[i]+" ");
        }
        System.out.println();
        //byte[] 转String
        System.out.println(new String(data1));
    }
}
