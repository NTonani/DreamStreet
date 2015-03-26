package com.dreamstreet.haruham;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import com.dreamstreet.haruham.gfx.*;

public class Game extends Canvas implements Runnable, MouseInputListener, MouseWheelListener {

	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 640;  // 1920x1080
	//public static final int WIDTH = 480;
	public static final int HEIGHT = WIDTH / 16 * 9;
	public static final int SCALE = 3;
	public static final String NAME = "Dream Street";

	private boolean running = false;
	private JFrame frame;

	public int tickCount = 0;

	//spritesheets for map and character
	private SpriteSheet spritesheet = new SpriteSheet("/monsters/bear_sprite.png");
    private SpriteSheet skulltulasheet = new SpriteSheet("/monsters/skulltula.png");
    private SpriteSheet kodamasheet = new SpriteSheet("/monsters/kodama_sprite.png");
    private SpriteSheet skeletonsheet = new SpriteSheet("/monsters/skeleton_sprite.png");
    private SpriteSheet nofacesheet = new SpriteSheet("/monsters/noface_sprite.png");

    private SpriteSheet lightsheet = new SpriteSheet("/lighttest.png");
	private SpriteSheet mapsheet = new SpriteSheet("/tile_sheet2.png");

	//character image and sprite
	private BufferedImage lightobj = lightsheet.getSprite(0,0,66,36);

	private BufferedImage spritechar = spritesheet.getSprite(0,0,32,32);
    private BufferedImage skulltulachar = skulltulasheet.getSprite(0,0,32,32);
    private BufferedImage kodamachar = kodamasheet.getSprite(0,0,32,32);
    private BufferedImage skeletonchar = skeletonsheet.getSprite(0,0,32,32);
    private BufferedImage nofacechar = nofacesheet.getSprite(0,0,32,32);

	private Sprite character = new Sprite(spritechar,1.0, 500,500);
    private Sprite skulltula = new Sprite(skulltulachar,2.0, 2000,2000);
    private Sprite kodama = new Sprite(kodamachar,.5, 2200,2000);
    private Sprite kodama1 = new Sprite(kodamachar,.65, 2300,2000);
    private Sprite kodama2 = new Sprite(kodamachar,.95, 2150,2200);
    private Sprite kodama3 = new Sprite(kodamachar,.65, 2235,2100);


    private Sprite skeleton = new Sprite(skeletonchar,2.0, 2400,2000);
    private Sprite noface = new Sprite(nofacechar,18.0, 2600,2000);




    private Lighting lightradius = new Lighting(lightobj);  // use if width is 640
	//private Lighting lightradius = new Lighting(lightobj, character.getX()-980,character.getY()-530); // use this if running on 480 width

	//map
	private TileMap map = new TileMap("res/raymaptest.txt",mapsheet);
    private Camera camera;


//	private RayShadow[] rays = new RayShadow[20];
	int fps = 0;

    private boolean clicked = false;
    private boolean stopped = false;

    private UI ui = new UI();

	public Game() {
        camera = new Camera(3,.1);
        camera.centerCamera(character.getX(),character.getY(), 32*character.imgscale / 2, 32*character.imgscale/2);


        setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		setMaximumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));

		frame = new JFrame(NAME);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(this,BorderLayout.CENTER);
		frame.setUndecorated(true); //makes borderless window
		frame.pack();

		//frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);


	//	Random rand = new Random();
		//for (int i = 0; i < rays.length; i++) {
		//	rays[i] = new RayShadow(new Rectangle(rand.nextInt(2000), rand.nextInt(2000), rand.nextInt(200), rand.nextInt(200)), WIDTH*SCALE);
	//	}

		addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

            }

            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_Q) {
                    if (ui.currhealth + 200 > ui.maxhealth) {
                        ui.currhealth = ui.maxhealth;
                    }else{
                        ui.currhealth += 200;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    character.stop();
                    stopped = true;
                }

                if (e.getKeyCode() == KeyEvent.VK_A) {

                }
                if (e.getKeyCode() == KeyEvent.VK_D) {
                }

                if (e.getKeyCode() == KeyEvent.VK_SHIFT) {

                }


            }

            public void keyTyped(KeyEvent e) {

            }
        });

        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
	}
	
	public synchronized void start() {
		running = true;
		new Thread(this).start();
	}
	
	public synchronized void stop() {
		running = false;
	}


	@Override
	public void run() {
		//limit fps approx. 60
		long lastTime = System.nanoTime();
		double nsPerTick = 1000000000D/60D;
		
		int ticks = 0;
		int frames = 0;
		
		long lastTimer = System.currentTimeMillis();
		double delta = 0;
		
		while(running){
			long now = System.nanoTime();
			delta += (now-lastTime)/nsPerTick;
			lastTime = now;
			boolean shouldRender = true; // false here limits to 60 fps
			
			while(delta>=1){
				ticks++;
				tick();
				delta--;
				shouldRender = true;
			}

			try{
				Thread.sleep(2);
			}catch(InterruptedException e){
				e.printStackTrace();
			}

			if(shouldRender){
				frames++;
				render();
			}
			
			if(System.currentTimeMillis()-lastTimer >= 1000){
				lastTimer+=1000;
				System.out.println(frames+", "+ticks);
				fps = frames;
				frames = 0;
				ticks =0;
			}
		}
		
	}
	
	public void tick(){
    //    if (zoom != 0 && ((scale < 20 || zoom < 0) && (scale > .2 || zoom > 0))) {
          //  map.xOffset=shittyOffset((int)(960-32*scale*character.imgscale/2), character.getX(),scale);
        //    map.yOffset=shittyOffset((int)(540-32*scale*character.imgscale/2), character.getY(), scale);
    //    }
        if (clicked && !stopped) {
            Point mLoc = MouseInfo.getPointerInfo().getLocation();
            Point frameLoc = this.getLocationOnScreen();
            mLoc.x -= frameLoc.x;
            mLoc.y -= frameLoc.y;
            character.move(mLoc.getX() / camera.getScale() + camera.getXOffset(), mLoc.getY() / camera.getScale() + camera.getYOffset());
        }
        character.tick();
        camera.centerCamera(character.getX(), character.getY(), 32 * character.imgscale / 2, 32 * character.imgscale / 2);

        camera.tick();
        ui.tick();


		//for (int i = 0 ; i < rays.length; i++) {
		//	rays[i].obstacle.x -= dx;
	//		rays[i].obstacle.y -= dy;
		//	rays[i].tick(character.getX()+50,character.getY()+25);
	//	}


		/*
		 * 
		 * 
		 * UPDATES
		 * 
		 */
		
	}


	public void render(){
		BufferStrategy bs = getBufferStrategy();
		if(bs==null){
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0,0,WIDTH*SCALE,HEIGHT*SCALE);
		map.draw(g,camera);
		character.draw(g,camera);
	    skulltula.draw(g,camera);
		kodama.draw(g,camera);
        kodama1.draw(g,camera);
        kodama2.draw(g, camera);
        kodama3.draw(g, camera);
        skeleton.draw(g,camera);
        noface.draw(g,camera);
        ui.draw(g);

      //  lightradius.draw(g,30);

	//	for (int i = 0; i < rays.length; i++) {
	//		rays[i].draw(g);
	//	}
		drawDiagnostic(g);

		g.dispose();
		bs.show();
	}

	public void drawDiagnostic(Graphics g) {
		g.setFont(new Font("TimesRoman", Font.PLAIN, 25));
        g.setColor(Color.WHITE);

        g.drawString(fps + " ", 20, 40);
        g.drawString(character.getX() + ", " + character.getY(), 20, 70);
        g.drawString(camera.getXOffset() + ", " + camera.getYOffset(), 20, 100);
        g.drawString(((character.getX() - camera.getXOffset())*camera.getScale()) + ", " + ((character.getY() - camera.getYOffset())*camera.getScale()), 20, 130);
        g.drawString(camera.getScale() + " ", 20, 160);
      //  g.drawLine(0,HEIGHT/2*SCALE,WIDTH*SCALE, HEIGHT/2*SCALE);
      //  g.drawLine(WIDTH/2*SCALE,0,WIDTH/2*SCALE,HEIGHT*SCALE);
    }

	public static void main(String[] args){
		Game game = new Game();
		game.start();
		game.requestFocus();
	}


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
        //    character.move(e.getX() / camera.getScale() + camera.getXOffset(), e.getY() / camera.getScale() + camera.getYOffset());
            stopped = false;
            clicked = true;
        }else if (e.getButton() == MouseEvent.BUTTON3) {

        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            clicked = false;
        }else if (e.getButton() == MouseEvent.BUTTON3) {

        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        int notches = e.getWheelRotation();
        if (notches < 0) {
            camera.zoomIn();
        } else {
            camera.zoomOut();
        }
        camera.centerCamera(character.getX(), character.getY(), 32 * character.imgscale / 2, 32 * character.imgscale / 2);
    }
}
