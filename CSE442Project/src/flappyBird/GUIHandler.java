package flappyBird;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class GUIHandler implements Runnable{
	private FlappyGame 			game;
	private JFrame 				frame;
	private GridBagLayout 		frameLayout;
	private GridBagConstraints	frameLayoutConstraints;
	private final int WIDTH  = 1000;
	private final int HEIGHT  = 600;
	
	
	public GUIHandler(FlappyGame game) {
		this.game = game;
		frame = new JFrame();
	}
	private void create() {
		frameSetup();
	}
	
	private void frameSetup() {
		
		frameLayout = new GridBagLayout();
		frameLayoutConstraints = new GridBagConstraints();
			
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setLayout(frameLayout);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		create();
		
	}

}
