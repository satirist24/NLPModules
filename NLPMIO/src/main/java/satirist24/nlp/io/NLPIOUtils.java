package satirist24.nlp.io;

import org.apache.commons.io.IOUtils;

/**
 * Created on 26.03.15.
 */
public class NLPIOUtils {
    
    private WorkingDirectory workingDirectory;
    
    private NLPIOUtils(){}
    
    public static NLPIOUtils getWorkingDirectory(WorkingDirectory dir) {
        NLPIOUtils nlpioUtils = new NLPIOUtils();
        nlpioUtils.workingDirectory = dir;
        return nlpioUtils;
        
    }
    
    public String readFile(FileArticle fileArticle) {
        return null;
    }
    
    
    
}
