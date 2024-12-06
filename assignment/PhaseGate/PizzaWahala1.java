import java.util.Scanner;
public class PizzaWahala1{
	public static void main (String [] args){

	Scanner userInput = new Scanner(System.in);
	

	System.out.println("Enter number of guests at the birthday party: ");
	int orders = userInput.nextInt();
	System.out.println("Enter size : Sapa size Small money, big boys, Odogwu ");
	int pizzaSize = userInputInt();

		int number_of_slices = 0;
		int price_per_box = 0;

		if (pizza == "Sapa size"){
			int number_of_slices1 = 4;
			int price_per_box = 2000;
		}else if (pizza == "Small money"){
			int number_of_slices2 = 6;
			int price_per_box = 2400;
		}
		else if (pizza == "big boys"){
			int number_of_slices3 = 8;
			int price_per_box = 3000;
		}
		else if (pizza == "Odogwu"){
			number_of_slices4 = 12;
			price_per_box = 4200;
		}
	number0fBboxes =(orders/ numberofslices);
	leftOver = (numberOfBoxes * numberofslices) - orders;
	totalPrices = numberOfBboxes * pricesperbox;
	

	System.out.println("Numbers of pizza to buy: " + numberOfBboxes + boxes);
	System.out.println("Numbers of leftOver: " + leftOver +  slices);
	System.out.println("Price: " + totalPrices);














	}
}