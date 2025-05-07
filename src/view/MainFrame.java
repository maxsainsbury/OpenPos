package view;

import javax.swing.*;

public class MainFrame extends JFrame {
    private JPanel panel1;

    public MainFrame() {
        init();

    }

    private void init() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1.setBounds(0,0,this.getWidth(),this.getHeight());
        this.add(panel1);

    }
}
