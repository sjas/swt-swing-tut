package dw.tutorial.game5_actionpickupitem.gui.model;

import dw.tutorial.game5_actionpickupitem.gui.view.GuiView;
import dw.tutorial.game5_actionpickupitem.logic.Game;

public class GuiModel {
	
	private final Game game;
	
	public GuiModel() {
		this.game = new Game();
	}

	public void addObserver(GuiView guiView) {
		// TODO Auto-generated method stub
		
	}
	
	public Game getGame() {
		return this.game;
	}


}
