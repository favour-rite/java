import java.util.Scanner;
	public class Multiples22{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);

		int counter = 0;
		while (counter < 5){
		System.out.print(" Enter number");
		int number = input.nextInt();
		
		if (number % 5 == 0){
		System.out.print("it is a multiple of five. ");	
		}
		else {
		System.out.print("not a multiple of five. ");
			counter++;
		}
		}
	}
}