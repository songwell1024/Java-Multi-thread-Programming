package MultiThreadPart_01.MyThread;

import MultiThreadPart_01.ExtoObject.MyList;


/**
 * @author WilsonSong
 * @date 2018/12/15/015
 */
public class ThreadB extends Thread {

    private MyList myList ;
    private Object object ;

    public ThreadB(Object object,MyList myList){
        super();
        this.myList = myList;
        this.object =object;
    }

    @Override
    public void run(){
        synchronized (object){
            try{
                if (myList.getSize() != 5){
                    System.out.println("begin time " +  System.currentTimeMillis());
                    object.wait();
                    System.out.println("end time " + System.currentTimeMillis());
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
