package MultiThreadPart_05.TimerTaskMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author WilsonSong
 * @date 2018/12/26/026
 */
public class MyTaskA extends TimerTask {
    @Override
    public void run() {
        System.out.println("TaskA 执行咯：" + new Date());
        this.cancel();
        System.out.println("TaskA 自己移除自己");    //清除当前执行的队列
    }
}
