package MultiThreadPart_04.UseConditionWaitNotifyOK;

/**
 * @author WilsonSong
 * @date 2018/12/24/024
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run(){
        myService.await();
    }

}
