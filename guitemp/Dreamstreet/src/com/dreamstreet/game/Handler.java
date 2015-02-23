package com.dreamstreet.game;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by Leland on 2/12/2015.
 */
public class Handler {

    LinkedList<GameObject> objects = new LinkedList<GameObject>();

    public void tick() {
        for (int i = 0; i < objects.size(); i++) {
            objects.get(i).tick();
        }
    }

    public void render(Graphics g) {
        for (int i = 0; i < objects.size(); i++) {
            objects.get(i).render(g);
        }
    }

    public void addObject(GameObject object) {
        objects.add(object);
    }

    public void removeObject(GameObject object) {
        objects.remove(object);
    }

    public GameObject getObject(int index) {
        return objects.get(index);
    }
}

