/*
 * 
 */
package dw.tutorial.game5_actionpickupitem.view;

import javax.swing.JFrame;

import dw.tutorial.game5_actionpickupitem.model.Game;

/**
 * @author sjas
 *
 */
public class MainFrame extends JFrame {
	
	/**
	 * Creates the GUI's Window and all the widgets that are used in it.
	 * 
	 * @param game
	 */
	public MainFrame(Game game) {
		// TODO remember to link game object properly
		this.setTitle("DWhite's evil textbased adventure");
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		this.add(new )
		
		this.setVisible(true);
	}
}
