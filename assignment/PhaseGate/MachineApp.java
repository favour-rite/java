import java.util.Scanner;
public class MachineApp{
	public static void main(String[] args){	


	Scanner userInput = new Scanner(System.in);		

			
	int pin = 0000;
	int accountBalance = 10000;
	boolean sentinel = true;

while(sentinel){
		System.out.println("""
			
			MENU
	
		[1.]Create an Account
			
		[2.] Withdrawal
		[3.] Close account
		[4.] Deposite
		[5.] Check Account Number
		[6.] Transaction
		[7.] Change Pin
		[8.] Exit 
	""");
		int menu = userInput.nextInt();

	switch(menu){

		case 1: System.out.println(" Enter first name: ");
			String name = userInput.next();

			System.out.println("Enter ur last name: ");
			String lastName = userInput.next();

			System.out.println(" Enter pin: ");
			pin = userInput.nextInt();

			System.out.println("Enter bvn: ");
			int bvn = userInput.nextInt();
			
		
			System.out.println("Enter number: ");
			int number = userInput.nextInt();
			break;
			
		case 2: System.out.println(" WITHDRAW ");
			int withdrawal = userInput.nextInt();

			System.out.println(" Enter pin: ");
			int maybepin = userInput.nextInt();
			
			if(maybepin != pin || maybepin != 4){
				System.out.println("Invalid input");
			}
			if(withdrawal <= accountBalance){
				accountBalance -= withdrawal;
				System.out.println("Your Balance is:"+ accountBalance);
			}
			break;
		case 3: System.out.println("Check deposite");

		case 8:
			sentinel = false;
			break;				
	}
}




}

}








