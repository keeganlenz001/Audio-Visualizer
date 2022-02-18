import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class audioVisualizer extends JComponent {
    // int[][] palette = {
    //     {13,43,69}, {15,44,70}, {16,46,72}, {18,47,73}, {19,49,75}, {21,50,76}, {23,52,78}, {24,53,79}, {26,54,80}, {27,56,82}, {29,57,83}, {30,59,85},
    //     {32,60,86}, {36,62,88}, {41,63,89}, {45,65,91}, {49,66,92}, {54,68,94}, {58,69,95}, {62,71,97}, {67,72,98}, {71,74,100}, {75,75,101}, {80,77,103},
    //     {84,78,104}, {89,80,106}, {94,82,107}, {98,85,109}, {103,87,110}, {108,89,111}, {113,91,113}, {117,94,114}, {122,96,116}, {127,98,117}, {132,100,119}, {136,103,120},
    //     {141,105,122}, {147,107,119}, {152,109,116}, {158,111,114}, {163,113,111}, {169,115,108}, {174,117,106}, {180,119,103}, {186,121,100}, {191,123,97}, {197,125,94}, {202,127,92},
    //     {208,129,89}, {212,132,89}, {216,136,90}, {220,139,90}, {224,143,91}, {228,146,91}, {231,149,91}, {235,153,92}, {239,156,92}, {243,160,93}, {247,163,93}, {251,167,94},
    //     {255,170,94}, {255,174,100}, {255,177,106}, {255,180,111}, {255,184,117}, {255,187,123}, {255,191,129}, {255,195,134}, {255,198,140}, {255,202,146}, {255,205,151}, {255,209,157},
    //     {255,212,163}, {255,214,167}, {255,216,171}, {255,218,176}, {255,220,180}, {255,222,184}, {255,224,189}, {255,226,193}, {255,228,197}, {255,230,201}, {255,232,206}, {255,234,210},
    //     {255,236,214}
    // };

    int width;
    int height;

    public audioVisualizer(int sw, int sh) {
        width = sw;
        height = sh;
    }


    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double bg = new Rectangle2D.Double(0, 0, width, height);
        g2d.setColor(new Color(13, 43, 69));
        g2d.setColor(Color.black);
        g2d.fill(bg);

        // int tileHeight = height / palette.length;
        int colorCount = 16;
        int tileWidth = 10;
        int tileHeight = height / colorCount;

        int increment = (int) (255 / colorCount);
        double spacing = 1;
        int count1 = 0;
        int count2 = 0;
        int red = 0;
        int green = 20;
        int blue = 20;

        for (int j = 0; j < (width / tileWidth) / spacing; j++) {
            double max_height = Math.random() * height;
            for (int i = 1; i < colorCount + 1; i++) {
                if (i * tileHeight < max_height) {
                    if (green < 127 && blue < 127) {
                        g2d.setPaint(new Color(red, green, blue));
                        g2d.fillRect((int) (j * (tileWidth * spacing)), height - (i * tileHeight), tileWidth, tileHeight);
                        green = green + increment + count1;
                        blue = blue + increment + count1;
                        count1++;
                    }
                    else if (red < 255 && green < 255 && blue < 255) {
                        g2d.setPaint(new Color(red, green, blue));
                        g2d.fillRect((int) (j * (tileWidth * spacing)), height - (i * tileHeight), tileWidth, tileHeight);
                        red = red + increment + count2;
                        green = green + increment - count2;
                        blue = blue + increment - count2;
                        count2++;
                    }else{
                        g2d.setPaint(Color.white);
                        g2d.fillRect((int) (j * (tileWidth * spacing)), height - (i * tileHeight), tileWidth, tileHeight);
                    }
                }
            }
            count1 = 0;
            count2 = 0;
            red = 0;
            green = 20;
            blue = 20;
        }
    }
}
