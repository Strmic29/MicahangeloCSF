import java.awt.Color;
import java.awt.Graphics;

/*
 * Main launcher class to test out color schemes for Lab 7
 * @author Paul Pham
 */
public class ColorSchemeLauncher {
	
	DrawingPanel panel;
	Graphics g;
	
	/*
	 * Default constructor which sets the dimensions of the DrawingPanel.
	 * @param width The width of the DrawingPanel in pixels.
	 * @param height The height of the DrawingPanel in pixels.
	 */
	public ColorSchemeLauncher(int width, int height) {
		this.panel = new DrawingPanel(width, height);
		this.g = panel.getGraphics();
	}
	
	public void checkImage() {
		this.panel.compareToFilePublic();
	}
	
	/*
	 * Draws all the colors in the ColorScheme param as a rectangular
	 * swatch, that is, adjacent squares
	 * of 100x100 pixels, beginning at x=0 and offset by the given y param.
	 * For example, if there are four colors and y=0, there
	 * should be a square of the first color at x=0,y=0
	 * a square of the second color at x=100,y=0,
	 * a square of the third color at x=200,y=0,
	 * and a square of the fourth color at x=300,y=0.
	 * @param scheme The ColorScheme object to draw on the panel.
	 * @param y the offset in the y direction for the ColorScheme swatch.
	 */
	public void drawScheme(ColorScheme scheme, int y) {
	
	
			Color[] colors = scheme.getColorList();
			int offset = 0;
			for (Color c : colors) {
				// TODO: Fill in code here
				g.setColor(c);
				g.fillRect(100 * offset, y, 100, 100);
				offset += 1;
		}
		
	}

	public static void main(String[] args) {
		
		// Create the first color scheme, based on this http://colorschemedesigner.com
		Color color1 = Color.decode("#009E8E");
		Color color2 = Color.decode("#1047AA");
		Color color3 = Color.decode("#FFA500");
		Color color4 = Color.decode("#FF6C00");
		ColorScheme scheme1 = new ColorScheme(color1, color2, color3, color4);

		// Create the second color scheme based on this http://colorschemedesigner.com/#3f41Tw0w0w0w0
		color1 = Color.decode("#FFC200");
		color2 = Color.decode("#FFEB00");
		color3 = Color.decode("#560EAD");
		color4 = Color.decode("#1F1AB2");
		ColorScheme scheme2 = new ColorScheme(color1, color2, color3, color4);

		ColorSchemeLauncher csl = new ColorSchemeLauncher(400, 300);
		csl.drawScheme(scheme1, 0);
		csl.drawScheme(scheme2, 100);
		
		ColorScheme scheme3 = scheme2.combineWith(scheme1);
		csl.drawScheme(scheme3, 200);
		
		csl.checkImage();
	}
	
}
