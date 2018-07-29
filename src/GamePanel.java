import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener, MouseListener {

	Timer time;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Hand handy = new Hand(250,250,50,50);
	Pen penny = new Pen(300,300,50,50);
	ObjectManager manny = new ObjectManager(handy, penny);
	
	public static BufferedImage handImg;
	public static BufferedImage pencilImg;
	public GamePanel() {
		time = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		try {

			handImg = ImageIO.read(this.getClass().getResourceAsStream("pixil-frame-0.png"));
			pencilImg = ImageIO.read(this.getClass().getResourceAsStream("jesusmcchrist.png"));
					

    } catch (IOException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

    }
		   

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if (currentState == MENU_STATE) {

			updateMenuState();

		} else if (currentState == GAME_STATE) {
			

			updateGameState();

		} else if (currentState == END_STATE) {

			updateEndState();

		}
		repaint();
	}

	public void startGame() {
		time.start();
	}

	@Override

	public void paintComponent(Graphics g) {
		g.fillRect(10, 10, 100, 100);
		if (currentState == MENU_STATE) {

			drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			drawGameState(g);

		} else if (currentState == END_STATE) {

			drawEndState(g);

		}

	}

	public void updateMenuState() {

	}

	public void updateGameState() {
	
		manny.update();
		manny.manageEnemies();
		handy.setPos(getMousePosition());
	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLACK);
		g.setFont(titleFont);
		g.drawString("DISTRACTIONS", 200, 400);
		g.setColor(Color.BLUE);

		g.fillRect(0, 0, Distraction.WIDTH, Distraction.HEIGHT);
		g.setColor(Color.BLACK);
		g.setFont(titleFont);
		g.drawString("DISTRACTIONS", 200, 400);
	}

	public void drawGameState(Graphics g) {
		
		g.setColor(Color.BLACK);
		
		g.fillRect(0, 0, Distraction.WIDTH, Distraction.HEIGHT);

		manny.draw(g);
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);

		g.fillRect(0, 0, Distraction.WIDTH, Distraction.HEIGHT);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
			if (currentState > END_STATE) {

				currentState = MENU_STATE;

			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(handy.x + "h" + handy.y);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
