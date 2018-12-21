package MultiThreadPart_02.Wait_Notify_Insert;

/**
 * @author WilsonSong
 * @date 2018/12/18/018
 */
public class DBTools {
    volatile private boolean prevIsA = false;

    synchronized public void backUpA(){

        try {
            while (prevIsA == true){
                wait();
            }

            for (int i = 0; i < 5; i++){
                System.out.println("*****");
            }
            prevIsA = true;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void backUpB(){
        try {
            while (prevIsA == false){
                wait();
            }

            for (int i = 0; i < 5; i++){
                System.out.println("&&&&&");
            }
            prevIsA = false;
            notifyAll();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
