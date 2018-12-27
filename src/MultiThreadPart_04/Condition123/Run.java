package MultiThreadPart_04.Condition123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author WilsonSong
 * @date 2018/12/24/024
 */
public class Run {
    volatile public static int nextPrintWho = 1;
    public static Lock lock  = new ReentrantLock();
    public static Condition conditionA = lock.newCondition();
    public static Condition conditionB = lock.newCondition();
    public static Condition conditionC = lock.newCondition();

    public static void main(String[] args){

        Thread threadA = new Thread(){
          @Override
          public void run(){
              try{
                  lock.lock();
                  while (nextPrintWho != 1){
                      conditionA.await();
                  }

                  for (int i = 0; i <3; i++){
                      System.out.println("A " +(i + 1));
                  }

                  nextPrintWho = 2;
                  conditionA.signalAll();
              }catch (InterruptedException e){
                  e.printStackTrace();
              }finally {
                  lock.unlock();
              }
          }
        };


        Thread threadB = new Thread(){
            @Override
            public void run(){
                try{
                    lock.lock();
                    while (nextPrintWho != 2){
                        conditionA.await();
                    }

                    for (int i = 0; i <3; i++){
                        System.out.println("B " +(i + 1));
                    }

                    nextPrintWho = 3;
                    conditionB.signalAll();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        };



        Thread threadC = new Thread(){
            @Override
            public void run(){
                try{
                    lock.lock();
                    while (nextPrintWho != 3){
                        conditionA.await();
                    }

                    for (int i = 0; i < 3; i++){
                        System.out.println("C " +(i + 1));
                    }

                    nextPrintWho = 1;
                    conditionC.signalAll();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        };

        Thread[] threadsA = new Thread[5];
        Thread[] threadsB = new Thread[5];
        Thread[] threadsC = new Thread[5];

        for (int i  =0; i < 5; i++){
            threadsA[i] = new Thread(threadA);
            threadsB[i] = new Thread(threadB);
            threadsC[i] = new Thread(threadC);
            threadsA[i].start();
            threadsB[i].start();
            threadsC[i].start();

        }



    }

}
