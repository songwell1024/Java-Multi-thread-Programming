package MultiThreadPart_02.PipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

/**
 * @author WilsonSong
 * @date 2018/12/18/018
 */
public class ReadData {

    public void readData(PipedReader input){
        try{
            System.out.println("read:");
            char[] byteArray = new char[20];
            int readLength = input.read(byteArray);
            while (readLength!= -1){
                String newData = new String(byteArray,0,readLength);
                System.out.print(newData);
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
