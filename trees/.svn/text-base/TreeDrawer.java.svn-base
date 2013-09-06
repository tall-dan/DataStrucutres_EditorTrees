package trees;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * Objects of this class draw trees recursively.
 * 
 * @author Curt Clifton and Dan Schepers
 */
public class TreeDrawer {
	private final double xLoc;
	private final double yLoc;
	private final double initialSize;
	private final double branchSpacing;
	private final double minBranchLength;
	private final boolean hasLeaves;

	/*
	 * TODO 5: Add any additional fields that you need to complete to-do item 4,
	 * then update your drawTreeHelper method to use these fields appropriately.
	 */

	/**
	 * Constructs an object for drawing a tree rooted at the given location and
	 * with the given initial size.
	 * 
	 * @param xLoc
	 * @param yLoc
	 * @param initialSize
	 * @param minBranchLength
	 * @param branchSpacing
	 * @param overlap
	 * @param hasLeaves
	 */
	public TreeDrawer(double xLoc, double yLoc, double initialSize,
			double minBranchLength, double branchSpacing, boolean hasLeaves) {
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.initialSize = initialSize;
		this.minBranchLength = minBranchLength;
		this.branchSpacing = branchSpacing;
		this.hasLeaves = hasLeaves;
		/*
		 * TODO 4: You need to add a couple of additional features that allow
		 * you to make one tree appear differently than another, apart from
		 * their size and location. Add to this constructor any additional
		 * parameters that you need for your additional features. Possible
		 * features that you might add include different numbers of branches,
		 * different angles between branches, and different branch attachment
		 * points. You are free to think of other ideas as well. You must
		 * implement AT LEAST TWO such features, but can do as many as you like.
		 */
	}

	/**
	 * Draws a tree on the given graphics object.
	 * 
	 * @param g2
	 */
	public void drawTreeOn(Graphics2D g2) {
		drawTreeHelper(g2, this.xLoc, this.yLoc, this.initialSize, -90.0);
	}

	/**
	 * This recursive helper method actually handles the drawing task.
	 * 
	 * @param g2
	 *            the graphics object to draw on
	 * @param x
	 *            the x location of the base of the "trunk" for the next
	 *            recursive call
	 * @param y
	 *            the y location of the base of the "trunk" for the next
	 *            recursive call
	 * @param size
	 *            the relative size for this recursive invocation
	 * @param angle
	 *            the angle of the trunk in degrees (0 is to the right, -90 is
	 *            up)
	 */
	private void drawTreeHelper(Graphics2D g2, double x, double y, double size,
			double angle) {
		/*
		 * TODO 3: Finish implementing this method recursively according to the
		 * problem description in the written assignment. (You did read it,
		 * right?) A basic trunk is drawn for you to demonstrate shape drawing
		 * in Java. You'll have to change that code to consider the angle. The
		 * Math.cos() and Math.sin() functions will be useful. What units do
		 * they expect for their parameters?
		 */
		if (size <= this.minBranchLength) {
			if (this.hasLeaves) {
				Ellipse2D.Double leaf = new Ellipse2D.Double(x, y - 5, 5, 5);
				g2.setColor(Color.GREEN);
				g2.fill(leaf);
			}
			return;
		}
		double radAngle = angle * Math.PI / 180;// convert to radians
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke((float) (size * 5.0 / 50)));
		double xEnd = Math.cos(radAngle) * size + x;
		double yEnd = Math.sin(radAngle) * size + y;
		Line2D trunk = new Line2D.Double(x, y, xEnd, yEnd);
		g2.draw(trunk);
		drawTreeHelper(g2, xEnd, yEnd, size / 2, angle);
		drawTreeHelper(g2, xEnd, yEnd, size / 2, angle + this.branchSpacing);
		drawTreeHelper(g2, xEnd, yEnd, size / 2, angle - this.branchSpacing);

	}
}
