package MultiThreadPart_01.P_C_AllWait;

/**
 * @author WilsonSong
 * @date 2018/12/16/016
 */
public class Cost {

    private Object lock;

    public Cost(Object lock){
        this.lock = lock;
    }

    public void getValue(){
        try {
            synchronized (lock){
                while (ValueObject.valueObject.equals("")){
                    System.out.println("消费者" + Thread.currentThread().getName() + "wait");
                    lock.wait();
                }

                System.out.println("消费者" +  Thread.currentThread().getName() +"running");
                ValueObject.valueObject = "";
                lock.notifyAll();
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
