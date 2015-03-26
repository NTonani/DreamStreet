package com.dreamstreet.haruham.gfx;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Sprite {

	private double x;
    private double y;

    private double velocity;

    private double dx;
    private double dy;

    private double dest_x;
    private double dest_y;

    private double width;
    private double height;
	private BufferedImage img;
    public double imgscale;
	
	public Sprite(BufferedImage img, double imgscale, double x, double y) {
        this.img = img;
        this.imgscale = imgscale;
		this.x = x;
		this.y = y;
        this.velocity = 3.0;
        this.dx = 0;
        this.dy = 0;
        this.width = 32;
        this.height = 32;
	}
	
	public Sprite(BufferedImage img, double imgscale){
		this.img = img;
        this.imgscale = imgscale;
        this.x = 0;
		this.y = 0;
        this.dx = 0;
        this.dy = 0;
        this.width = 32;
        this.height = 32;
	}

    public void tick() {
        if ((x + dx > dest_x && dx > 0) || (x + dx < dest_x && dx < 0)) {
            dx = 0;
            x = dest_x;
        }
        if ((y + dy > dest_y && dy > 0) || (y + dy < dest_y && dy < 0)) {
            dy = 0;
            y = dest_y;
        }
   /*     }else if  {
            dx = 0;
        }
        if (y > dest_y && dy > 0) {
            dy = 0;
        }else if (y < dest_y && dy < 0) {
            dy = 0;
        }*/
        x += dx;
        y += dy;
    }
	
	public void draw(Graphics g, Camera camera){
        double xOffset = camera.getXOffset();
        double yOffset = camera.getYOffset();
        double scale = camera.getScale();

		g.drawImage(img, (int)((x-xOffset)*scale), (int)((y-yOffset)*scale),(int)(32*scale*imgscale),(int)(32*scale*imgscale), null);
		g.setColor(Color.white);
        g.fillRect((int)((x-xOffset)*scale), (int)((y-yOffset)*scale),10,10);
        g.fillRect((int)((x-xOffset + (width - 17)*imgscale)*scale), (int)((y-yOffset+ (height - 4)*imgscale)*scale),5,5);
        g.fillRect((int)((dest_x + (width-17)*imgscale -xOffset)*scale), (int) ((dest_y +(height-4)*imgscale - yOffset) * scale),5,5);

    }

	
	public BufferedImage getImage(){
		return this.img;
	}
	
	public void setImage(BufferedImage img){
		this.img = img;
	}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
        dest_x = x;
    }

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
        dest_y = y;
	}

    public double getDy() {
        return dy;
    }

    public double getDx() {
        return dx;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }


    private Direction findSlope()
    {
        double rise = dest_y - y;
        double run = dest_x - x;

        int xdir = 0;
        double slope = 0;
        if (run == 0 && rise > 0) {
            slope = 2000;
            xdir = 0;
        }else if (run == 0 && rise < 0) {
            slope = -2000;
            xdir = 0;
        }else if (run != 0) {
            slope = rise / run;
            if (run > 0) {
                xdir = 1;
            }else{
                xdir = -1;
            }
        }

        return new Direction(xdir, slope);
    }

    public double findDX(double slope) {
        return Math.sqrt(Math.pow(velocity, 2) / (1 + Math.pow(slope, 2)));
    }

    public void move(double dest_x, double dest_y)
    {
        this.dest_x = dest_x - (width - 17) * imgscale;
        this.dest_y = dest_y - (height - 4) * imgscale;

        Direction dir = findSlope();

        dx = findDX(dir.slope) * dir.xdir;
        dy = dir.slope * dx;


        if (dir.slope == 2000 || dir.slope == -2000)
        {
            dy = velocity * dir.slope / Math.abs(dir.slope);
        }
    }

    public void stop() {
        dest_x = x;
        dest_y = y;
        dx = 0;
        dy = 0;
    }

	
	
}
