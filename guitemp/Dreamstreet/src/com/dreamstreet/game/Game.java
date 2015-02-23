package com.dreamstreet.game;

import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by Leland on 2/11/2015.
 */
public class Game extends Canvas implements Runnable {

    public static final int WIDTH = 920;
    public static final int HEIGHT = WIDTH / 12 * 9;

    private Thread gameThread;
    private boolean running = false;

    private KeyInput keyInput;

    private Handler handler;

    public Game() {
        handler = new Handler();
        handler.addObject(new Player(WIDTH/2,HEIGHT/2,1,0));

        keyInput = new KeyInput(this);

        new GameWindow(WIDTH, HEIGHT, "Dreamstreet", this);
    }

    public synchronized void start() {
        running = true;
        gameThread = new Thread(this);
        gameThread.start();
    }

    public synchronized void stop() {
        try {
            running = false;
            gameThread.join();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();

        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;

        int ticks = 0;
        int frames = 0;

        double delta = 0;
        long timer = System.currentTimeMillis();

        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;

            boolean doRender = false;
            while (delta >= 1) {
                ticks++;
                tick();
                delta--;
                doRender = true;
            }

            if (doRender) {
                frames++;
                render();
            }

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("Ticks: " + ticks + "   FPS: " + frames);

                ticks = 0;
                frames = 0;
            }
        }
        stop();
    }


    private void tick() {
        checkInput();
        handler.tick();

    }


    // this is not the way to do it
    private void checkInput() {
        if (keyInput.up.isPressed()) {
            handler.getObject(0).setdY(-5);
        }
        if (keyInput.down.isPressed()) {
            handler.getObject(0).setdY(5);
        }
        if (keyInput.left.isPressed()) {
            handler.getObject(0).setdX(-5);
        }
        if (keyInput.right.isPressed()) {
            handler.getObject(0).setdX(5);
        }
    }
    private void render() {
        BufferStrategy buff = this.getBufferStrategy();
        if (buff == null) {
            createBufferStrategy(3);
            return;
        }

        Graphics g = buff.getDrawGraphics();

        g.setColor(Color.WHITE);
        g.fillRect(0,0,WIDTH,HEIGHT);
        handler.render(g);

        g.dispose();
        buff.show();
    }

    public static void main(String[] args) {
        new Game();
    }
}
