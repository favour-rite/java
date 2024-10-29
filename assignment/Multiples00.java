import java.util.Scanner;
	public class Multiples00{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		

		for (int number1 = 1; number1 <= 3; number1++){
			System.out.print(" Enter number: ");
			int number = input.nextInt();
		}

		int number2 = 0;
		if (number2 % 5 == 0){
			System.out.println("it is a multiple of five: ");	
		}
		else {
			System.out.println("not a multiple of five: ");

		} 
	}
}