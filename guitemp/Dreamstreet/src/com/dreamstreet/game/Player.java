package com.dreamstreet.game;

import java.awt.*;

/**
 * Created by Leland on 2/12/2015.
 */
public class Player extends GameObject {



    public Player(int x, int y, double dX, double dY) {
        super(x, y, dX, dY);
    }

    @Override
    public void tick() {
        x += (int)dX;
        y += (int)dY;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(x,y, 50,50);
    }
}
