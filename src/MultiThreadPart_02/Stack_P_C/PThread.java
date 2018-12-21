package MultiThreadPart_02.Stack_P_C;

/**
 * @author WilsonSong
 * @date 2018/12/16/016
 */
public class PThread extends Thread {

    public Produce produce;
    public  PThread(Produce produce){
        this.produce = produce;
    }

    @Override
    public void run(){
        while (true){
            produce.pushService();
        }
    }


}
