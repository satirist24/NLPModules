package satirist24.nlp.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 26.03.15.
 */
public class WorkingDirectory {
    
    private String fullPath;
    
    private List<WorkingDirectory> nestedDirectories = new ArrayList<WorkingDirectory>();
    
    private List<FileArticle> fileArticles = new ArrayList<FileArticle>();
    
    public WorkingDirectory(String fullPath) {
        this.fullPath = fullPath;
        
    }
    
    public void scanDirectory() {
        File file = new File(fullPath);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                WorkingDirectory wd = new WorkingDirectory(f.getAbsolutePath());
                wd.scanDirectory();
                nestedDirectories.add(wd);
            } else {
                FileArticle fa = new FileArticle(f.getAbsolutePath());
                fileArticles.add(fa);
            }
        }
    }

    public static void main(String[] args) {
        WorkingDirectory wd = new WorkingDirectory("/home/rebelizant/Downloads/");
        wd.scanDirectory();
        System.out.println();
    }
    
}
