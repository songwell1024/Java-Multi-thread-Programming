package MultiThreadPart_01.PeoduceCost;

/**
 * @author WilsonSong
 * @date 2018/12/15/015
 */
public class Cost {
    public Entity entity = new Entity();
    public Object lock;

    public Cost(Object lock){
        this.lock = lock;
    }

    public void getValue(){
        try{
            synchronized (lock){
                if (entity.value.equals("")){
                    lock.wait();
                }
                System.out.println("get");
                entity.value = "";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
