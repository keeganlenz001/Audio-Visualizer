import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class audioVisualizer extends JComponent {
    int width;
    int height;

    public audioVisualizer(int sw, int sh) {
        width = sw;
        height = sh;
    }

    protected void paintComponent(Graphics g) {
        // getMixerInfo getMixerInfo = new getMixerInfo();
        // getMixerInfo.getAudio();

        java.awt.Dimension s = getSize();
        int width = s.width;
        int height = s.height;

        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double bg = new Rectangle2D.Double(0, 0, width, height);
        g2d.setColor(new Color(13, 43, 69));
        g2d.setColor(Color.black);
        g2d.fill(bg);

        int colorCount = 16; // This number cannot be greater than 64
        int tileWidth = width / 100;
        int tileHeight = height / colorCount;
        double spacing = 1;


        int startRed = 128;
        int startGreen = 192;
        int startBlue = 255;

        int red = startRed;
        int green = startGreen;
        int blue = startBlue;

        int endRed = 192;
        int endGreen = 128;
        int endBlue = 255;


        // g2d.setStroke(new BasicStroke(4));
        if (height > colorCount) {
            for (int j = 0; j < (width / tileWidth) / spacing; j++) {
                double max_height = (Math.random() * (height + tileHeight)) - tileHeight;
                for (int i = 0; i < height / tileHeight; i++) {
                    if (i * tileHeight < max_height) {
                        g2d.setPaint(new Color(red, green, blue));
                        g2d.fillRect((int) (j * (tileWidth * spacing)) + 1, height - (i * tileHeight) - tileHeight, tileWidth, tileHeight);
                        // g2d.drawRect((int) (j * (tileWidth * spacing)), height - (i * tileHeight) - tileHeight - 1, tileWidth, tileHeight);
                        red = red + ((endRed - startRed) / colorCount);
                        green = green + ((endGreen - startGreen) / colorCount);
                        blue = blue + ((endBlue - startBlue) / colorCount);
                    }
                }
                red = startRed;
                green = startGreen;
                blue = startBlue;
            }
        }
        // repaint();
    }
}
