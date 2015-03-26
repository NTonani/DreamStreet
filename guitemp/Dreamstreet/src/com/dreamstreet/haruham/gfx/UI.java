package com.dreamstreet.haruham.gfx;

import com.dreamstreet.haruham.Game;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Leland on 3/23/2015.
 */
public class UI {

    private SpriteSheet healthsheet = new SpriteSheet("/healthorb.png");
    private BufferedImage healthorb = healthsheet.getSprite(0,0,64,64);

    private SpriteSheet manasheet = new SpriteSheet("/manaorb.png");
    private BufferedImage manaorb = manasheet.getSprite(0, 0, 64, 64);

    private SpriteSheet orbsheet = new SpriteSheet("/orbbase.png");
    private BufferedImage baseorb = orbsheet.getSprite(0,0,64,64);

    public int x;
    public int y;
    public double currhealth;
    public double maxhealth;

    public double currmana;
    public double maxmana;

    public UI() {
        x = 600;
        y = Game.HEIGHT * Game.SCALE;
        currhealth = 1000;
        maxhealth = 1000;

        currmana = 1000;
        maxmana = 1000;
    }


    public void tick() {
        if (currhealth > 0){
            currhealth -= 2;
        }
    }

    public void draw(Graphics g) {
        g.drawImage(healthorb,x,y-(int)(currhealth/maxhealth*128),728,y,0,64-(int)(currhealth/maxhealth*64),64,64,null);
        g.drawImage(baseorb,x-1,y-129,130,130,null);

        g.drawImage(manaorb,x+600,y-(int)(currmana/maxmana*128),1328,y,0,64-(int)(currmana/maxmana*64),64,64,null);
        g.drawImage(baseorb,x+599,y-129,130,130,null);
    }


}
