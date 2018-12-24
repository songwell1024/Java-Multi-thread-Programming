package MultiThreadPart_04.MustUseMoreCondition_OK;

/**
 * @author WilsonSong
 * @date 2018/12/24/024
 */
public class TestMain {
    public static void main(String[] args){
        try {
            MyService myService = new MyService();
            ThreadA threadA = new ThreadA(myService);
            threadA.start();
            ThreadB threadB = new ThreadB(myService);
            threadB.start();
            Thread.sleep(2000);
            myService.siginalAllA();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }


}
