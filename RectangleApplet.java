// Write an applet to display a rectangle with specified coordinate
// and colour passed as parameter from the HTML file.

import javax.swing.*;
import java.awt.*;

public class RectangleApplet extends JPanel {

    int x, y, w, h;
    Color rectColor;

    public RectangleApplet(int x, int y, int w, int h, String colorName) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

        // Convert color name to actual Color
        switch (colorName.toLowerCase()) {
            case "red":
                rectColor = Color.RED;
                break;
            case "green":
                rectColor = Color.GREEN;
                break;
            case "blue":
                rectColor = Color.BLUE;
                break;
            default:
                rectColor = Color.BLACK;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(rectColor);
        g.fillRect(x, y, w, h);
    }

    public static void main(String[] args) {
        // Pass values (similar to parameters)
        int x = 50, y = 60, width = 200, height = 120;
        String color = "red";

        JFrame frame = new JFrame("Rectangle Display");
        RectangleApplet panel = new RectangleApplet(x, y, width, height, color);

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
