
public class Car implements Drawable, Resizable, Rotatable, Sounds {
	String Name;
	int year;
	public Car(String Name, int year){
		this.Name=Name;
		this.year=year;
	}
	@Override
	public void playSound(String sound) {
		System.out.println("Car Sound");

	}

	@Override
	public void rotateObject(int degree) {
		System.out.println("Rotated a Car");

	}

	@Override
	public void resizeObject(int x, int y) {
		System.out.println("Resized a Car");

	}

	@Override
	public void drawObject() {
		System.out.println("Drew a Car");

	}
	public String getName() {
		return Name;
	}
	public int getYear() {
		return year;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
