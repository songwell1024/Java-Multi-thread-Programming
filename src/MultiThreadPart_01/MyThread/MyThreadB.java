package MultiThreadPart_01.MyThread;

import MultiThreadPart_01.ExtoObject.MyObject;

/**
 * @author WilsonSong
 * @date 2018/12/11/011
 */
public class MyThreadB extends Thread{

    private MyObject myObject;
    public MyThreadB(MyObject myObject){
        this.myObject = myObject;
    }

    @Override
    public void run(){
        super.run();
        myObject.methodB();
    }
}
