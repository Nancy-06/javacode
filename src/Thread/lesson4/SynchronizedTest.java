package Thread.lesson4;

import java_experiment_2.MyPoint;

/**
 * @author guoyao
 * @create 2019/11/17
 */
public class SynchronizedTest {

    public static void method1() {
        System.out.println(Thread.currentThread().getName());
        while (true) {

        }
    }

    public static void method2() {
        System.out.println(Thread.currentThread().getName());
        while (true) {

        }
    }


    /**
     * public static void main(String[] args) {
     * new Thread(new Runnable() {
     *
     * @Override public void run() {
     * method2();
     * }
     * }).start();
     * <p>
     * new Thread(new Runnable() {
     * @Override public void run() {
     * method2();
     * }
     * }).start();
     * }
     **/

    /**
    public static void main(String[] args) {
        MyObject object = new MyObject();
        MyObject object2 = new MyObject();
        new Thread(new Runnable() {
            @Override
            public void run() {
                object.method1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                // object2.method2();
                // synchronized (object2){
                //
                //}


            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                // object2.method2();
                // synchronized (object2){
                //
                //}
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                // object2.method2();
                // synchronized (object2){
                //
                //}


            }
        }).start();
    }
     **/
    public static void main(String[] args) {
        MyObject object = new MyObject();
        MyObject object2 = new MyObject();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    System.out.println(Thread.currentThread().getName());
                    while(true){

                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    System.out.println(Thread.currentThread().getName());
                    while(true){

                    }
                }
            }
        }).start();
    }

}


class MyObject{
    public static void method1(){
        System.out.println(Thread.currentThread().getName());
        while(true){

        }
    }
    public static void method2(){
        System.out.println(Thread.currentThread().getName());
        while(true){

        }
    }
}