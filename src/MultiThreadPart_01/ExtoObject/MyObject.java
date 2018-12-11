package MultiThreadPart_01.ExtoObject;

import javax.sound.midi.Track;

/**
 * @author WilsonSong
 * @date 2018/12/11/011
 */
public class MyObject {
    synchronized public void methodA(){
        try{
            System.out.println("begin methordA: " +  Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("end time: " +  System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void methodB(){
        try {
            System.out.println("begin methodB: " + Thread.currentThread().getName() );
            Thread.sleep(1000);
            System.out.println("end time: " + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
