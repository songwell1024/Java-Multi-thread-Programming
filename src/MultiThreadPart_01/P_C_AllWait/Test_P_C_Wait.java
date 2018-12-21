package MultiThreadPart_01.P_C_AllWait;

/**
 * @author WilsonSong
 * @date 2018/12/16/016
 */
public class Test_P_C_Wait {
    public static void main(String[] args){
        Object lock = new Object();
        Produce produce = new Produce(lock);
        Cost cost = new Cost(lock);
        PThread[] pThreads = new PThread[2];
        CThread[] cThreads = new CThread[2];
        for (int i = 0; i < 2; i++){
            pThreads[i] =  new PThread(produce);
            pThreads[i].setName("生产者" + (i+1));
            pThreads[i].start();
//                Thread.sleep(1000);
            cThreads[i] =  new CThread(cost);
            cThreads[i].setName("消费者" + (i+1));
            cThreads[i].start();
        }
    }

}
