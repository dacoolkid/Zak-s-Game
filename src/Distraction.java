import java.awt.Dimension;

import javax.swing.JFrame;

public class Distraction {
	JFrame frame;
	public final static int HEIGHT = 500;
	public final static int WIDTH = 800;
	GamePanel game;

	public static void main(String[] args) {
		Distraction distract = new Distraction();
		distract.setup();
	}

	public Distraction() {
		frame = new JFrame();
		game = new GamePanel();
	}

	public void setup() {
		frame.add(game);
		frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.addKeyListener(game);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		game.startGame();

	}
}
