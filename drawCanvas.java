import java.awt.*;
import javax.swing.*;

public class drawCanvas {
    public static void main(String[] args) {
        int w = 960;
        int h = 549;
        JFrame f = new JFrame();
        f.setSize(w, h);
        f.setTitle("Audio Visualizer");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        Dimension s = f.getContentPane().getSize();
        int sw = s.width;
        int sh = s.height;
        audioVisualizer dc = new audioVisualizer(sw, sh);
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}