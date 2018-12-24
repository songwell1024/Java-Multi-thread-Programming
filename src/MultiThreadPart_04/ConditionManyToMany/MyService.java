package MultiThreadPart_04.ConditionManyToMany;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author WilsonSong
 * @date 2018/12/24/024
 */
public class MyService {
    private Lock lock =  new ReentrantLock();
    public Condition condition = lock.newCondition();
    public boolean hasValue = false;

    public void set(){
        try {
            lock.lock();

            while (hasValue == true){
                System.out.println("有可能连续的%%");
                condition.await();
            }
            System.out.println("%");
            hasValue = true;
            condition.signalAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void get(){
        try {
            lock.lock();
            while (hasValue == false){
                System.out.println("有可能打印连续的&&");
                condition.await();
            }
            System.out.println("&");
            hasValue = false;
            condition.signalAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
