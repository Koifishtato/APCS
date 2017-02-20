import java.util.ArrayList;
import java.util.Random;

public class GroceryCreating {

	public static void main(String[] args) {
		ArrayList<GroceryItem> longGroceries = new ArrayList<GroceryItem>();
		ArrayList<GroceryItem> shortGroceries = new ArrayList<GroceryItem>();
		Random random = new Random(123);
		int life;
		for(int x=0; x!=30; x++){
			life=random.nextInt(30)+1;
			if(life>7)
				longGroceries.add(new GroceryItem(x, life));
			else if(life<=7)
				shortGroceries.add(new GroceryItem(x, life));
		}
		GroceryItem temp;
		System.out.println("Short Life Groceries:");
		for(int x=0; x!=shortGroceries.size(); x++){
			temp=shortGroceries.get(x);
			System.out.printf("Short Grocery %d: Shelf Life of %d days, ID: %d %n",(x+1),temp.getExperation(),temp.getItemNumber());
		}
		System.out.println("Long Life Groceries:");
		for(int x=0; x!=longGroceries.size(); x++){
			temp=longGroceries.get(x);
			System.out.printf("Long Grocery %d: Shelf Life of %d days, ID: %d %n",(x+1),temp.getExperation(),temp.getItemNumber());
		}
	}

}
