package MultiThreadPart_01.ExtoObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WilsonSong
 * @date 2018/12/15/015
 */
public class MyList {

    private List list = new ArrayList();

    public void add(){
        list.add("aaaaaa");
    }

    public int getSize(){
        return list.size();
    }
}
