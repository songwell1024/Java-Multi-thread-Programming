package MultiThreadPart_04.MustUseMoreCondition_OK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author WilsonSong
 * @date 2018/12/24/024
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();

    public void awaitA(){
        try{
            lock.lock();
            System.out.println("awaitA begin time is " + System.currentTimeMillis());
            conditionA.await();
            System.out.println("awaitA end time is "+ System.currentTimeMillis());

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try{
            lock.lock();
            System.out.println("awaitB begin time is " + System.currentTimeMillis());
            conditionB.await();
            System.out.println("awaitB end time is "+ System.currentTimeMillis());

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void siginalAllA(){
        try {
            lock.lock();
            System.out.println("signal A time is " + System.currentTimeMillis());
            conditionA.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public void siginalB(){
        try {
            lock.lock();
            System.out.println("signal B time is " + System.currentTimeMillis());
            conditionB.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
