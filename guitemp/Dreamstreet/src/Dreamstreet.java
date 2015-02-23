
import javax.swing.*;
import java.awt.*;

/**
 * Created by Leland on 2/9/2015.
 */
public class Dreamstreet {

    private static boolean isRunning = true;


    public static void setIsRunning(boolean running) {
        isRunning = running;
    }
/*
    public static void main(String[] args) throws InterruptedException {
        JFrame gameframe = new JFrame("Dreamstreet");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screensize = tk.getScreenSize();
        GamePanel game = new GamePanel(screensize.width, screensize.height);

        gameframe.add(game);
        gameframe.setExtendedState(JFrame.MAXIMIZED_BOTH);

        gameframe.setUndecorated(true);
        gameframe.setVisible(true);
        gameframe.createBufferStrategy(2);

        gameframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        while (isRunning) {
            game.updateGame();
            game.repaint();
            Thread.sleep(15);
        }

    }*/
}
