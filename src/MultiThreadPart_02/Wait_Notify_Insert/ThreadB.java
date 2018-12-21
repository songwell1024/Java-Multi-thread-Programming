package MultiThreadPart_02.Wait_Notify_Insert;

import MultiThreadPart_01.ExtoObject.MyList;


/**
 * @author WilsonSong
 * @date 2018/12/15/015
 */
public class ThreadB extends Thread {

    private DBTools dbTools;

    public ThreadB(DBTools dbTools){
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run(){
        dbTools.backUpB();
    }
}
