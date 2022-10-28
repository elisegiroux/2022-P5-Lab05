// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet {
    public void paint(Graphics g) {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10, 10, width, height);

        //bottom right corner

        x1 = 10;
        y1 = 640;
        x2 = 990;
        y2 = 625;
        for (int k = 0; k < 49; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 20;
            y2 -= 12;

            // top right corner


        }
        x1 = 10;
        y1 = 640;
        x2 = 990;
        y2 = 640;

        for (int k = 0; k < 49; k++) {
            g.drawLine(x2, y2, x1, y1);
            x2 -= 20;
            y1 -= 13;


        }

    }
}