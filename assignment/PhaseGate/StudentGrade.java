import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{
	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);
	
		

			studentsScores();



			}

			System.out.println(" ~~~ STUDENTGRADEAPP )SG( ~~~ ");

			System.out.println("================================= ");		
			System.out.println(" How many students do you have: ");
			int students = userInput.nextInt();
	
			System.out.println("How many subject do they offer: ");
			int subjects = userInput.nextInt();		
			System.out.println(" ================================= ");

		

		int[][] array = new int[students][subjects];
		
		public static void studentsScores(){
		int totalScore = 0;
		for (int row = 0; row < subjects; row++) {
			for (int column = 0; column < students; column++) {
				totalScore+=array[row][column];	
				System.out.println("Enter score for student " + (row + 1) + " score for subject " + (column + 1) + ": ");
				int number = userInput.nextInt();
				
				if(number < 100 && number > 0){
					array[row][column] = number;
				}else{
					System.out.println("wrong input");
					column--;
				}
			System.out.printf(" Total Score is: %d%n " , totalScore);
			}
		}
		}
	
	
		
		

	
}





       
		//System.out.println(" ======================================================================================================================= ");
		//System.out.println("%s%n%s%n STUDENT\t "+" SUB1\t "+" SUB2\t "+" SUB3\t "+" TOTAL\t "+" AVERAGE\t "+" POSITION ");
		//System.out.println(" ======================================================================================================================= ");
				
		//System.out.println("Lowest Score in the Grade Book is:"+  );
		//System.out.println("Highest Score in the Grade Book is:"+ );
		//System.out.println("Total Score is:" + );
		//System.out.println("Average Score is:"+ );
		//System.out.println("Number of Passes: + ");
		//System.out.println("Number of Fails"+ );
