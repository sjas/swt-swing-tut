package dw.tutorial.game5_actionpickupitem.logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Represents the game state, holds the level and player objects. 
 *
 */
public class Game {
	/**
	 * <pre>
	 *           1..1     1..1
	 * Game ------------------------> Level
	 *           game        &gt;       level
	 * </pre>
	 */
	private Level level;
	
	private void setLevel(Level value) {
	   this.level = value;
	}
	
	public Level getLevel() {
	   return this.level;
	}

	/**
	 * <pre>
	 *           1..1     1..1
	 * Game ------------------------> Player
	 *                   &gt;       player
	 * </pre>
	 */
	private Player player;

	public void setPlayer(Player value) {
		this.player = value;
	}

	public Player getPlayer() {
		return this.player;
	}

	public Game() {
		level = new Castle();
		player = new Player();
	}

	/**
	 * Starts and runs the game.
	 * 
	 */
	public void play() {

		Room currentRoom = level.getStartingRoom();
		System.out.println("Welcome to terrible text adventure v0.1!");

		while (!currentRoom.getIsGoal()) {

			currentRoom.print(player);

			System.out.print("\nWhat would you like to do? ");

			int choice = getUserInput();

			currentRoom = currentRoom.performAction(player, choice);
		}
		
		currentRoom.print(player);
	}

	/**
	 * Reads an integer entered by the user.
	 * 
	 * @return the integer entered by the user
	 */	
	private int getUserInput() {
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		try {
			choice = Integer.parseInt(is.readLine());
		} catch (NumberFormatException ex) {
			System.err.println("Not a valid number, exiting");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("Unexpected IO ERROR: " + e);
			System.exit(1);
		}
		return choice;
	}


}
