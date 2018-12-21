package MultiThreadPart_02.Stack_P_C;

/**
 * @author WilsonSong
 * @date 2018/12/16/016
 */
public class CThread extends Thread{
    public Cost cost;

    public CThread(Cost cost){
        this.cost = cost;
    }

    @Override
    public void run(){
        while (true){
            cost.popSrevice();
        }
    }
}
