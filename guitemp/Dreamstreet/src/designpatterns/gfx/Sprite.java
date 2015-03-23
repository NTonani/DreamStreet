package designpatterns.gfx;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Sprite {
	//nav finals
	public static final int MOVE_UP = 0, MOVE_RIGHT = 1, MOVE_DOWN = 2, MOVE_LEFT = 3;
	
	private double x;
    private double y;
    private double dx;
    private double dy;

    private double width;
    private double height;
	private BufferedImage img;
    public double imgscale;
	
	public Sprite(BufferedImage img, double imgscale, double x, double y) {
        this.img = img;
        this.imgscale = imgscale;
		this.x = x;
		this.y = y;
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
	
	public void draw(Graphics g, Camera camera){
        double xOffset = camera.getXOffset();
        double yOffset = camera.getYOffset();
        double scale = camera.getScale();

		g.drawImage(img, (int)((this.x-xOffset)*scale), (int)((this.y-yOffset)*scale),(int)(32*scale*imgscale),(int)(32*scale*imgscale), null);
		g.setColor(Color.white);
        g.fillRect((int)((this.x-xOffset)*scale), (int)((this.y-yOffset)*scale),10,10);
        g.fillRect((int)((this.x-xOffset + (width - 17)*imgscale)*scale), (int)((this.y-yOffset+ (height - 4)*imgscale)*scale),10,10);
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
    }

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}



    public void setDy(double dy) {
        this.dy = dy;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

	
	
}
