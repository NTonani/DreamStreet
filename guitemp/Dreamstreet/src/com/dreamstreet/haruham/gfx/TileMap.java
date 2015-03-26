package com.dreamstreet.haruham.gfx;

import com.dreamstreet.haruham.Game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class TileMap {

	private ArrayList<Rectangle> tiles;
	private ArrayList<Image> tileImg;
	private int mapSize;
	//Tile images
	public Image TILE_STONE,TILE_GRASS,TILE_WATER;

	public TileMap(String path, SpriteSheet map){
		
		TILE_GRASS = new ImageIcon(map.getSprite(107, 33, 32, 32)).getImage();//1
		TILE_STONE = new ImageIcon(map.getSprite(173, 0, 32, 32)).getImage();//2
		TILE_WATER = new ImageIcon(map.getSprite(305,165,32,32)).getImage();//3
		
		tiles = new ArrayList<Rectangle>();
		tileImg = new ArrayList<Image>();
		loadMap(path);	
	}
	
	private void loadMap(String path){
		try{
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			String curLine;
			
			int row = 0;
			while((curLine = br.readLine())!=null){
				if(curLine.isEmpty())
					continue;
				
				String[] values = curLine.trim().split(" ");
				int col = 0;
				for(String val : values){
					if(!val.isEmpty()){
						int id = Integer.parseInt(val);
						if(id==1){
							tileImg.add(TILE_GRASS);
							tiles.add(new Rectangle(col*32,row*32,32,32));
						}else if(id==2){
							tileImg.add(TILE_STONE);
							tiles.add(new Rectangle(col*32,row*32,32,32));
						}else if(id==3){
							tileImg.add(TILE_WATER);
							tiles.add(new Rectangle(col*32,row*32,32,32));
						}
	
						col++;
					}
				}
				mapSize = col;
				row++;
			}
			mapSize *= row;
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public void draw(Graphics g, Camera camera){
        double xOffset = camera.getXOffset();
        double yOffset = camera.getYOffset();
        double scale = camera.getScale();

        for(int i =0;i<mapSize;i++) {
			// only draws the tile if its in the bounds of the screen
			if ((tiles.get(i).x-xOffset)*scale > (0 - tiles.get(i).height*scale * 1.1)  &&  (tiles.get(i).x-xOffset)*scale < Game.WIDTH*Game.SCALE * 1.1
			&& (tiles.get(i).y-yOffset)*scale > (0 - tiles.get(i).width * scale * 1.1) && (tiles.get(i).y-yOffset)*scale <  (Game.HEIGHT * Game.SCALE * 1.1))
			{
				g.drawImage(tileImg.get(i),(int)((tiles.get(i).x-xOffset)*scale),(int)((tiles.get(i).y-yOffset)*scale),(int)(tiles.get(i).height*scale)+1,(int)(tiles.get(i).width*scale)+1,null);
			}

		}
	}


}
