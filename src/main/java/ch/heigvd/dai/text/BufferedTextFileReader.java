package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        //Open new FileReader
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        //Counter i
        int i;
        while ((i = br.read()) != -1) {
            //DO Nothing or
            //Print the file
            //System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
}
