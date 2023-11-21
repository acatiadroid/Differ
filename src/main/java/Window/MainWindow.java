package Window;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow {
    public MainWindow() {
        JFrame mainFrame = new JFrame("Differ");
        JPanel mainLayout = new JPanel(new BorderLayout());

        JLabel mainLabel = new JLabel("<html><p style=\"background-color: yellow;\">Test</p><br style=\"padding: none;\"><p>Normal line</p></html>");

        mainLayout.add(mainLabel, BorderLayout.PAGE_START);

        mainFrame.setContentPane(mainLayout);
        
        mainFrame.setSize(300, 325);
        mainFrame.setVisible(true);
    }
    
}
