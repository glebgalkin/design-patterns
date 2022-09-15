package structural.proxy;

import structural.proxy.cache.FileCache;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        FileCache fileCache = new FileCache();

        for(int x= 1; x<4; x++){
            String filename = "test"+x+".txt";
            fileCache.addFile(filename);
        }

        System.out.println(fileCache.getFile("non-cache.txt"));

    }
}
