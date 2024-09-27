package compressors;

import java.io.File;
import java.io.IOException;

public class ZIP implements Compression {
    File file;

    public ZIP(File file) {
        this.file = file;
    }

    @Override
    File compress(File file) throws IOException {
        
    }
}
