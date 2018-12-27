package MultiThreadPart_05.TimerTaskMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author WilsonSong
 * @date 2018/12/26/026
 */
public class MyTaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("TaskB 知行楼： " + new Date());
    }
}
