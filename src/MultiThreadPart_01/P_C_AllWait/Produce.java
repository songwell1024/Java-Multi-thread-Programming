package MultiThreadPart_01.P_C_AllWait;

/**
 * @author WilsonSong
 * @date 2018/12/16/016
 */
public class Produce {
    private Object lock;

    public Produce(Object lock){
        this.lock = lock;
    }

    public void setValue(){
        try{
            synchronized (lock){
                while (!ValueObject.valueObject.equals("")){
                    System.out.println("生产者" + Thread.currentThread().getName() + "wait");
                    lock.wait();
                }
                System.out.println("生产者" + Thread.currentThread().getName() + "running");
                ValueObject.valueObject = "a";
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
