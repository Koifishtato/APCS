
public class GroceryItem {
	private int itemNumber;
	private int experation;
	
	public GroceryItem(int itemNumber, int timeToExperation) {
		this.itemNumber=itemNumber;
		this.experation=timeToExperation;
	} 
	
	public int getExperation() {
		return experation;
	}
	public void setExperation(int experation) {
		this.experation = experation;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	
}
