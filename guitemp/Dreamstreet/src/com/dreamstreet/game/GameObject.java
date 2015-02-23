package com.dreamstreet.game;

import java.awt.*;

/**
 * Created by Leland on 2/12/2015.
 */
public abstract class GameObject {

    protected int x;
    protected int y;

    protected double dX;
    protected double dY;

    public GameObject(int x, int y, double dX, double dY) {
        this.x = x;
        this.y = y;
        this.dX = dX;
        this.dY = dY;
    }

    public abstract void tick();
    public abstract void render(Graphics g);



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getdX() {
        return dX;
    }

    public double getdY() {
        return dY;
    }

    public void setdX(double dX) {
        this.dX = dX;
    }

    public void setdY(double dY) {
        this.dY = dY;
    }
}
