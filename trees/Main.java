package trees;

import javax.swing.JFrame;

/**
 * Starts the tree program.
 * 
 * @author Curt Clifton.
 */
public class Main {

	private static final String TITLE = "See the Forest";

	/**
	 * Starts the tree program.
	 * 
	 * @param args
	 *            ignored
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle(TITLE);
		
		frame.add(new ForestDrawer());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
