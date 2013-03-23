package dw.tutorial.game5_actionpickupitem.logic;

/**
 * Represents an Action that results in the player obtaining an item.
 */
public class ActionPickupItem extends Action {
	/**
	 * <pre>
	 *           1..1     1..1
	 * ActionPickupItem ------------------------> Item
	 *           actionPickupItem        &gt;       item
	 * </pre>
	 */
	private Item item;

	private void setItem(Item value) {
		this.item = value;
	}

	/**
	 * Gets the item to be picked up
	 * 
	 * @return item
	 */
	public Item getItem() {
		return this.item;
	}

	public ActionPickupItem(int actionId, String description, Room nextRoom,
			Item item) {
		super(actionId, description, nextRoom);
		this.item = item;
	}
@Override
public boolean isApplicable(Player player) {
		return !player.hasItem(item);
	}

	/**
	 * Performs this action and adds the corresponding item to the players
	 * inventory.
	 * 
	 * @param player
	 * @return the room resulting from performing this Action
	 * @see dw.tutorial.game5_actionpickupitem.model.swt.game1.Action#perform(dw.tutorial.game5_actionpickupitem.model.swt.game1.Player)
	 */
@Override
public Room perform(Player player) {
		player.addItem(item);
		return super.perform(player);
	}

}
