package dw.tutorial.game5_actionpickupitem.logic;

import java.util.Set;
import java.util.HashSet;

public class Player {
	
	/**
	 * <pre>
	 *           1..1     0..*
	 * Player ------------------------> Item
	 *           &gt;       inventory
	 * </pre>
	 */
	private Set<Item> inventory;
	
	public Set<Item> getInventory() {
	   if (this.inventory == null) {
	this.inventory = new HashSet<Item>();
	   }
	   return this.inventory;
	}
	
	public Player() {
		inventory = new HashSet<Item>();
	}
	
	/**
	 * Determines if this player has {@code item} in their inventory.
	 * 
	 * @param item
	 * @return {@code true} if {@code item} is in this player's inventory
	 */
	public boolean hasItem(Item item) {
		return inventory.contains(item);
	}
	
	/**
	 * Adds an item to this player's inventory.
	 * 
	 * @param item
	 */
	public void addItem(Item item) {
		inventory.add(item);
	}
	
	/**
	 * Removes an item from this player's inventory.
	 * 
	 * @param item
	 */
	public void removeItem(Item item) {
		inventory.remove(item);
	}
	
	/**
	 * Gets a String of all items in the player's inventory.
	 * 
	 * @return a {@code string} of inventory items
	 */
	public String getInventoryAsString() {
		String ret = "";
		for (Item i : inventory) {
			ret += i.getName();
			ret += " ";
		}
		return ret;
	}

}
