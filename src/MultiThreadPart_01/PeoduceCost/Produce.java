package MultiThreadPart_01.PeoduceCost;


/**
 * @author WilsonSong
 * @date 2018/12/15/015
 */
public class Produce {
    Entity entity = new Entity();
    private Object lock;

    public Produce(Object lock){
        this.lock = lock;
    }

    public void setValue(){
        try{
            synchronized (lock){
                if (!entity.value.equals("")){
                    lock.wait();
                }
                String valueObject = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set");
                entity.value = valueObject;
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}

