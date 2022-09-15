package structural.proxy.cache;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEngine implements FileRef {

    @Override
    public File addFile(String filename) throws IOException {
        File test = new File(filename);
        if(test.createNewFile()){
            System.out.println("File successfully created");
        } else {
            System.out.println("File already exists");
        }
        FileWriter fileWriter = new FileWriter(filename);
        fileWriter.write("Some info goes here");
        fileWriter.close();

        return test;
    }
}
