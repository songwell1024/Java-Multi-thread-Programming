package MultiThreadPart_02.PipeReaderWriter;

import java.io.PipedReader;

/**
 * @author WilsonSong
 * @date 2018/12/18/018
 */
public class ReadThread extends Thread {
    public ReadData readData;
    public PipedReader input;

    public ReadThread(ReadData readData,PipedReader input){
        this.readData = readData;
        this.input = input;
    }

    @Override
    public void run(){
        readData.readData(input);
    }

}
