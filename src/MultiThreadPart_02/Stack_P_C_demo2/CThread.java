package MultiThreadPart_02.Stack_P_C_demo2;

/**
 * @author WilsonSong
 * @date 2018/12/16/016
 */
public class CThread extends Thread{
    public MyStack myStack;

    public CThread(MyStack myStack){
        this.myStack = myStack;
    }

    @Override
    public void run(){
        while (true){
            myStack.pop();
        }
    }
}
