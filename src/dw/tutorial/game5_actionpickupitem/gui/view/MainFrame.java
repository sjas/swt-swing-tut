/*
 * 
 */
package dw.tutorial.game5_actionpickupitem.gui.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dw.tutorial.game5_actionpickupitem.logic.Game;

/**
 * @author sjas
 *
 */
public class MainFrame extends JFrame {
	
	private Game game;
	
	/**
	 * Creates the GUI's Window and all the widgets that are used in it.
	 * 
	 * @param game
	 */
	public MainFrame(Game game) {
		
		this.game = game;
		JLabel textArea = new JLabel();
		
		this.setTitle("DWhite's evil textbased adventure");
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(new JTextField(1));
		this.add(textArea);
		
		this.setVisible(true);
	}
}
