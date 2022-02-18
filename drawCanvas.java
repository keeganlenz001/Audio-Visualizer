import javax.swing.*;

public class drawCanvas {

    public static void main(String[] args) {
        int w = 960;
        int h = 549;
        JFrame f = new JFrame();
        refresh r = new refresh();
        r.refreshWindow(w, h, f);
    }
}