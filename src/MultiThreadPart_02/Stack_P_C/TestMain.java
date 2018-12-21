package MultiThreadPart_02.Stack_P_C;

/**
 * @author WilsonSong
 * @date 2018/12/16/016
 */
public class TestMain {
    public static void main(String[] args){
        MyStack myStack = new MyStack();
        Produce produce = new Produce(myStack);
        Cost cost = new Cost(myStack);
        Thread pThread = new PThread(produce);
        pThread.start();
        CThread cThread1 =  new CThread(cost);
        CThread cThread2 =  new CThread(cost);
        CThread cThread3 =  new CThread(cost);
        CThread cThread4 =  new CThread(cost);
        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();




    }
}
