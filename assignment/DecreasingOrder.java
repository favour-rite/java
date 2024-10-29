import java.util.Scanner;
	public class DecreasingOrder{
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		int count = 0;
		while(count < 10){

		System.out.print("Enter number. ");
		int number1  = input.nextInt();

		System.out.print("Enter number. ");
		int number2 = input.nextInt();

		System.out.print("Enter number. ");
		int number3 = input.nextInt();
		
	
		if (number3 > number2 && number2 > number1){
			System.out.print("increasing order ");
		}
		else {
			System.out.print("decreasing order ");
		}
			count++;
		}
			System.out.println("Enter 1 to continue and 0 to quit ");

}
}