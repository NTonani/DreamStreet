import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 * Created by Leland on 2/9/2015.
 */
public class GamePanel extends JPanel implements MouseInputListener {

    private int mX = 800;
    private int mY = 400;
    private int mDX = 50;
    private int mDY = -45;
    private int screenwidth;
    private int screenheight;
    private double slope = 0;
    private int mouseClickedX = 0;
    private int mouseClickedY = 0;

    private boolean dragged = false;


    public GamePanel(int width, int height) {
        screenwidth = width;
        screenheight = height;
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(mX, mY, 50, 50);
        g2d.drawString(slope + "", 50,50);
        if (dragged) {
            g2d.drawLine(mouseClickedX,mouseClickedY,(int)MouseInfo.getPointerInfo().getLocation().getX(),(int)MouseInfo.getPointerInfo().getLocation().getY());
        }
    }

    public void updateGame() {


        if (mX > screenwidth - 50) {
            mDX = -mDX;
        }
        else if (mX < 0) {
            mDX = -mDX;
        }

        if (mY > screenheight - 50) {
            mDY = -mDY;
        }
        else if (mY < 0) {
            mDY = -mDY;
        }

        mX += mDX;
        mY += mDY;


    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseClickedX = e.getX();
        mouseClickedY = e.getY();
        int xdir = mDX / Math.abs(mDX);
        int ydir = mDY / Math.abs(mDY);
        mDX = xdir * 5;
        mDY = ydir * 5;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (dragged) {
            findSlope(e.getX(), e.getY());
            dragged = false;
        }

        int xdir = mDX / Math.abs(mDX);
        int ydir = mDY / Math.abs(mDY);
        mDX = xdir * 35;
        mDY = ydir * 35;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        findSlope(e.getX(),e.getY());
        dragged  = true;
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


    private void findSlope(int endx, int endy)
    {
        double rise = endy - mouseClickedY;
        double run = endx - mouseClickedX;

        if (run == 0 && rise > 0)
        {
            slope = 2000;
           // ship.xdir = 0;
        }
        else if (run == 0 && rise < 0)
        {
            slope = -2000;
           // ship.xdir = 0;
        }
        else if (run != 0)
        {
            slope = rise / run;
            if (run > 0)
            {
              //  ship.xdir = 1;
            }
            else
            {
               // ship.xdir = -1;
            }
        }
    }
}
