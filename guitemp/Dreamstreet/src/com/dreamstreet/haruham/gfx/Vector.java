package com.dreamstreet.haruham.gfx;

/**
 * Created by Leland on 2/25/2015.
 */
public class Vector {

    public double slope;
    public byte xdir;

    public int x, y;

   // public double distance;

    public Vector(double slope, byte xdir, int x, int y){//, double distance) {
        this.slope = slope;
        this.xdir = xdir;
        this.x = x;
        this.y = y;
       // this.distance = distance;
    }
}
