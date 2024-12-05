import java.util.Scanner;
public class PizzaWahala{
	public static void main (String [] args){

	System.out.println("Enter number of guests at the birthday party: ");
	System.out.println("Enter size : 
			1. Sapa size
		 	2. Small money, big boys, Odogwu "))




	int number_of_slices = 0;
	int price_per_box = 0;

	if (pizza == "Sapa size"){
		number_of_slices = 4
		price_per_box = 2000
	}else if (pizza == "Small money"){
		number_of_slices = 6
		price_per_box = 2400
	}
	else if (pizza == "big boys"){
		number_of_slices = 8
		price_per_box = 3000
	}
	else if (pizza == "Odogwu"){
		number_of_slices = 12
		price_per_box = 4200
	}

boxes_of_pizza = (guests / number_of_slices)+1;
total_slice = boxes_of_pizza * number_of_slices;
left_over = total_slice - guests;

total_price = price_per_box * boxes_of_pizza;
System.out.print("Number of pizza to buy: " , boxes_of_pizza , " boxes");
System.out.print("Number of left_over: " , left_over , " slices");
System.out.print("Price: " , total_price);














	}
}