/*
 * 
 */
package dw.tutorial.game5_actionpickupitem.gui.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dw.tutorial.game5_actionpickupitem.gui.controller.GuiController;
import dw.tutorial.game5_actionpickupitem.gui.model.GuiModel;
import dw.tutorial.game5_actionpickupitem.logic.Game;

/**
 * @author sjas
 * 
 */
public class GuiView extends JFrame implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GuiController controller;
	private GuiModel model;

	private JPanel contentPane;
	private JLabel textArea;
	private JTextField numberField;
	private JButton okButton;
	private JPanel upperContainer;
	private JPanel lowerContainer;

	// topLevelContainer = new JPanel(new BorderLayout());
	//
	// topLevelContainer.add(upperContainer, BorderLayout.NORTH);
	// topLevelContainer.add(lowerContainer, BorderLayout.SOUTH);
	//
	//
	// JLabel textArea = new JLabel();
	//
	// this.setTitle("DWhite's evil textbased adventure");
	// this.setSize(400, 600);
	// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//

	public GuiView(GuiModel model, GuiController controller) {
		// TODO Auto-generated constructor stub
		this.model = model;
		this.controller = controller;
		this.model.addObserver(this);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setTitle("DWhite's Textadventure ;)");
		this.setSize(new Dimension(400, 600));
		this.setLocationRelativeTo(null);
		initLayout();
	}

	private void initLayout() {
		// TODO Auto-generated method stub
		this.setLayout(new BorderLayout());
		this.contentPane = new JPanel();
		this.setContentPane(contentPane);
		
		this.contentPane.add(upperContainer);
		this.contentPane.add(lowerContainer);
		
		this.textArea = new JLabel("this is just some sampe text");
		this.numberField = new JTextField(1);
		this.okButton = new JButton("ok");
		
		contentPane.setLayout(new BorderLayout());
		contentPane.add(textArea, BorderLayout.NORTH);
		contentPane.add(numberField, BorderLayout.CENTER);
		contentPane.add(okButton, BorderLayout.EAST);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

}
