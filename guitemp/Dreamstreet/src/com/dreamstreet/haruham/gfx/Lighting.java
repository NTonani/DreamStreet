package com.dreamstreet.haruham.gfx;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Lighting {
	//nav finals
	public static final int MOVE_UP = 0, MOVE_RIGHT = 1, MOVE_DOWN = 2, MOVE_LEFT = 3;

	private int x,y;
	private BufferedImage img;

	public Lighting(BufferedImage img, int x, int y){
		this.setX(x);
		this.setY(y);
		this.img = img;
	}

	public Lighting(BufferedImage img){
		this.img = img;
		this.setX(0);
		this.setY(0);
	}

	public void draw(Graphics g, int scale){
		g.drawImage(img, this.x, this.y,66*scale,36*scale, null);
	}

	public void navigate(int nav, int scale){
		switch(nav){
			default:
				System.out.println("Not navigating..?");
				break;
			case MOVE_UP:
				this.y-=32*scale;
				break;
			case MOVE_RIGHT:
				this.x+=32*scale;
				break;
			case MOVE_DOWN:
				this.y+=32*scale;
				break;
			case MOVE_LEFT:
				this.x-=32*scale;
				break;

		}
	}
	
	public BufferedImage getImage(){
		return this.img;
	}
	
	public void setImage(BufferedImage img){
		this.img = img;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
}
