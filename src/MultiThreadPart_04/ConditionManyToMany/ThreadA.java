package MultiThreadPart_04.ConditionManyToMany;


/**
 * @author WilsonSong
 * @date 2018/12/24/024
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run(){
        while (true){
            myService.set();
        }

    }

}
