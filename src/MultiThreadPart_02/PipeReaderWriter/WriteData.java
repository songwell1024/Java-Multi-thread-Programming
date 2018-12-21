package MultiThreadPart_02.PipeReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * @author WilsonSong
 * @date 2018/12/18/018
 */
public class WriteData {

    public void writeData(PipedWriter out){

        try{
            System.out.println("write:");
            for (int i = 0; i < 100; i++){
                String outData = "" + (i +1);
                out.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }



    }

}
