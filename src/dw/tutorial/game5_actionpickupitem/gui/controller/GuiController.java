package dw.tutorial.game5_actionpickupitem.gui.controller;

import dw.tutorial.game5_actionpickupitem.gui.model.GuiModel;
import dw.tutorial.game5_actionpickupitem.gui.view.GuiView;

public class GuiController {
	
	private final GuiModel model;
	private final GuiView view;
	
	public GuiController() {
		
		//initialize
		this.model = new GuiModel();
		this.view = new GuiView(this.model, this);
		
		//make gui finally visible
		this.view.setVisible(true);
		
		//start game
		// TODO
//		this.model.getGame().play();
	}

}
