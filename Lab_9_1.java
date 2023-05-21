/*
 * Labor 9., 9.1.: Lab_9_1.java
 */
package lab_9_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Beregszászi István
 * @since 2015.11.12.
 */
public class Lab_9_1 extends JFrame implements WindowListener,
        MouseMotionListener, MouseListener {

    Lab_9_1() {
        super("Rajzolás egérrel");
        setSize(400, 300);
        setVisible(true);
        addWindowListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    Point p1 = null;

    public static void main(String[] args) {
        new Lab_9_1();
    }

    public void windowOpened(WindowEvent we) {
    }

    public void windowClosing(WindowEvent we) {
        setVisible(false);
        System.exit(0);
    }

    public void windowClosed(WindowEvent we) {

    }

    public void windowIconified(WindowEvent we) {

    }

    public void windowDeiconified(WindowEvent we) {

    }

    public void windowActivated(WindowEvent we) {
    }

    public void windowDeactivated(WindowEvent we) {

    }

    public void mouseDragged(MouseEvent me) {
        Point p2 = me.getPoint();
        Graphics g = getGraphics();
        g.setColor(new Color(116, 27, 189));
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
        p1 = p2;
    }

    public void mouseMoved(MouseEvent me) {
    }

    public void mouseClicked(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
        p1 = me.getPoint();
    }

    public void mouseReleased(MouseEvent me) {

    }

    public void mouseEntered(MouseEvent me) {

    }

    public void mouseExited(MouseEvent me) {

    }

}
