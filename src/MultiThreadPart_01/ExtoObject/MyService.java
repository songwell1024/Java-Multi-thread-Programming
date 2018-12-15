package MultiThreadPart_01.ExtoObject;

/**
 * @author WilsonSong
 * @date 2018/12/15/015
 */
public class MyService {
    public void testLock(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin time:" + System.currentTimeMillis());
                Thread.sleep(1000);
//                lock.wait();
                System.out.println("end time:" + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
