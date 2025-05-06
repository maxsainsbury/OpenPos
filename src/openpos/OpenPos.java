package openpos;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
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
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    
}
