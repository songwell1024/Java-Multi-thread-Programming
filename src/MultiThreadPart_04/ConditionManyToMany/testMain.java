package MultiThreadPart_04.ConditionManyToMany;

/**
 * @author WilsonSong
 * @date 2018/12/24/024
 */
public class testMain {

    public static void main(String[] args){
        MyService myService = new MyService();
        ThreadA[] threadAS = new ThreadA[10];
        ThreadB[] threadBS  = new ThreadB[10];
        for (int i = 0; i < 10; i ++){
            threadAS[i] = new ThreadA(myService);
            threadAS[i].start();
            threadBS[i] = new ThreadB(myService);
            threadBS[i].start();
        }
    }
}
