package MultiThreadPart_01.MyThread;

import MultiThreadPart_01.ExtoObject.MyService;

/**
 * @author WilsonSong
 * @date 2018/12/15/015
 */
public class ServiceThreadA extends Thread {
    private Object lock;

    public ServiceThreadA(Object lock){
        this.lock = lock;
    }

    @Override
    public void run(){
        MyService service = new MyService();
        service.testLock(lock);
    }
}
