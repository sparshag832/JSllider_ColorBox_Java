import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;

public class Myslider {
    Frame f, f1;
    Panel p1, p2;
    JSlider js1, js2, js3;
    Label l;
    static int x, y, z;

    Myslider() {
        f = new Frame();
        f.setLayout(new GridLayout(2, 1));

        p1 = new Panel();
        p2 = new Panel();
        js1 = new JSlider(0, 255, 0);
        js2 = new JSlider(0, 255, 0);
        js3 = new JSlider(0, 255, 0);
        l = new Label();
        l.setSize(400, 4);
        l.setBackground(Color.GRAY);
        l.setForeground(Color.white);
        l.setText("R=" + x + " G=" + y + " B=" + z);
        js1.setBackground(Color.red);
        js2.setBackground(Color.green);
        js3.setBackground(Color.blue);
        js1.setMajorTickSpacing(10);
        js1.setMajorTickSpacing(50);
        js1.setPaintTicks(true);
        js1.setPaintLabels(true);
        js2.setMajorTickSpacing(10);
        js2.setMajorTickSpacing(50);
        js2.setPaintTicks(true);
        js2.setPaintLabels(true);
        js3.setMajorTickSpacing(10);
        js3.setMajorTickSpacing(50);
        js3.setPaintTicks(true);
        js3.setPaintLabels(true);

        p1.setLayout(new GridLayout(3, 1));
        f.add(l, BorderLayout.SOUTH);
        p1.add(js1);
        p1.add(js2);
        p1.add(js3);

        js1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                x = js1.getValue();
                l.setText("R=" + x + " G=" + y + " B=" + z);
                Color c = new Color(x, y, z);
                p2.setBackground(c);

            }

        });
        js2.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                y = js2.getValue();
                l.setText("R=" + x + " G=" + y + " B=" + z);
                Color c = new Color(x, y, z);
                p2.setBackground(c);

            }

        });
        js3.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                z = js3.getValue();
                l.setText("R=" + x + " G=" + y + " B=" + z);
                Color c = new Color(x, y, z);
                p2.setBackground(c);

            }

        });

        BorderLayout bl = new BorderLayout();

        p2.setLayout(bl);
        p2.add(l, bl.SOUTH);
        Color c = new Color(x, y, z);
        p2.setBackground(c);

        f.add(p1);
        f.add(p2);

        f.setVisible(true);
        f.setSize(400, 400);
    }

    public static void main(String[] args) {
        Myslider s = new Myslider();
    }

}