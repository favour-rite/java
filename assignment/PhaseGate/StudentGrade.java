import java.util.Scanner;
public class StudentGrade{
	public static void main(String[] args){
		
		Scanner userInput = new Scanner(System.in);

		System.out.println(" ~~~ STUDENTGRADEAPP )SG( ~~~ ");

		System.out.println(" ================================= ");		
		System.out.println(" How many students do you have: ");
		int students = userInput.nextInt();
	
		System.out.println(" How many subject do they offer: ");
		int subjects = userInput.nextInt();		
		System.out.println(" ================================= ");

		
		int[][] array = new int[students][subjects];
		int[][] array = new int[SUB1][SUB2];
		int[][] array = new int[scores][total];
		int[][] array = new int[average][position];
		
		
		for (int count = 0; count < students; count++) {
			for (int counter = 0; counter < subjects; counter++) {
			
				System.out.println("Enter score for student " + (count + 1) + " score for subject " + (counter + 1) + ": ");
				int number = userInput.nextInt();

				if(number < 100 && number > 0){
					array[count][counter] = number;
				}else{
					System.out.println("wrong input");
				}

			}
		}


		System.out.println(" ");


		for(int row = 0; row <  ; row++){
			for(int column = 0; column < ; column++){
				
				total += array[count][counter];

			


		}
								
			
		


		System.out.println(" ======================================================================================================================= ");
		System.out.println(" STUDENT\t "+" SUB1\t "+" SUB2\t "+" SUB3\t "+" TOTAL\t "+" AVERAGE\t "+" POSITION ");
		System.out.println(" ======================================================================================================================= ");


					

		

		
	

}
}