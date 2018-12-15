package MultiThreadPart_01.PeoduceCost;

/**
 * @author WilsonSong
 * @date 2018/12/15/015
 */
public class ProduceThread extends Thread {
    private Produce produce;

    public ProduceThread( Produce produce){
        this.produce = produce;
    }

    @Override
    public void run(){
        while (true){
            produce.setValue();
        }
    }
}
