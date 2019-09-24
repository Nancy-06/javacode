package Test0921;
import java.util.*;

public final class MyString implements Comparable<MyString>{
    private final char[] value;

    @Override
    //比较两个字符串的大小关系
    public int compareTo(MyString o) {
        if(o==null){
            return 1;
        }
        int length=Math.min(value.length,o.value.length);
        for(int i=0;i<length;i++){
            char a=value[i];
            char b=o.value[i];
            if(a<b){
                return -1;
            }
            else if(a>b){
                return 1;
            }
        }
        if(value.length>o.value.length){
            return 1;
        }
        else if(value.length<o.value.length){
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    //区分大小写的计较
    public boolean equals(Object obj) {
        //1.判断引用是否指向同一个对象
        if(this==obj) {
            return true;
        }
        //2.s是不是null
        if(obj==null){
            return false;
        }
        //3.s是不是一个MyStirng类型的对象，也可写为：obj.getClass()==getClass()
        if(!(obj instanceof  MyString)){
            return false;
        }
       //4.比较属性的相等性
        return Arrays.equals(value,((MyString) obj).value);
    }

    //public 的方法列出
    //需要复制数组，保证数组的引用不会被泄露
    //泄漏会导致通过泄漏的引用，修改属性的值
    //从而破坏对象的不可变特性
    public MyString(char [] value){
        this.value=Arrays.copyOf(value,value.length);
    }

    public MyString(char [] value,int offset,int count){
        this.value=Arrays.copyOfRange(value,offset,offset+count);
    }

    //这里引用泄漏没有问题，因为新的对象不会被修改
    //value数组中的值，相比较于copyOf,可以省去复制的时间，提升效率
    public MyString(MyString s){
        this.value=s.value;
    }

    //模拟的对象常量池
    private static List<MyString> pool=new ArrayList<>();
    //模拟直接定义字符串
    //会直接入池
    public static MyString literal(MyString s){
        for(MyString ms: pool){
            if(ms.equals(s)){
                return ms;
            }
        }
        MyString rs=new MyString(s);
        pool.add(rs);
        return rs;
    }

    //手动入池
    //如果常量池中已经有该相等的对象，返回引用
    //否则在常量池中创建对象，并返回引用
    public MyString intern(){
        for(MyString ms:pool){
            if(ms.equals(this)){
                return ms;
            }
        }
        MyString rs=new MyString(this);
        pool.add(rs);
        return rs;
    }

    public  char charAt(int index){
        return value[index];
    }

    //不能直接返回引用，防止引用泄漏
    public char [] toCharArray(){
        return Arrays.copyOf(value,value.length);
    }

    //将字符串全转为大写字母
    //保证对象的不可变对象
    public MyString toUpper(){
        //1.构造一个新的对象
        //2.遍历新对象的value
        //3.把小写字母变为大写字母
        //4.返回新的对象
        MyString s=new MyString(value);
        for(int i=0;i<s.value.length;i++){
            if(s.value[i]>='a'&&s.value[i]<='z'){
                s.value[i]=(char)(s.value[i]-'a'+'A');
            }
        }
        return s;
    }

    //不区分大小写的比较
    public boolean equalsgnoreCase(MyString s){
        //return toUpper().equals(s.toUpper());
        if(s==null){
            return false;
        }
        if(value.length!=s.value.length){
            return false;
        }
        for(int i=0;i<value.length;i++){
            char a=value[i];
            char b=s.value[i];
            if(a==b){
                continue;
            }
            if(a>='a'&&a<='z'){
                a+=('A'-'a');
                if(a==b){
                    continue;
                }
                else if(a>='A'&&a<='Z') {
                    a += ('a' - 'A');
                    if (a == b) {
                        continue;
                    }
                }
            }
            return false;
        }
        return true;
    }
    //全部转换为小写字母
    public MyString toLower(){
        MyString s=new MyString(value);
        for(int i=0;i<s.value.length;i++){
            if(s.value[i]>='A'&&s.value[i]<='Z'){
                s.value[i]=(char)(s.value[i]-'A'+'a');
            }
        }
        return s;
    }

    @Override
    public int hashCode() {
        int hash=0;
        for(char c:value){
            hash=(hash^c);
        }
        return hash;
    }

    //截取字符串部分内容
    //表示包含begin的下标，不包含end的下标
    public MyString substring(int begin,int end){
        return new MyString(value,begin,end-begin);
    }

    @Override
    public String toString() {
        return new String(value);
    }

    public static void main(String[] args) {
        char [] a={'a','b','c'};
        MyString s=new MyString(a);
        MyString t=new MyString(s);
        System.out.println(s);
        System.out.println(t);
        System.out.println(s.equals(t));
        MyString r=t.toUpper();
        System.out.println(s);
        System.out.println(t);
        System.out.println(r);
        System.out.println(s.equals(r));
        a[0]='z';
        System.out.println(s);
        System.out.println(t);
        System.out.println(r);
        System.out.println(s.equals(t));
        System.out.println("abcd".compareTo("ad"));
        System.out.println(s.charAt(1));
        System.out.println(Arrays.toString(s.toCharArray()));
        char [] b={'A','b','c'};
        MyString y=new MyString(b);
        System.out.println(s.equalsgnoreCase(y));
        System.out.println(s.hashCode());
        System.out.println(s.substring(0,2));
        System.out.println(s.toString());
    }
}
