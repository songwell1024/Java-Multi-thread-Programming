package MultiThreadPart_02.Wait_Notify_Insert;

/**
 * @author WilsonSong
 * @date 2018/12/18/018
 */
public class TestWNI {

    public static void main(String[] args){
        DBTools dbTools = new DBTools();
        for (int i = 0; i< 20; i++){
            ThreadA threadA = new ThreadA(dbTools);
            threadA.start();
            ThreadB threadB = new ThreadB(dbTools);
            threadB.start();
        }


    }
}
