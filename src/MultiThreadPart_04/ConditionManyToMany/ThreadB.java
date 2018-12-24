package MultiThreadPart_04.ConditionManyToMany;


/**
 * @author WilsonSong
 * @date 2018/12/24/024
 */
public class ThreadB extends Thread {

    private MyService myService;

    public ThreadB(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run(){
        while (true){
            myService.get();
        }
    }

}
