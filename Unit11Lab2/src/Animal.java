
public class Animal implements Drawable, Resizable, Rotatable, Sounds {

	@Override
	public void playSound(String sound) {
		System.out.println("animal Sound");

	}

	@Override
	public void rotateObject(int degree) {
		System.out.println("Rotated an Animal");

	}

	@Override
	public void resizeObject(int x, int y) {
		System.out.println("Resized an Animal");

	}

	@Override
	public void drawObject() {
		System.out.println("Drew an Animal");

	}

}
