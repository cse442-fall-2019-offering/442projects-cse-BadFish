package flappyBird;

import javax.swing.SwingUtilities;

public class EntryPoint {
	
	public static void main(String[] args) {
		FlappyGame game = new FlappyGame();
		GUIHandler gui = new GUIHandler(game);
		
		SwingUtilities.invokeLater(gui);
	}
}
