package MultiThreadPart_06.SingletonTest2;

/**
 * @author WilsonSong
 * @date 2018/12/27/027
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println(MyObject.getInstance().hashCode());
    }
}
