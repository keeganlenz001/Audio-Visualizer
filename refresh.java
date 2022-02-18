import java.awt.*;
import javax.swing.*;

public class refresh {
    public void refreshWindow(int w, int h, JFrame f) {
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


        Dimension window = f.getBounds().getSize();
        w = window.width;
        h = window.height;
       
        // refreshWindow(w, h ,f); 
    }
}
