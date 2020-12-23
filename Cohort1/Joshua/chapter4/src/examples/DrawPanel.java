/**
 * 
 */
package examples;

/**fig. 4.18: DrawPanel.java
 * Using drawLine to connect the corners of a panel
 * @author user
 *
 */
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawPanel extends JPanel {

	// Draw an x from the corner of a panel
	public void paintComponent(Graphics g) {
		
		// call paintComponent to ensure the panel displays correctly
		super.paintComponent(g);
		
		int width = getWidth();// total width
		int height = getHeight();// total height
		
		//Draw a line from the upper-left to the lower-right
		g.drawLine(0, 0, width, height);
		
		//Draw a line from the lower-right to the upper-left
		g.drawLine(0,height,width, 0);
	}
}//end class DrawPanel
