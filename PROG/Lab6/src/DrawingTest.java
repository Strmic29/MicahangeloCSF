import java.awt.*;

// Drawing test.
public class DrawingTest {
	
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(800, 600);
		Graphics g = panel.getGraphics();
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, 800, 600);
		//g.setColor(Color.WHITE);
		//g.drawLine(10, 10, 100, 100);
		g.setColor(Color.MAGENTA);
		g.fillRect(200, 200, 50, 50);
		g.fillRect(300, 200, 50, 50);
		g.fillRect(200, 300, 50, 50);
		g.fillRect(250, 250, 50, 50);
		g.fillRect(300, 300, 50, 50);
		
		// TODO: Add your code here. Hint: use g.fillRect
		
		panel.compareToFilePublic();
	}
}
