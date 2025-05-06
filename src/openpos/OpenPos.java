package openpos;

import java.awt.BorderLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import view.LogInPanel;
import view.MainFrame;

/**
 *
 * @author Max Sainsbury
 */
public class OpenPos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        JFrame frame = new MainFrame();
        JPanel login = new LogInPanel();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(login);
        frame.setVisible(true);
    }
    
}
