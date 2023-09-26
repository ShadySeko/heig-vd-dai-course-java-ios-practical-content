package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        //Open new FileInputStream
        FileInputStream fis = new FileInputStream(filename);

        //Counter i
        int i;
        while ((i = fis.read()) != -1) {
            //DO Nothing or
            //Print the file
            //System.out.print(Integer.toBinaryString(i) + " ");

        }

    }
}
