/**
 * Tests the Person classes and subclasses.
 * @author Alexander Loeffler
 *
 */
public class PeopleTesting {

	public static void main(String[] args) {
		Person person = new Person("Bob");
		Faculty faculty = new Faculty("Bobette", null, null, null, null, 0, null, null, null);
		System.out.print(faculty.toString());
	}

}
