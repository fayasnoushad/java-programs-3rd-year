// Create an applet for a displaying smiling face.

import javax.swing.*;
import java.awt.*;

public class Smiley extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(95, 110, 25, 25);
        g.fillOval(180, 110, 25, 25);

        // Smile
        g.drawArc(100, 130, 100, 80, 0, -180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiling Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 350);
        frame.add(new Smiley());
        frame.setVisible(true);
    }
}
