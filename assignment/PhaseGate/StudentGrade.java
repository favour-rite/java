import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{
	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);
	
		
			System.out.println(" ~~~ STUDENTGRADEAPP )SG( ~~~ ");

			System.out.println("================================= ");		
			System.out.println(" How many students do you have: ");
			int students = userInput.nextInt();
	
			System.out.println("How many subject do they offer: ");
			int subjects = userInput.nextInt();		
			System.out.println(" ================================= ");

		

		int[][] studentScores = new int[students][subjects];
		int[] totalsheet = new int[scores][total];
		//int[][] position = new int[average][position];
		
		double studentTotal = 0;
		double studentAverage;
		for (int count = 0; count < students; count++) {
			for (int counter = 0; counter < subjects; counter++) {

				System.out.println("Enter score for student " + (count + 1) + " score for subject " + (counter + 1) + ": ");
				int number = userInput.nextInt();
				
				if(number < 100 && number > 0){
					studentScores[count][counter] = number;
				}else{
					System.out.println("wrong input");
					counter--;
				}
			studentTotal+=number[];

			}
		}

		
		for(){
			for(int column = 0; column < subjects; column++){
				studentTotal.append(column);
				System.out.print(studentTotal);
			}
		}
		

	}
}



		//public static void getPosition(){

		//}

       
		//System.out.println(" ======================================================================================================================= ");
		//System.out.println("%s%n%s%n STUDENT\t "+" SUB1\t "+" SUB2\t "+" SUB3\t "+" TOTAL\t "+" AVERAGE\t "+" POSITION ");
		//System.out.println(" ======================================================================================================================= ");
				
		//System.out.println("Lowest Score in the Grade Book is:"+  );
		//System.out.println("Highest Score in the Grade Book is:"+ );
		//System.out.println("Total Score is:" + );
		//System.out.println("Average Score is:"+ );
		//System.out.println("Number of Passes: + ");
		//System.out.println("Number of Fails"+ );
