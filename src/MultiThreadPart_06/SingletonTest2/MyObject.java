package MultiThreadPart_06.SingletonTest2;

/**
 * @author WilsonSong
 * @date 2018/12/27/027
 */
public class MyObject {

    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }

    private MyObject(){

    }

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }

}
