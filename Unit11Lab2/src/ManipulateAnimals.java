
public class ManipulateAnimals {
	public static void main(String [] args){
		Animal animal = new Animal();
		Car car = new Car("Prius", 1980); 
		car.playSound("vroom");
		animal.playSound("meow");
		car.drawObject();
		animal.drawObject();
		car.rotateObject(10);
		animal.rotateObject(10);
		car.resizeObject(10,20);
		animal.resizeObject(10,20);
		
	}
}
