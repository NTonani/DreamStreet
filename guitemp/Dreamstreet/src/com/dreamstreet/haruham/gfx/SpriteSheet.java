package com.dreamstreet.haruham.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/*
 * Non-monochromatic spritesheet
 */
public class SpriteSheet {
	private BufferedImage image = null;
	
	public SpriteSheet(String path){
		try {
			image = ImageIO.read(SpriteSheet.class.getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(image==null){
			return;
		}
	}
	
	public BufferedImage getSprite(int x, int y, int width, int height){
		return image.getSubimage(x, y, width, height);
	}
}

