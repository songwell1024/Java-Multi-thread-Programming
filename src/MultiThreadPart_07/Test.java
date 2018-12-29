package MultiThreadPart_07;


/**
 * @author WilsonSong
 * @date 2018/12/29/029
 */
public class Test {
    public static void main(String[] args){
        MyThreadA myThreadA = new MyThreadA();
        MyThreadB myThreadB = new MyThreadB();

        ThreadGroup threadGroup = new ThreadGroup("线程组");
        Thread athread = new Thread(threadGroup,myThreadA);
        Thread bthread = new Thread(threadGroup,myThreadB);

        athread.start();
        bthread.start();
        System.out.println("线程数" + threadGroup.activeCount());
        System.out.println("线程组名称为" + threadGroup.getName());


    }
}
