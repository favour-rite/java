import java.util.Scanner;
public class TaxCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);


	System.out.print("Enter annual salary: ");
	int firstPersonSalary = input.nextInt();
	System.out.print("Enter annual salary: ");
	int secondPersonSalary = input.nextInt();
	System.out.print("Enter annual salary: ");
	int thirdPersonSalary = input.nextInt();

		
	if (firstPersonSalary > 30000 || secondPersonSalary > 30000 || thirdPersonSalary > 30000){
	int firstPersonTax =(firstPersonSalary * 15) / 100;
	int secondPersonTax = (secondPersonSalary * 15) / 100;
	int thirdPersonTax = (thirdPersonSalary * 15) / 100;
	
	System.out.println(firstPersonTax);
	System.out.println(secondPersonTax);
	System.out.println(thirdPersonTax);

	}
	else {
		
	int firstPersonTax = (firstPersonSalary * 20) / 100;
	int secondPersonTax = (secondPersonSalary * 20) / 100;
	int thirdPersonTax = (thirdPersonSalary * 20) / 100;
	
	System.out.println(firstPersonTax);
	System.out.println(secondPersonTax);
	System.out.println(thirdPersonTax);

	}
	
	}
}

		
		
