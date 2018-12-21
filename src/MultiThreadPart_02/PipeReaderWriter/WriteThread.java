package MultiThreadPart_02.PipeReaderWriter;

import java.io.PipedWriter;

/**
 * @author WilsonSong
 * @date 2018/12/18/018
 */
public class WriteThread extends Thread {

    public WriteData writeData;
    public PipedWriter out;

    public WriteThread(WriteData writeData, PipedWriter out){
        this.writeData = writeData;
        this.out =  out;
    }

    @Override
    public void run(){
        writeData.writeData(out);
    }
}
