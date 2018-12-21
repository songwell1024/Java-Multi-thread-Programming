package MultiThreadPart_02.PipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @author WilsonSong
 * @date 2018/12/18/018
 */
public class TestPipeReadWriter {
    public static void main(String[] args){
        try {
            PipedReader pipedReader = new PipedReader();
            PipedWriter pipedWriter = new PipedWriter();
            ReadData readData = new ReadData();
            WriteData writeData = new WriteData();

            pipedReader.connect(pipedWriter);

            WriteThread writeThread = new WriteThread(writeData,pipedWriter);
            writeThread.start();
            Thread.sleep(1000);
            ReadThread readThread = new ReadThread(readData,pipedReader);
            readThread.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


    }


}
