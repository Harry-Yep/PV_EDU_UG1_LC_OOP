import java.util.*;
public class Strings_1 {

	public static void main(String[] args) {
		String firstname;
		String lastname;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your First Name ------->>>");
		firstname = input.nextLine();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter your Last Name ------->>>");
		lastname = input2.nextLine();

		
		System.out.println(firstname + "\n" + lastname);

	}

}
