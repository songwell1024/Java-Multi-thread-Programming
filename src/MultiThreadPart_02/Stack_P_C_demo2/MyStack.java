package MultiThreadPart_02.Stack_P_C_demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WilsonSong
 * @date 2018/12/16/016
 */
public class MyStack {
    List<String> list = new ArrayList<>();

    synchronized public void push(){
        try{
            while (list.size() ==1){
                this.wait();
            }

            list.add("Anything=" + Math.random());
            this.notifyAll();
            System.out.println("push=" + list.size());


        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public String pop(){
        String returnString = "";
        try {
            while (list.size() == 0){
                this.wait();
            }

            returnString = "" + list.get(0);
            list.remove(0);
            this.notifyAll();
            System.out.println("pop=" + list.size());


        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return returnString;
    }


}
