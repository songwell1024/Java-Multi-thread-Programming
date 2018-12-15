package MultiThreadPart_01.PeoduceCost;

/**
 * @author WilsonSong
 * @date 2018/12/15/015
 */
public class TestPC {

    public static void main(String[] args){
        try{
            Object lock = new Object();
            Produce produce = new Produce(lock);
            Cost cost = new Cost(lock);
            ProduceThread produceThread = new ProduceThread(produce);
            produceThread.start();
            Thread.sleep(1000);
            CostThread costThread = new CostThread(cost);
            costThread.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }





    }
}
