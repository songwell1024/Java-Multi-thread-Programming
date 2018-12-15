package MultiThreadPart_01.MyThread;

import MultiThreadPart_01.ExtoObject.MyService;

import javax.swing.text.html.ObjectView;

/**
 * @author WilsonSong
 * @date 2018/12/15/015
 */
public class ServiceThreadB extends Thread {
    private Object lock;
    public ServiceThreadB(Object lock){
        this.lock = lock;
    }

    @Override
    public void run(){
        MyService service = new MyService();
        service.testLock(lock);
    }

}
