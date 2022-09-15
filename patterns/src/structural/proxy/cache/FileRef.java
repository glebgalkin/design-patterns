package structural.proxy.cache;

import java.io.File;
import java.io.IOException;

public interface FileRef {

   File addFile(String filename) throws IOException;

}
