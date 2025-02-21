import java.util.Scanner;
public class BookMain{
	static Scanner userInput = new Scanner(System.in);

	static Bank bank = new Bank();
	public static void main(String[] args){

		createAccount();
	}

	public static void createAccount(){
		System.out.print("Enter your firstName: ");
		String name = userInput.next();
		System.out.print("Enter your phone number: ");
		String phoneNumber = userInput.next();
		System.out.print("Enter your pin: ");
		String pin = userInput.next();

		bank.createNewAccount(name, phoneNumber, pin);
		System.out.println("Account created successfully");
	}
}