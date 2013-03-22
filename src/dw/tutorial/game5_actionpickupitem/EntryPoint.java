package dw.tutorial.game5_actionpickupitem;

import dw.tutorial.game5_actionpickupitem.model.Game;
import dw.tutorial.game5_actionpickupitem.view.MainFrame;

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
