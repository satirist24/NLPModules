package satirist24.nlp.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created on 26.03.15.
 */
public class FileArticle {
    
    private String fullPath;
    
    private File file;
    
    private String title;
    
    public FileArticle(String fullPath) {
        this.fullPath = fullPath;
        
    }
    
    public FileOutputStream getOutputStream() throws IOException {
        return new FileOutputStream(file);
        
    }
    
}
