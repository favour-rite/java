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
		
		for (int count = 0; count < students.length; count++) {
			for (int counter = 0; counter < subjects.length; counter++) {

				System.out.println("Enter score for student " + (count + 1) + " in subject " + (counter + 1) + ": ");
				int array[count][counter] = userInput.nextInt();
				System.out.println("Saving >>>>>>>>>>> ");

				if(array[count] < 100){
					array[count] = userInput.nextInt();
				}else(array[counter] > 0){
					array[counter] = userInput.nextInt();
				}break;
			}
		}

		

		
	

}
}