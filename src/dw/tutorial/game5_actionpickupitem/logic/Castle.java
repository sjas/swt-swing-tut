package dw.tutorial.game5_actionpickupitem.logic;

/** Represents the castle level.
 * <p>
 * Generates all rooms and actions necessary for the castle level.
 */
public class Castle extends Level {
	
	public Castle() {
		super();
		
		Room courtyard = 
			new Room(
				"Courtyard",
				"There is a large castle in front of you with two doors",
				false);
		
		Room kitchen = 
			new Room(
				"Kitchen",
				"You are in the kitchen, there are stairs leading up and a small door to a celler", 
				false);
		
		Room hall = 
			new Room(
				"Hall",
				"You are in a grand hall! There are stairs leading down and an open window with an ogre in front of it!", 
				false);
		
		Room street = 
			new Room(
				"Outside Street",
				"You have escaped to the street, contratulations!", 
				true);
		
		courtyard.addAction(new Action(0,"Use the basement door.", kitchen)); 
		courtyard.addAction(new Action(1,"Use the main door.", hall));
		
		kitchen.addAction(new Action(0,"Follow the stairs up", hall));
		kitchen.addAction(new ActionUseItem(1, "Unlock the celler door using **key** and leave the kitchen", street, new Item("Key"))); 
		kitchen.addAction(new Action(2,"Return to the courtyard", courtyard)); 
		kitchen.addAction(new ActionPickupItem(3,"Pickup a tasty **pie**", kitchen, new Item("Pie")));

		hall.addAction(new Action(0,"Follow the stairs down", kitchen)); 
		hall.addAction(new ActionUseItem(1, "Distract the ogre with the **pie** and jump out the window!", street, new Item("Pie")));		
		hall.addAction(new Action(2,"Return to the courtyard", courtyard));		
		hall.addAction(new ActionPickupItem(3,"Pickup the **key** on the table", hall, new Item("Key")));
		
		
		super.addRoom(courtyard);
		super.addRoom(kitchen);
		super.addRoom(hall);
		super.addRoom(street);

		super.setStartingRoom(courtyard);
			
	}
	
}



	