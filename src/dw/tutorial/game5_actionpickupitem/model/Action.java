package dw.tutorial.game5_actionpickupitem.model;


/** Represents an Action that may be performed in a Room */
public class Action {

	private int actionId;
	private String description;
	private Room nextRoom;

	/**
	 * @param actionId
	 * @param description
	 * @param nextRoom
	 */
	public Action(int actionId, String description, Room nextRoom) {
		super();
		this.actionId = actionId;
		this.description = description;
		this.nextRoom = nextRoom;
	}

	/**
	 * Prints this {@code Action}.
	 */
	public void print() {
		System.out.println(actionId + ") " + description);
	}

	/**
	 * Determines if this {@code Action} is applicable given the items the
	 * {@code player} has.
	 * 
	 * @param player
	 * @return boolean
	 */
	public boolean isApplicable(Player player) {
		return true;
	}

	/**
	 * Performs this {@code Action}.
	 * <p>
	 * Note that {@code player} argument is required for overridden versions of
	 * this method that alter the {@code player} state.
	 * 
	 * @param player
	 * @return the room resulting from this action
	 */
	public Room perform(Player player) {
		return nextRoom;
	}

}
