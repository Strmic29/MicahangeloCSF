import java.awt.Color;
import java.awt.Graphics;


public class Doodle {

	//color array list
	static Color[] rainbow = {Color.RED,Color.ORANGE,Color.YELLOW,
			Color.GREEN,Color.BLUE,Color.MAGENTA};
	
	public static void Doodle() {
		//creates gray background
		DrawingPanel panel = new DrawingPanel(300, 300);
		Graphics g = panel.getGraphics();
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, 300, 300);
		
		//draws squares that loop through color list
		for (int i = 0; i < 6; i++) {
		g.setColor(rainbow[i]);
		g.fillRect(0, 0, 300 - 50*i, 300 - 50*i);
		
		}
	}	
		public static void main(String[] args) {
		Doodle();	
		}		
}