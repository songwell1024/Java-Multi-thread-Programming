package MultiThreadPart_02.Wait_Notify_Insert;

import MultiThreadPart_01.ExtoObject.MyList;

/**
 * @author WilsonSong
 * @date 2018/12/15/015
 */
public class ThreadA extends Thread {
    private DBTools dbTools;

    public ThreadA(DBTools dbTools){
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run(){
        dbTools.backUpA();
    }

}
