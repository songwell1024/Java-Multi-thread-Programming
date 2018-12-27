package MultiThreadPart_06.SingletonTest;

/**
 * @author WilsonSong
 * @date 2018/12/27/027
 */
public class MyObject {
    private static MyObject myObject;

    private MyObject(){

    }

//    public static MyObject getInstance(){
//        try{
//            synchronized (MyObject.class){
//                if (myObject != null){
//
//                }else {
//                    Thread.sleep(2000);
//                    myObject = new MyObject();
//                }
//            }
//
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        return myObject;
//    }

    public static MyObject getInstance(){
        try{
                if (myObject != null){
                }else {
                    Thread.sleep(2000);
                    synchronized (MyObject.class){
                        if (myObject == null){
                            myObject = new MyObject();
                        }
                    }
                }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return myObject;
    }
}
