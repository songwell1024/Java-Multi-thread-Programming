package MultiThreadPart_05.timeTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author WilsonSong
 * @date 2018/12/26/026
 */
public class Test1 {
    public static void main(String[] args){

        System.out.println("当前时间为： " + new Date());
        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 10);  //当任务的时间比当前时间早的话就需要立即执行
        calendar.add(Calendar.SECOND,1);
        Date runDate = calendar.getTime(); //Date runDate = calendar.getTime(true);   设置为true的话就是一意味着task线程为守护线程，执行完start后立即结束
        System.out.println("计划执行时间为： " + runDate);

        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task,runDate);   //timer.schedule(task,runDate,1000); 在执行后以1s的时间间隔来无限循环执行


    }
}
