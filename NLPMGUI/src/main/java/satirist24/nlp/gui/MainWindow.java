package satirist24.nlp.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created on 26.03.15.
 */
public class MainWindow extends JFrame {
    
    public MainWindow() {
        super("NLPM");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(900, 700));
        setLayout(new BorderLayout());
        
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new MainWindow();
    }
    
}
