package MultiThreadPart_05.timerTest3;

import MultiThreadPart_05.timeTest1.MyTask;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author WilsonSong
 * @date 2018/12/26/026
 */
public class Run {
    private static class Mytask  extends TimerTask{

        @Override
        public void run() {
            System.out.println("当前运行了： " +  new Date());
        }
    }

    public static void main(String[] args){
        Mytask mytask = new Mytask();
        Timer timer = new Timer();
        System.out.println("当前时间为： " + new Date());
        timer.schedule(mytask,7000);
    }
}
