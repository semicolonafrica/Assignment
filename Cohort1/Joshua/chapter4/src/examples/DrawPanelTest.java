/**
 * 
 */
package examples;

/**fig . 4.19: DrawPanelTest.java
 * @author user
 *
 */
import javax.swing.JFrame;
public class DrawPanelTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create a panel that contains our drawing
		DrawPanel panel = new DrawPanel();
		
		//create a new frame to hold the panel
		JFrame application = new JFrame();
		
		//set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);//add the panel to the frame
		application.setSize(250, 250); // set the size of the frame
		application.setVisible(true);// make the frame visible
	}//end main method

}// end class
