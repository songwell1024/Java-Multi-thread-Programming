package MultiThreadPart_01.P_C_AllWait;

/**
 * @author WilsonSong
 * @date 2018/12/16/016
 */
public class PThread extends Thread {

    public Produce produce;
    public PThread(Produce produce){
        this.produce = produce;
    }

    @Override
    public void run(){
        while (true){
            produce.setValue();
        }

    }

}
