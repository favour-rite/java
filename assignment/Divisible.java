import java.util.Scanner;
	public class Divisible{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		for(int count = 0; count < 3; count++){

		System.out.print("enter number ")
		int number = input.nextInt();

		if (number % 5 == 0 && number % 11 == 0){

		System.out.print("it is divisible by 5 and 11 ");
		}
		else {
		System.out.print("divisible by 11 ");	
		}
	
		}
}
}