package view;

import javax.swing.*;

public class MainFrame extends JFrame {
    private JPanel mainPanel;

    public MainFrame() {
        init();

    }

    private void init() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(mainPanel);
        LoginView loginView = new LoginView();
        mainPanel.add(loginView.getLoginPanel());
    }
}
