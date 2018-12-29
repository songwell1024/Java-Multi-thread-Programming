package MultiThreadPart_06.SingletonTest3;

/**
 * @author WilsonSong
 * @date 2018/12/29/029
 */
public class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println(MyObject.getInstance().hashCode());
    }
}
