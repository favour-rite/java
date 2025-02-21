import java.util.Random; 
import java.util.Scanner; 
public class MathQuiz { 

	public static void main(String[] args) {
 
			int numQuestions = 5; 
			int correctAnswers = 0; 
			int wrongAnswers = 0;
			int number1;
			int number2;
			int correctResult = 0;

			Random random = new Random(); 
			Scanner scanner = new Scanner(System.in);

 	public static void arithmeticSign(){

		for (int count = 0; count < numQuestions; count++) { 

			
			number1 = random.nextInt(10); 
			number2 = random.nextInt(10); 


			char[] operations = {'+', '-', '*','/'}; 
			char operation = operations[random.nextInt(operations.length)]; 

			

			if (operation == '+') { 
				correctResult = number1 + number2; 
			} else if (operation == '-') {
		 		correctResult = number1 - number2; 
			}else if (operation == '*') { 
				correctResult = number1 * number2;
			}else if (operation == '/'){
				correctResult = number1 / number2;
			} 
		}
		
 	}
	public static void mathQuestion(){

		System.out.print("What is " + number1 + " " + operation + " " + number2 + " =? "); 
		int userAnswer = scanner.nextInt();

			if (userAnswer == correctResult) { 
				System.out.println(" Correct ");
 
				correctAnswers++; 
			}else { 
				System.out.println(" Incorrect. The correct answer is " + correctResult ); 	
			}
		

		System.out.println("You got " + correctAnswers + " out of " + numQuestions + " correct!");
	
		
	}
	//public void checkIllegalAnswer(){
		


	//}


	}

 }