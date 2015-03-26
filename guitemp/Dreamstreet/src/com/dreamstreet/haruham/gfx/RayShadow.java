package com.dreamstreet.haruham.gfx;

import java.awt.*;

/**
 * Created by Leland on 2/25/2015.
 */
public class RayShadow {

    public Rectangle obstacle;
    int width;
    int[] xpoints = new int[4];
    int[] ypoints = new int[4];

    int[] xtest = new int[8];
    int[] ytest = new int[8];
    Vector[] corners = new Vector[4];// ,c4};

    int polyi = 0;
    int reversed = 3;


    public RayShadow(Rectangle obstacle, int width) {
        this.obstacle = obstacle;
        this.width = width;


        Vector c1 = findSlope(obstacle.x, obstacle.y, 10,10);
        Vector c2 = findSlope(obstacle.x + obstacle.width, obstacle.y, 11, 11);
        Vector c3 = findSlope(obstacle.x, obstacle.y + obstacle.height, 11, 11);
        Vector c4 = findSlope(obstacle.x+ obstacle.width, obstacle.y + obstacle.height, 11,11);

        corners[0] = c1;
        corners[1] = c2;
        corners[2] = c3;
        corners[3] = c4;

    }

    public void tick(int sX, int sY) {
        Vector c1 = findSlope(obstacle.x, obstacle.y, sX,sY);
        Vector c2 = findSlope(obstacle.x + obstacle.width, obstacle.y, sX, sY);
        Vector c3 = findSlope(obstacle.x, obstacle.y + obstacle.height, sX, sY);
        Vector c4 = findSlope(obstacle.x + obstacle.width, obstacle.y + obstacle.height, sX, sY);

        corners[0] = c1;
        corners[1] = c2;
        corners[2] = c3;
        corners[3] = c4;

        polyi = 0;
        reversed = 3;
        for (int i = 0; i < corners.length; i++) {
            if (corners[i].xdir < 0) {
                int y = findY(corners[i].slope, 0 - corners[i].x);

                if (!detectCollision(corners[i].x + 15, corners[i].y + findY(corners[i].slope, 15), obstacle)
                        & !detectCollision(corners[i].x - 15, corners[i].y + findY(corners[i].slope, -15), obstacle)) {
                    xpoints[polyi] = corners[i].x;
                    ypoints[polyi] = corners[i].y;
                    xpoints[reversed] = 0;
                    ypoints[reversed] = corners[i].y + y;

                    reversed--;
                    polyi++;
                }
            }else if (corners[i].xdir > 0) {
                int y = findY(corners[i].slope, width - corners[i].x);

                if (!detectCollision(corners[i].x + 15, corners[i].y + findY(corners[i].slope, 15), obstacle)
                        & !detectCollision(corners[i].x - 15, corners[i].y + findY(corners[i].slope, -15), obstacle)) {
                    xpoints[polyi] = corners[i].x;
                    ypoints[polyi] = corners[i].y;
                    xpoints[reversed] = width;
                    ypoints[reversed] = corners[i].y + y;

                    reversed--;
                    polyi++;
                }
            }
        }

        for (int i = 0; i < corners.length; i++) {
            if (corners[i].xdir < 0) {
                int y = findY(corners[i].slope, 0 - corners[i].x);

                xtest[i] = corners[i].x;
                ytest[i] = corners[i].y;
                xtest[i+4] = 0;
                ytest[i+4] = corners[i].y + y;
            }else if (corners[i].xdir > 0) {

                int y = findY(corners[i].slope, width - corners[i].x);

                xtest[i] = corners[i].x;
                ytest[i] = corners[i].y;
                xtest[i+4] = width;
                ytest[i+4] = corners[i].y + y;
            }
        }

    }

    public double findHyp(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }


    private int findY(double slope, int xdist) {
        int y = (int)(slope * xdist);
        return y;
    }

    private Vector findSlope(int endx, int endy, int startx, int starty)
    {
        double rise = endy - starty;
        double run = endx - startx;

        double slope = 0;
        byte xdir = 0;
        if (run == 0 && rise > 0) {
            slope = 2000;
            xdir = 0;
        }
        else if (run == 0 && rise < 0) {
            slope = -2000;
            xdir = 0;
        }
        else if (run != 0) {
            slope = rise / run;
            if (run > 0) {
                xdir = 1;
            } else {
                xdir = -1;
            }
        }

       // double distance = findHyp(run, rise);
        return new Vector(slope,xdir, endx, endy);//, distance);
    }

    private boolean detectCollision(int x, int y, Rectangle obstacle) {

        if ((x <= obstacle.x + obstacle.width & x  >= obstacle.x)
                & (y  <= obstacle.y + obstacle.height & y >= obstacle.y)) {
            return true;
        }

        return false;
    }

    public void draw(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(obstacle.x, obstacle.y, obstacle.width, obstacle.height);
        //g.setColor(Color.RED);
        g.setColor(Color.black);
        g.fillPolygon(xpoints, ypoints, xpoints.length);

        g.setColor(Color.WHITE);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 25));

        for (int i= 0; i < xpoints.length; i++) {

       //     g.fillRect(xpoints[i], ypoints[i], 2,2);
        }
        for (int i = 0; i < corners.length; i++) {
           // g.drawRect(corners[i].x + 10, corners[i].y + findY(corners[i].slope, 10),3,3);
            //g.drawRect(corners[i].x - 10, corners[i].y + findY(corners[i].slope, -10),3,3);
          //  g.drawLine(xtest[i], ytest[i], xtest[i+4], ytest[i+4]);
        }

    //    g.drawString(polyi + " ," + reversed, 200, 40);

    }

}


/*
=
public class RayShadow {

    public Rectangle obstacle;
    int width;
    int[] xpoints = new int[8];
    int[] ypoints = new int[8];
    Vector[] corners = new Vector[4];// ,c4};

    public RayShadow(Rectangle obstacle, int width) {
        this.obstacle = obstacle;
        this.width = width;


        Vector c1 = findSlope(obstacle.x, obstacle.y, 10,10);
        Vector c2 = findSlope(obstacle.x + obstacle.width, obstacle.y, 11, 11);
        Vector c3 = findSlope(obstacle.x, obstacle.y + obstacle.height, 11, 11);
        Vector c4 = findSlope(obstacle.x+ obstacle.width, obstacle.y + obstacle.height, 11,11);

        corners[0] = c1;
        corners[1] = c2;
        corners[2] = c3;
        corners[3] = c4;

    }

    public void tick(int sX, int sY) {
        Vector c1 = findSlope(obstacle.x, obstacle.y, sX,sY);
        Vector c2 = findSlope(obstacle.x + obstacle.width, obstacle.y, sX, sY);
        Vector c3 = findSlope(obstacle.x, obstacle.y + obstacle.height, sX, sY);
        Vector c4 = findSlope(obstacle.x+ obstacle.width, obstacle.y + obstacle.height, sX, sY);

        corners[0] = c1;
        corners[1] = c2;
        corners[2] = c3;
        corners[3] = c4;
        for (int i = 0; i < corners.length; i++) {
            if (corners[i].xdir < 0) {
                int y = findY(corners[i].slope, 0 - corners[i].x);

                xpoints[i] = corners[i].x;
                ypoints[i] = corners[i].y;
                xpoints[i+4] = 0;
                ypoints[i+4] = corners[i].y + y;
            }else if (corners[i].xdir > 0) {

                int y = findY(corners[i].slope, width - corners[i].x);

                xpoints[i] = corners[i].x;
                ypoints[i] = corners[i].y;
                xpoints[i+4] = width;
                ypoints[i+4] = corners[i].y + y;
            }
        }
    }

    public static double FindXDist(double hyp, double slope)
    {
        return Math.sqrt(Math.pow(hyp, 2) / (1 + Math.pow(slope, 2)));
    }


    private int findY(double slope, int xdist) {
        int y = (int)(slope * xdist);
        return y;
    }

    private Vector findSlope(int endx, int endy, int startx, int starty)
    {
        double rise = endy - starty;
        double run = endx - startx;

        double slope = 0;
        byte xdir = 0;
        if (run == 0 && rise > 0)
        {
            slope = 2000;
            xdir = 0;
        }
        else if (run == 0 && rise < 0)
        {
            slope = -2000;
            xdir = 0;
        }
        else if (run != 0)
        {
            slope = rise / run;
            if (run > 0)
            {
                xdir = 1;
            }
            else
            {
                xdir = -1;
            }
        }
        return new Vector(slope,xdir, endx, endy);
    }

    private boolean detectCollision()
    {

        Point m1 = this.PointToClient(Cursor.Position);
        for (int ix = placed_shapes.Count - 1; ix >= 0; ix--)
        {
            Rectangle rect = (Rectangle)placed_shapes[ix];
            if ((m1.X <= rect.X + rect.Width & m1.X  >= rect.X)
                    & (m1.Y  <= rect.Y + rect.Height & m1.Y >= rect.Y))
            {
                return true;
            }
        }
        return false;
    }

    public void draw(Graphics g){
        g.setColor(Color.black);
        g.fillRect(obstacle.x, obstacle.y, obstacle.width, obstacle.height);
        // g.fillPolygon(xpoints, ypoints, xpoints.length);
        g.setColor(Color.WHITE);

        for (int i = 0; i < corners.length; i++) {
            g.drawLine(xpoints[i], ypoints[i], xpoints[i+4], ypoints[i+4]);
        }


    }

}

 */