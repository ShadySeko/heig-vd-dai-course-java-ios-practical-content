package ch.heigvd.dai;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Measure the time to write a file (e.g : 1 byte, no buffer and binary file)
        Measure.write("binary_1B.bin", 1, false, Measure.FileType.BINARY);

        // Measure the time to read the same file
        Measure.read("binary_1B.bin", false, Measure.FileType.BINARY);

        // Measure the time to write a file (e.g : 1 byte, with buffer and binary file)
        Measure.write("binary_1B_buffered.bin", 1, true, Measure.FileType.BINARY);

        // Measure the time to read the same file
        Measure.read("binary_1B_buffered.bin", true, Measure.FileType.BINARY);


        //Now with a 1KB file
        Measure.write("binary_1KB.bin", 1024, false, Measure.FileType.BINARY);
        Measure.read("binary_1KB.bin", false, Measure.FileType.BINARY);
        Measure.write("binary_1KB_buffered.bin", 1024, true, Measure.FileType.BINARY);
        Measure.read("binary_1KB_buffered.bin", true, Measure.FileType.BINARY);

        //Now with a 1MB file
        Measure.write("binary_1MB.bin", 1024*1024, false, Measure.FileType.BINARY);
        Measure.read("binary_1MB.bin", false, Measure.FileType.BINARY);
        Measure.write("binary_1MB_buffered.bin", 1024*1024, true, Measure.FileType.BINARY);
        Measure.read("binary_1MB_buffered.bin", true, Measure.FileType.BINARY);

        //Now with a 5MB file
        Measure.write("binary_5MB.bin", 5*1024*1024, false, Measure.FileType.BINARY);
        Measure.read("binary_5MB.bin", false, Measure.FileType.BINARY);
        Measure.write("binary_5MB_buffered.bin", 5*1024*1024, true, Measure.FileType.BINARY);
        Measure.read("binary_5MB_buffered.bin", true, Measure.FileType.BINARY);

        //Now we do this all over again for text files
        //1B
        Measure.write("text_1B.txt", 1, false, Measure.FileType.TEXT);
        Measure.read("text_1B.txt", false, Measure.FileType.TEXT);
        Measure.write("text_1B_buffered.txt", 1, true, Measure.FileType.TEXT);
        Measure.read("text_1B_buffered.txt", true, Measure.FileType.TEXT);

        //1KB
        Measure.write("text_1KB.txt", 1024, false, Measure.FileType.TEXT);
        Measure.read("text_1KB.txt", false, Measure.FileType.TEXT);
        Measure.write("text_1KB_buffered.txt", 1024, true, Measure.FileType.TEXT);
        Measure.read("text_1KB_buffered.txt", true, Measure.FileType.TEXT);

        //1MB
        Measure.write("text_1MB.txt", 1024*1024, false, Measure.FileType.TEXT);
        Measure.read("text_1MB.txt", false, Measure.FileType.TEXT);
        Measure.write("text_1MB_buffered.txt", 1024*1024, true, Measure.FileType.TEXT);
        Measure.read("text_1MB_buffered.txt", true, Measure.FileType.TEXT);

        //5MB
        Measure.write("text_5MB.txt", 5*1024*1024, false, Measure.FileType.TEXT);
        Measure.read("text_5MB.txt", false, Measure.FileType.TEXT);
        Measure.write("text_5MB_buffered.txt", 5*1024*1024, true, Measure.FileType.TEXT);
        Measure.read("text_5MB_buffered.txt", true, Measure.FileType.TEXT);


    }
}
