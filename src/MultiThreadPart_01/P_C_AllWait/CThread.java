package MultiThreadPart_01.P_C_AllWait;

import sun.font.TrueTypeFont;

import java.util.TreeMap;

/**
 * @author WilsonSong
 * @date 2018/12/16/016
 */
public class CThread extends Thread {
    public Cost cost;
    public CThread(Cost cost){
        this.cost = cost;
    }

    @Override
    public void run(){
        while (true){
            cost.getValue();
        }

    }
}
