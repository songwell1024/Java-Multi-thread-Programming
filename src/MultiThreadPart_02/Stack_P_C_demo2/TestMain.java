package MultiThreadPart_02.Stack_P_C_demo2;

/**
 * @author WilsonSong
 * @date 2018/12/16/016
 */
public class TestMain {
    public static void main(String[] args){
        MyStack myStack = new MyStack();

        Thread pThread = new PThread(myStack);
        pThread.start();
        CThread cThread1 =  new CThread(myStack);
        CThread cThread2 =  new CThread(myStack);
        CThread cThread3 =  new CThread(myStack);
        CThread cThread4 =  new CThread(myStack);
        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();




    }
}
