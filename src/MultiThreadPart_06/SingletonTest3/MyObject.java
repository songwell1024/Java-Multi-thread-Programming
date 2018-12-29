package MultiThreadPart_06.SingletonTest3;

/**
 * @author WilsonSong
 * @date 2018/12/29/029
 */
public class MyObject {

    private static MyObject instance = null;
    private MyObject(){

    }

    static {
        instance = new MyObject();       //静态代码块，在使用类的时候就会初始化
    }

    public static MyObject getInstance() {
        return instance;
    }
}
