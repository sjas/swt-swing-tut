package dw.tutorial.game5_actionpickupitem.model;

import java.util.ArrayList;

import java.util.List;

/**
 * Represents a room in a level. A room has a set of actions associated with it
 * that the player can perform.
 */
public class Room {

	private String roomName;
	private String roomText;
	/**
	 * <pre>
	 *           1..1     1..*
	 * Room ------------------------> Action
	 *           &gt;       actions
	 * </pre>
	 */
	private List<Action> actions;

	private boolean isGoal;

	public Room(String roomName, String roomText, boolean isGoal) {
		super();
		this.roomName = roomName;
		this.roomText = roomText;
		this.isGoal = isGoal;
		actions = new ArrayList<Action>();
	}

	/**
	 * Adds an action to this room.
	 * 
	 * @param action
	 */
	public void addAction(Action action) {
		actions.add(action);
	}

	/**
	 * Prints this rooms details (name, flavor text and actions). Also uses
	 * {@code player} to print the player's inventory.
	 * 
	 * @param player
	 */
	public void print(Player player) {
		System.out.println("\n==================" + roomName
				+ "===================\n");
		System.out.println("Items: " + player.getInventoryAsString());
		System.out.println(roomText + "\n");
		for (Action action : actions) {
			if (action.isApplicable(player)) {
				action.print();
			}
		}
	}

	/**
	 * Performs the action specified by {@code choice} or, if the choice was
	 * invalid, prompts the user for a new choice.
	 * 
	 * @param player
	 * @param choice
	 * @return
	 */
	public Room performAction(Player player, int choice) {
		if (choice < actions.size() && actions.get(choice).isApplicable(player)) {
			return actions.get(choice).perform(player);
		} else {
			System.out.println("Invalid choice");
			return this;
		}
	}

	/**
	 * Determines if this room is a level goal.
	 * 
	 * @return {@code true} if this room is a goal
	 */
	public boolean getIsGoal() {
		return isGoal;
	}

}
