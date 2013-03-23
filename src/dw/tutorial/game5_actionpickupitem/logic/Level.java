package dw.tutorial.game5_actionpickupitem.logic;

import java.util.Set;
import java.util.HashSet;

/** 
 * Represents a level in the game. Is inherited from to construct new levels.
 */
public class Level {
	
	private Room startingRoom;
	
	protected void setStartingRoom(Room value) {
	   this.startingRoom = value;
	}
	
	public Room getStartingRoom() {
	   return this.startingRoom;	   
	}
	
	/**
	 * <pre>
	 *           1..1     0..*
	 * Level ------------------------> Room
	 *                   &gt;       rooms
	 * </pre>
	 */
	private Set<Room> rooms;
	
	public Set<Room> getRooms() {
	   if (this.rooms == null) {
	this.rooms = new HashSet<Room>();
	   }
	   return this.rooms;
	}
	
	protected void addRoom(Room room) {
		rooms.add(room);
	}
	
	public Level() {
		rooms = new HashSet<Room>();
	}

}
