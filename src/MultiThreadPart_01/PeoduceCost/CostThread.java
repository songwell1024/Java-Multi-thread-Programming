package MultiThreadPart_01.PeoduceCost;

/**
 * @author WilsonSong
 * @date 2018/12/15/015
 */
public class CostThread extends Thread {
    public Cost cost;

    public CostThread(Cost cost){
        this.cost = cost;
    }

    @Override
    public void run(){
        while (true){
            cost.getValue();
        }
    }
}
