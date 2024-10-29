import java.util.Scanner;
	public class OddandEven{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);

		for (int count = 0; count < 3; count++){
			System.out.println("Enter number: ");
			int number = input.nextInt();
		if (number % 2 == 0){ 
			System.out.print("it is even ");
		}
		else { 
			System.out.print("it is odd ");
		}
		}
}
}
