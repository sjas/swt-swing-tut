package dw.tutorial.game5_actionpickupitem.logic;

public class ActionUseItem extends Action {

	/**
	 * <pre>
	 *           1..1     1..1
	 * ActionUseItem ------------------------> Item
	 *           &gt;       item
	 * </pre>
	 */
	private Item item;

	public void setItem(Item value) {
		this.item = value;
	}

	public Item getItem() {
		return this.item;
	}

	public ActionUseItem(int actionId, String description, Room nextRoom,
			Item item) {
		super(actionId, description, nextRoom);
		this.item = item;
	}

	/**
	 * Determines if this {@code Action} is applicable given the items the
	 * {@code player} has.
	 * 
	 * @param player
	 * @return boolean
	 */
@Override
public boolean isApplicable(Player player) {
		return player.hasItem(item);
	}

	/**
	 * Performs this {@code Action}. Assumes {@code player} has {@code item} in
	 * their inventory.
	 * 
	 * @param player
	 * @return the room resulting from this action
	 */
@Override
public Room perform(Player player) {
		player.removeItem(item);
		return super.perform(player);
	}

}
