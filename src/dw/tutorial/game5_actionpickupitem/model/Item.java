package dw.tutorial.game5_actionpickupitem.model;


public class Item {
		
	private String name;
	
	public void setName(String value) {
	   this.name = value;
	}
	
	public String getName() {
	   return this.name;
	}
	
	public Item(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
@Override
public boolean equals(Object obj) {
		Item other = (Item) obj;
		return name.equals(other.name);
	}
	
	@Override
	public String toString() {
		return "Item [name=" + name + "]";
	}

}
