import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel() {

    }

    // it gets called when we start the game
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawRect(100, 100, 200, 50);
    }
}
