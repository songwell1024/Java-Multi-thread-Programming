package MultiThreadPart_06.SingletonTest;

/**
 * @author WilsonSong
 * @date 2018/12/27/027
 */
public class test {
    public static void main(String[] args){
        MyThread myThreadA = new MyThread();
        MyThread myThreadB = new MyThread();
        MyThread myThreadC = new MyThread();

        myThreadA.start();
        myThreadB.start();
        myThreadC.start();


    }
}
