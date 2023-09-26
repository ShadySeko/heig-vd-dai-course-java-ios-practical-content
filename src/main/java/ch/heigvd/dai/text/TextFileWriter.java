package ch.heigvd.dai.text;

import ch.heigvd.dai.Writable;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        //New FileWriter
        FileWriter fw = new FileWriter(filename);

        //Write the file
        for (int i = 0; i < sizeInBytes; i++) {
            fw.write(0);
        }

        fw.flush();
        fw.close();
    }
}
