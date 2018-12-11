package MultiThreadPart_01.MyThread;

/**
 * @author WilsonSong
 * @date 2018/12/10/010
 */
public class MyThread extends Thread {
//    @Override
//    public void run(){
//        try{
//            for (int i = 0; i < 10; i++){
//                int time = (int) (Math.random() *1000);
//                Thread.sleep(time);
//                System.out.println(Thread.currentThread().getName());
//            }
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//    }

//    public char word;
//    public MyThread(char word){
//        super();
//        this.word = word;
//    }
//    @Override
//    public void run(){
//        System.out.println(Thread.currentThread().getName() + "; " + word);
//    }

//    private int count = 5;
//    @Override
//    synchronized public void run(){
//        super.run();
//        count--;
//        System.out.println("由" +  Thread.currentThread().getName() + "计算：" + count);
//    }

    @Override
    public void run(){
        super.run();
        try {
            for (int i = 0; i< 1000; i ++){
                if (this.isInterrupted()){
                    System.out.println("线程终止，我要退出");
                    throw new InterruptedException();
                }
                System.out.println("i" + (i+1));
            }
        }catch (InterruptedException e){
            System.out.println("抛出异常了，我现在已经退出了");
            e.printStackTrace();
        }
    }
}
