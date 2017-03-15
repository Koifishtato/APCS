import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactRead {
	private static ContactFile file;
	private static Scanner input;
	public static void main(String[] args) {
		while(true){
		try {
			input=new Scanner(System.in);
			System.out.printf("What File would you like to open?");
			file = new ContactFile(input.next());
			while (true){
				Menu();
				}

		} catch (FileNotFoundException e) {
			System.out.println("Invalid File!");
		}
		}
	}
	
	public static void Menu(){
		String temp;
		String [] tempa;
		System.out.printf("(1) List Contact(First Last)%n(2) Delete Contact(First Last)%n(3) Add Contact%n(4) Display Entire List%n(5) Save And Exit%n");
		try{
		switch(input.nextInt()){
		case 1:
			System.out.printf("First Last: ");
			temp=input.next();
			temp=temp.concat(" ").concat(input.next());
			tempa=file.read(temp).get();
			System.out.printf("First: %s%nLast: %s%nPhone: %s%nEmail: %s",tempa[0],tempa[1],tempa[2],tempa[3]);
			break;
		case 2:
			System.out.printf("First Last: ");
			temp=input.next();
			temp=temp.concat(" ").concat(input.next());
			file.delete(temp);
			break;
		case 4:
			printAll();
			break;
		case 3:
			String [] add=new String[4];
			System.out.printf("First Name :");
			add[0]=input.next();
			System.out.printf("Last Name :");
			add[1]=input.next();
			System.out.printf("Phone #(No Spaces):");
			add[2]=input.next();
			System.out.printf("Email :");
			add[3]=input.next();
			file.add(add);
			break;
		case 5:
			file.close();
			System.exit(1);
		}
		}catch(InputMismatchException e){
			System.out.println("Invalid Choice");
			input.next();
		}catch(NullPointerException e){
			System.out.println("Not a valid choice");
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Please Don't Touch the Save file! If this is not what happened I really don't know.");
		}
	}
	public static void printAll(){
		Contact[] AllContacts = file.getAll();
		String[] contact;
		for(Contact contactin : AllContacts){
			contact=contactin.get();
			System.out.printf("First: %s%nLast: %s%nPhone: %s%nEmail: %s%n%n",contact[0],contact[1],contact[2],contact[3]);
		}
	}
	

}