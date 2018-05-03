import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;

	public GameObject(int xd, int yd, int widthd, int heightd) {
		x = xd;
		y = yd;
		width = widthd;
		height = heightd;

	}

	public void update() {
		this.x++;
		this.y++;
	}

	public void draw(Graphics g) {
		g.fillRect(x, y, 100, 100);
	}
}
