package Test0921;

import java.io.IOException;
import java.util.Scanner;

public class CheckOrUnckeck {
    public static void methodA(){
        //数组下标越界
        throw new ArrayIndexOutOfBoundsException();
    }
    public static void methodB()throws IOException{
        throw new IOException();
    }
    public static void methodC()throws  IOException{
        methodB();
    }
    public static void tryResourse(){
        try(Scanner scanner=new Scanner(System.in)){
            scanner.nextInt();
        }
    }
    public static void methodUncheck() throws RuntimeException{
        throw new RuntimeException();
    }
}
