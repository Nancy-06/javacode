package Test1018;

public class Test {
    public static void search(String str){
        if(str.length()!=18){
            return;
        }
        String str1Year=str.substring(6,10);
        String strMonth=str.substring(10,12);
        int month=Integer.valueOf(strMonth);
        String strDay=str.substring(12,14);
       int day=Integer.valueOf(strDay);
       String  strSex=str.substring(16,17);
        int sex=Integer.valueOf(strSex);
        if(sex%2==1){
            strSex=strSex.replaceFirst(strSex,"男");
        }
        else{
            strSex=strSex.replaceFirst(strSex,"女");
        }
        System.out.printf("此人是%s年%s月%s日出生，是%s性%n",str1Year,month,day,strSex);
    }

    public static void main(String[] args) {
        String str="610425178911034268";
        search(str);
    }
}
