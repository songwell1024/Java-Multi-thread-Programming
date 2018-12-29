package MultiThreadPart_06.SingletonTest3;

/**
 * @author WilsonSong
 * @date 2018/12/29/029
 */
public class Test {
    public static void main(String[] args){

        MyThread t1 = new MyThread();

        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }

}
