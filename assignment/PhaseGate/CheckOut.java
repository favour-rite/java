import java.util.Scanner;
import java.util.Date;

public class CheckOut{
	public static void main(String [] args){


	collectInput();
	totalForEachProduct()
	calculateDiscount()
	calculateBillTotal()
	calculateBalance()
	}

	Date date = new Date();

	public static void collectInput(){
		Scanner userInput = new Scanner(System.in);

		System.out.println(" >>>> ChopChopStore <<<< ");
		System.out.println(" Wellcome LOVE TO CHECKOUT WHAT IN CHOPCHOP STORE )( ");
		
		System.out.print(" What is the customers name: ");
		String customersName = userInput.next();

		while(true){

		System.out.print(" What did you buy?: ");
		String product = userInput.next();

		System.out.println(" How many pieces?: ");
		int pieces = userInput.nextInt();
	
		System.out.println(" How much per unit?: ");
		String price = userInput.next();
	
		System.out.println(" Add more items? (yes/no): ");
		String answer = userInput.next();

		if(answer.equalsIgnoreCase("NO")){
		break;
		}
		}

	System.out.print(" What is the cashiername: ");
	String cashierName = userInput.next();

	System.out.print(" How much discount will he/she get? ");
	double discount = scanner.nextDouble();

	}


	
	public static void totalForEachProduct(){
		for(int index = 0; index < price  ; index++){
			double totalPrice = price.get(index) * price.get(index);
			total.add(totalPrice);
		}

	}

	public static void calculateDiscount(){
		discountPrice = (discount / 100) * subTotal;
	}

	public static void calculateVat(){
		vat = (17.50 / 100) * subTotal;
	}

	public static void calculateBillTotal(){
		billTotal = subTotal - discountPrice + vat;
	}
	public void calculateBalance(){
		System.out.println("How much did the custom give to you?");
		double amountPaid = scanner.nextDouble();
		balance = amountPaid - billTotal;	
	}


	
	










	
	
}