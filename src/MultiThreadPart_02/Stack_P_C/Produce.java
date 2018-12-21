package MultiThreadPart_02.Stack_P_C;

/**
 * @author WilsonSong
 * @date 2018/12/16/016
 */
public class Produce {

    public MyStack stack;

    public Produce(MyStack myStack){
        this.stack = myStack;
    }

    public void pushService(){
        stack.push();
    }
}
