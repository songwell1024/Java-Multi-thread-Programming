package MultiThreadPart_04.UseConditionWaitNotifyOK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author WilsonSong
 * @date 2018/12/24/024
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void await(){
        try {
            lock.lock();      //这里的线程就获取了锁
            System.out.println("await 时间为 " + System.currentTimeMillis());
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();           //释放锁
        }

    }

    public void signal(){
        try {
            lock.lock();
            System.out.println("signal 时间为" + System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
