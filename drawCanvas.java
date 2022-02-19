import javax.swing.*;

public class drawCanvas {

    public static void main(String[] args) {
        int w = 968;
        int h = 552;
        JFrame f = new JFrame();

        f.setSize(w, h);
        f.setTitle("Audio Visualizer");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        java.awt.Dimension s = f.getContentPane().getSize();
        int sw = s.width;
        int sh = s.height;
        audioVisualizer dc = new audioVisualizer(sw, sh);
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


        java.awt.Dimension window = f.getBounds().getSize();
        w = window.width;
        h = window.height;
    }
}