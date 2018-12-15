package MultiThreadPart_01.MyThread;

import MultiThreadPart_01.ExtoObject.MyList;

/**
 * @author WilsonSong
 * @date 2018/12/15/015
 */
public class ThreadA extends Thread {
    private MyList myList;
    private Object object ;

    public ThreadA(Object object,MyList myList){
        super();
        this.myList = myList;
        this.object =object;
    }

    @Override
    public void run(){
        synchronized (object){
            try {
                for (int i = 0; i < 10; i++){

                    myList.add();
                    if (myList.getSize() == 5){
                        object.notify();
                        System.out.println("发出通知");
                    }
                    System.out.println("已经添加了元素个数：" + i);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }



    }


}
