package view;

import components.RoundButton;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class LoginView extends JFrame {

    private JPanel loginPanel;
    private RoundButton button1;
    private RoundButton button2;
    private RoundButton button3;
    private RoundButton button4;
    private RoundButton button5;
    private RoundButton button6;
    private RoundButton button7;
    private RoundButton button8;
    private RoundButton button9;
    private RoundButton buttonBack;
    private RoundButton button0;
    private RoundButton buttonOK;

    public LoginView() {
        init();
    }

    private void init() {
        loginPanel.setLayout(new GridLayout(4, 3));
        loginPanel.setBorder(new LineBorder(Color.black, 2, true));
        Border lineBorder = BorderFactory.createLineBorder(Color.black);
        button1 = new RoundButton("1");
        button2 = new RoundButton("2");
        button3 = new RoundButton("3");
        button4 = new RoundButton("4");
        button5 = new RoundButton("5");
        button6 = new RoundButton("6");
        button7 = new RoundButton("7");
        button8 = new RoundButton("8");
        button9 = new RoundButton("9");
        buttonBack = new RoundButton("Back");
        button0 = new RoundButton("0");
        buttonOK = new RoundButton("OK");
        loginPanel.setBorder(lineBorder);
        loginPanel.add(button1);
        loginPanel.add(button2);
        loginPanel.add(button3);
        loginPanel.add(button4);
        loginPanel.add(button5);
        loginPanel.add(button6);
        loginPanel.add(button7);
        loginPanel.add(button8);
        loginPanel.add(button9);
        loginPanel.add(buttonBack);
        loginPanel.add(button0);
        loginPanel.add(buttonOK);
    }

    public JPanel getLoginPanel() {
        return loginPanel;
    }
}
