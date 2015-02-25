package designpatterns.game;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JFrame;

import designpatterns.gfx.Lighting;
import designpatterns.gfx.Sprite;
import designpatterns.gfx.SpriteSheet;
import designpatterns.gfx.TileMap;

public class Game extends Canvas implements Runnable{

	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 640;
	//public static final int WIDTH = 480;
	public static final int HEIGHT = WIDTH / 16 * 9;
	public static final int SCALE = 3;
	public static final String NAME = "Dream Street";

	private boolean running = false;
	private JFrame frame;

	public int tickCount = 0;
	private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	
	//spritesheets for map and character
	private SpriteSheet spritesheet = new SpriteSheet("/bear_sheet.png");
	private SpriteSheet lightsheet = new SpriteSheet("/lighttest.png");
	private SpriteSheet mapsheet = new SpriteSheet("/tile_sheet2.png");

	//character image and sprite
	private BufferedImage lightobj = lightsheet.getSprite(0,0,66,36);

	private BufferedImage spritechar = spritesheet.getSprite(0,0,32,32);

	private Sprite character = new Sprite(spritechar, WIDTH*SCALE/2-30, HEIGHT*SCALE/2 - 80);
	private Lighting lightradius = new Lighting(lightobj);
	//private Lighting lightradius = new Lighting(lightobj, character.getX()-980,character.getY()-550);

	//map
	private TileMap map = new TileMap("res/temp_map.txt",mapsheet);

	int fps = 0;

	public Game() {
		setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		setMaximumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));

		frame = new JFrame(NAME);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(this,BorderLayout.CENTER);
	//	frame.setUndecorated(true); //makes borderless window
		frame.pack();

		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_W) {
					map.dy = -5;
				}
				if (e.getKeyCode() == KeyEvent.VK_S) {
					map.dy = 5;
				}
				if (e.getKeyCode() == KeyEvent.VK_A) {
					map.dx = -5;
				}
				if (e.getKeyCode() == KeyEvent.VK_D) {
					map.dx = 5;
				}
			}

			public void keyReleased(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_W) {
					if (map.dy == -5) {
						map.dy = 0;
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_S) {
					if (map.dy == 5) {
						map.dy = 0;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_A) {
					if (map.dx == -5) {
						map.dx = 0;
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_D) {
					if (map.dx == 5) {
						map.dx = 0;
					}
				}
			}

			public void keyTyped(KeyEvent e) {

			}
		});
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
			boolean shouldRender = true;
			
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

	public void drawDiagnostic(Graphics g) {
		g.setColor(Color.WHITE);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 25));

		g.drawString(fps + " ", 20, 40);
	}
	
	public void tick(){
		map.xOffSet += map.dx;
		map.yOffSet += map.dy;
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

		map.draw(g,SCALE);
		character.draw(g,SCALE);
		lightradius.draw(g,30);
		drawDiagnostic(g);

		g.dispose();
		bs.show();
	}
	
	public static void main(String[] args){
		Game game = new Game();
		game.start();
		game.requestFocus();
	}





}
