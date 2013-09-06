package trees;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

/**
 * This component draws many trees.
 * 
 * @author Curt Clifton and Dan Schepers 
 */
public class ForestDrawer extends JComponent {
	private final static Color BACKGROUND = new Color(1.0f, 1.0f, 0.8125f);
	private static final Dimension SIZE = new Dimension(1024, 250);

	private ArrayList<TreeDrawer> treeDrawers = new ArrayList<TreeDrawer>();

	/**
	 * Constructs a ForestDrawer that stores several TreeDrawers and will draw
	 * them when the GUI library requests an update.
	 */
	public ForestDrawer() {
		this.setPreferredSize(SIZE);
		/*
		 * TODO 1: Finish implementing this constructor to instantiate several
		 * TreeDrawers with different parameters.
		 */
		this.treeDrawers.add(new TreeDrawer(SIZE.width / 6, SIZE.height,
				SIZE.height / 2,5,35,true));
		this.treeDrawers.add(new TreeDrawer(2*SIZE.width / 6, SIZE.height,
				SIZE.height / 4,10,45,false));
		this.treeDrawers.add(new TreeDrawer(3*SIZE.width / 6, SIZE.height,
				SIZE.height / 2,5,35,false));
		this.treeDrawers.add(new TreeDrawer(4*SIZE.width / 6, SIZE.height,
				SIZE.height / 3,10,35,true));
		this.treeDrawers.add(new TreeDrawer(5*SIZE.width / 6, SIZE.height,
				SIZE.height / 5,4,50,false));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		/*
		 * Graphics2D has better drawing methods. In Java 6 the Graphics object
		 * passed to this method is always an instance of Graphics2D.
		 */
		Graphics2D g2 = (Graphics2D) g;

		// Fills component with the background color
		g2.setColor(BACKGROUND);
		g2.fillRect(0, 0, this.getWidth(), this.getHeight());

		/*
		 * TODO 2: Not really any code to write here. Just notice how this tells
		 * each of your TreeDrawers to draw themselves on g2.
		 */
		for (TreeDrawer td : this.treeDrawers) {
			td.drawTreeOn(g2);
		}
	}

}
