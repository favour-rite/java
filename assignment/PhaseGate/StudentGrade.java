import java.util.Scanner;
public class StudentGrade{
	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);
		
		System.out.println(" Enter number of students: ");
		int students = userInput.nextInt();
	
		System.out.println(" Enter student marks: ");
		int subjects = userInput.nextInt();		


		
		int[][] array = new int[students][subjects];

		for (int count = 0; count < students; count++) {
			for (int counter = 0; counter < subjects; counter++) {

				System.out.println("Enter marks for student " + (count + 1) + " in subject " + (counter + 1) + ": ");
				array[count][counter] = userInput.nextInt();

		for(int index = 0; index < students; index++){
			for(int indexex = 0; indexex < subjects; indexex++){
				System.out.println("Enter marks for student " + (index+ 1) + " in subject " + (indexex + 1) + ": ");
			}
			}
				
				
			
			}



		}









	}

}