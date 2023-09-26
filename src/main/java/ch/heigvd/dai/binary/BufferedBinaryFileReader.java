package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedBinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
           //Open new FileInputStream and make it buffered
            FileInputStream fis = new FileInputStream(filename);
            BufferedInputStream bis = new BufferedInputStream(fis);

            //Counter i
            int i;
            while ((i = bis.read()) != -1) {
                //DO Nothing or
                //Print the file
                //System.out.print(Integer.toBinaryString(i) + " ");

            }

    }
}
