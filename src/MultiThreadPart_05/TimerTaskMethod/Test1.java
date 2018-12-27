package MultiThreadPart_05.TimerTaskMethod;

import MultiThreadPart_05.timeTest1.MyTask;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author WilsonSong
 * @date 2018/12/26/026
 */
public class Test1 {
    public static void main(String[] args){
        try {
            System.out.println("当前时间为： "+ new Date());
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND,1);
            Date date = calendar.getTime();
            System.out.println("计划执行时间为： " + date);

            MyTaskA myTaskA = new MyTaskA();
            MyTaskB myTaskB = new MyTaskB();

            Timer timer = new Timer();

            timer.schedule(myTaskA,date,2000);
            timer.schedule(myTaskB,date,2000);
            Thread.sleep(20000);
            timer.cancel();      //清除所有队列
        }catch (InterruptedException e){
            e.printStackTrace();
        }




    }
}
