package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

public class RoundButton extends JButton {

    private boolean mouseOver = false;
    private boolean mousePressed = false;

    public RoundButton(String text) {
        super(text);
        this.setBounds(10,10,100,100);
        this.setBorderPainted(false);

        MouseAdapter mouseAdapter = new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if(contains(e.getX(), e.getY())) {
                    mousePressed = true;
                    repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mousePressed = false;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseOver = false;
                mousePressed = false;
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                mouseOver = contains(e.getX(), e.getY());
                repaint();
            }
        };

        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);
    }

    private int getDiameter(){
        return Math.min(getWidth(), getHeight());
    }

    @Override
    public Dimension getPreferredSize(){
        FontMetrics metrics = getGraphics().getFontMetrics(getFont());
        int minDiameter = 10 + Math.max(metrics.stringWidth(getText()), metrics.getHeight());
        return new Dimension(minDiameter, minDiameter);
    }

    @Override
    public boolean contains(int x, int y){
        int radius = getDiameter()/2;
        return Point2D.distance(x, y, (double)this.getWidth()/2, (double) this.getHeight()/2) < radius;
    }

    @Override
    public void paintComponent(Graphics g) {
        int diameter = getDiameter();
        int radius = diameter/2;

        if(mousePressed){
            g.setColor(Color.LIGHT_GRAY);
        }
        else{
            g.setColor(Color.WHITE);
        }
        g.fillOval(getWidth()/2 - radius, getHeight()/2 - radius, diameter, diameter);

        if(mouseOver){
            g.setColor(Color.BLUE);
        }
        else{
            g.setColor(Color.BLACK);
        }
        g.drawOval(getWidth()/2 - radius, getHeight()/2 - radius, diameter, diameter);

        g.setColor(Color.BLACK);
        g.setFont(getFont());
        FontMetrics metrics = g.getFontMetrics(getFont());
        int stringWidth = metrics.stringWidth(getText());
        int stringHeight = metrics.getHeight();
        g.drawString(getText(), getWidth()/2 - stringWidth/2, getHeight()/2 + stringHeight/4);
    }
}
