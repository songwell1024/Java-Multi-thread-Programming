package MultiThreadPart_05.timeTest1;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author WilsonSong
 * @date 2018/12/26/026
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行了，时间为： " + new Date());
    }
}
