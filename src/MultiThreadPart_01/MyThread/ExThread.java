package MultiThreadPart_01.MyThread;

/**
 * @author WilsonSong
 * @date 2018/12/10/010
 */
public class ExThread extends Thread{
    public ExThread(){
        System.out.println("-------------------");
        System.out.println(Thread.currentThread().getName());
        System.out.println(this.getName());
        System.out.println("*********************");
    }

    @Override
    public void run(){
        System.out.println("--------------------");
        System.out.println(Thread.currentThread().getName());
        System.out.println(this.getName());
        System.out.println("************************");
    }
}
