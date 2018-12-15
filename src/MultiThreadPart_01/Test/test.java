package MultiThreadPart_01.Test;

import MultiThreadPart_01.ExtoObject.MyList;
import MultiThreadPart_01.ExtoObject.MyObject;
import MultiThreadPart_01.MyThread.*;

import java.nio.channels.InterruptedByTimeoutException;

/**
 * @author WilsonSong
 * @date 2018/12/10/010
 */
public class test {
    public static void main(String[] args){
//        MyThread myThread = new MyThread();
//        myThread.setName("MyThread");
//        myThread.start();
//        try {
//            for (int i = 0; i < 10; i++){
//                int time = (int) (Math.random() * 1000);
//                Thread.sleep(time);
//                System.out.println("main: " + Thread.currentThread().getName());
//            }
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        myRunnable();
//        wordThread();
//        countThread();
//        exThread();
//        interputedThread();
//        MethodTest();
//        test1();
        testService();
    }

    public static void myRunnable(){
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("777");

    }

//    public static void wordThread(){
//        MyThread myThread1 = new MyThread('A');
//        myThread1.setName("AAA");
//        myThread1.start();
//        MyThread myThread2 = new MyThread('B');
//        myThread2.setName("BBB");
//        myThread2.start();
//
//    }
//    public static void countThread(){
//        Thread thread = new MyThread();    //这个时候线程是共享的，因为下面的5个线程共享的都是thread这个线程中的数据，所以会出现线程不安全的问题
//                                            //加synchronized实现同步，也可以通过加
//        Thread thread1 = new Thread(thread,"A");
//        Thread thread2 = new Thread(thread,"B");
//        Thread thread3 = new Thread(thread, "C");
//        Thread thread4 = new Thread(thread, "D");
//        Thread thread5 = new Thread(thread, "E");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//    }
//
//    public static void exThread(){
//        Thread thread = new ExThread();
//        Thread thread1 = new Thread(thread,"A");
//        thread1.start();
//    }

//    public static void interputedThread(){
//        try{
//            Thread thread = new MyThread();
//            System.out.println("start");
//            thread.start();
//            Thread.sleep(10);
//            thread.interrupt();
//            System.out.println("end");
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//
//    }

    public static void MethodTest(){
        MyObject myObject = new MyObject();
        Thread threadA = new MyThreadA(myObject);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new MyThreadB(myObject);
        threadB.setName("B");
        threadB.start();

    }

    public static void test1(){
        try{
            Object object = new Object();
            MyList myList = new MyList();
            ThreadB threadB = new ThreadB(object,myList);
            threadB.start();
            Thread.sleep(50);

            ThreadA threadA = new ThreadA(object,myList);
            threadA.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void testService(){
        Object lock = new Object();
        ServiceThreadA serviceThreadA = new ServiceThreadA(lock);
        serviceThreadA.start();
        ServiceThreadB serviceThreadB = new ServiceThreadB(lock);
        serviceThreadB.start();
    }
}
