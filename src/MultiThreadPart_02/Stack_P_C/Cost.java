package MultiThreadPart_02.Stack_P_C;

/**
 * @author WilsonSong
 * @date 2018/12/16/016
 */
public class Cost {
    public MyStack stack;

    public Cost(MyStack stack){
        this.stack = stack;
    }

    public void popSrevice(){
        stack.pop();
    }
}
