package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        //Open new FileReader
        FileReader fr = new FileReader(filename, StandardCharsets.UTF_8);

        //Counter i
        int i;
        while ((i = fr.read()) != -1) {
            //DO Nothing or
            //Print the file
            //System.out.print((char) i);
        }
        fr.close();
    }
}
