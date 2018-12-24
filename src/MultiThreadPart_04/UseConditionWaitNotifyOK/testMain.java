package MultiThreadPart_04.UseConditionWaitNotifyOK;


/**
 * 通知等待
 * @author WilsonSong
 * @date 2018/12/24/024
 */
public class testMain {

    public static void main(String[] args){
        try {
            MyService myService = new MyService();
            ThreadA threadA = new ThreadA(myService);
            threadA.start();
            Thread.sleep(2000);
            myService.signal();

        }catch (InterruptedException e){
            e.printStackTrace();
        }



    }
}
