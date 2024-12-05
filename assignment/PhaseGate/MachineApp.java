import java.util.Scanner;
public class MachineApp{
	public static void main(String[] args){	


	Scanner userInput = new Scanner(System.in);		

	 String name = null;
	String lastName = null;
	String pin = " 0000";
	int accountBalance = 10000;
	boolean sentinel = true;
	

	
while(sentinel){
		System.out.println("""
			
			MENU
	
		[1.]Create an Account
			
		[2.] Withdrawal
		[3.] Deposite
		[4.] Transaction
		[5.] Check Account Number
		[6.] Close account
		[7.] Change Pin
		[8.] Exit 
	""");
		int menu = userInput.nextInt();

	switch(menu){

		case 1: System.out.println(" Enter first name: ");
			name = userInput.next();

			System.out.println("Enter ur last name: ");
			lastName = userInput.next();

			System.out.println(" Enter pin: ");
			pin = userInput.next();

			System.out.println("Enter bvn: ");
			String bvn = userInput.next();
		
			System.out.println("Enter number: ");
			double number = userInput.nextDouble();
		
			break;
			

		case 2: System.out.println("Enter amount to withdraw: ");
			int withdrawal = userInput.nextInt();

			System.out.println(" Enter pin: ");
			String maybepin = userInput.next();
			
			if(!maybepin.equals(pin) || pin.length() != 4){
				System.out.println("Invalid input Try Again");
				break;
			}
			if(withdrawal <= accountBalance){
				accountBalance -= withdrawal;
				System.out.println("Insufficient Funds!!");
				System.out.println(name + lastName + "Your Balance is:"+ accountBalance);
			}
			break;

		case 3: System.out.println("deposite money ");
			double deposite = userInput.nextDouble();
				deposite+=accountBalance;
				System.out.println(name + lastName + " Your Balance is:"+ deposite);	
		case 8:
			sentinel = false;
			break;				
		}
	}




}




}





