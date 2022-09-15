package structural.proxy.cache;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FileCache implements FileRef {

    private HashMap<String, File> files;
    private FileEngine fileEngine;

    public FileCache(){
        files = new HashMap<>();
        fileEngine = new FileEngine();
    }

    @Override
    public File addFile(String filename) throws IOException {
        File file = fileEngine.addFile(filename);
        if(file.createNewFile()){
            files.put(filename, file);
        }
        return file;
    }

    public String getFile(String name) throws IOException {
        File file = files.get(name);
        if(file == null){
            file = addFile(name);
        }
        return file.toString();
    }
}
