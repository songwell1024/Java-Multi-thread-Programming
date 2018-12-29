package MultiThreadPart_07;

/**
 * @author WilsonSong
 * @date 2018/12/29/029
 */
public class MyThreadB extends Thread {
    @Override
    public void run(){
        try {
            while (!Thread.currentThread().isInterrupted()){
                System.out.println(Thread.currentThread().getName());
            }
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
