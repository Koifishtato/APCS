import java.util.Scanner;

public class ContactRead {
	private static ContactFile file;
	private static Scanner input;
	public static void main(String[] args) {
		file = new ContactFile("Test.txt");
		input=new Scanner(System.in);
		while (true){
		Menu();
		}
	}
	
	public static void Menu(){
		String temp;
		String [] tempa;
		System.out.printf("(1) List Contact(First Last)%n(2) Delete Contact(First Last)%n(3) Add Contact%n(4) Display Entire List%n(5) Save And Exit%n");
		switch(input.nextInt()){
		case 1:
			System.out.printf("First Last: ");
			temp=input.next();
			temp=temp.concat(" ").concat(input.next());
			tempa=file.read(temp);
			System.out.println(temp);
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
	}
	public static void printAll(){
		String [] [] AllContacts = file.getAll();
		for(String[] contact : AllContacts){
			System.out.printf("First: %s%nLast: %s%nPhone: %s%nEmail: %s%n%n",contact[0],contact[1],contact[2],contact[3]);
		}
	}
	

}
