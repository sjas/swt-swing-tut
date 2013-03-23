package dw.tutorial.game5_actionpickupitem;

import dw.tutorial.game5_actionpickupitem.gui.view.MainFrame;
import dw.tutorial.game5_actionpickupitem.logic.Game;

public class EntryPoint {

	/**
	 * Sets up the game and starts play.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Game game = new Game();
		new MainFrame(game);
		game.play();
	}

}
