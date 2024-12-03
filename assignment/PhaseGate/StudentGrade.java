import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{
	public static void main(String[] args){
		







		}

		Scanner userInput = new Scanner(System.in);
		public static void studentsDetails(){
		
		Scanner userInput = new Scanner(System.in);
		System.out.println(" ~~~ STUDENTGRADEAPP )SG( ~~~ ");

		System.out.println(" ================================= ");		
		System.out.println(" How many students do you have: ");
		int students = userInput.nextInt();
	
		System.out.println(" How many subject do they offer: ");
		int subjects = userInput.nextInt();		
		System.out.println(" ================================= ");

		}

		int[][] array = new int[students][subjects];
		int[][] totalsheet = new int[scores][total];
		int[][] position = new int[average][position];
		
		public static void studentsandscores(){
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
		
		}


		public static void getTotalandAverage(){
		System.out.println(" ");
		public static void
		for(int row = 0; row < students[column]; row++){
			for(int column = 0; column <subjects[row] ; column++){
				int total = 0;
				total += array[row][column];
			}
		}
		}


		System.out.println(" ======================================================================================================================= ");
		System.out.println("%s%n%s%n STUDENT\t "+" SUB1\t "+" SUB2\t "+" SUB3\t "+" TOTAL\t "+" AVERAGE\t "+" POSITION ");
		System.out.println(" ======================================================================================================================= ");

		//System.out.println("Lowest Score in the Grade Book is:"+  );
		//System.out.println("Highest Score in the Grade Book is:"+ );
		//System.out.println("Total Score is:" + );
		//System.out.println("Average Score is:"+ );
		//System.out.println("Number of Passes: + ");
		//System.out.println("Number of Fails"+ );
			
	}
}