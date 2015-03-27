package satirist24.nlp.io;

import java.io.File;
import java.io.InputStream;
import java.util.stream.Stream;

/**
 * Created on 14.03.15.
 */
public interface Reader<T> {
    
    T read(String filename);
    
    T read(File file);
    
    T read(InputStream stream);
    
    T read(Stream stream);
    
}
