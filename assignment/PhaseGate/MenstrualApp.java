import java.time.LocalDate;
import java.util.Scanner;

public class MenstrualApp{
	public static void main(String [] args){

	Scanner userInput = new Scanner(System.in);
	
	System.out.println(" ~~~Your Period Your Safety~~~");


	System.out.println("do u want to know about your menstrual cycle: ");
	String answer = userInput.next();

	if(answer.equalsIgnoreCase("Yes")){
		System.out.println("
HINT: What's the menstrual cycle?\nThe menstrual cycle is the monthly series of changes the body goes through to prepare for pregnancy. Each month, one of the ovaries releases an egg. This is called ovulation. Hormonal changes at this time get the uterus ready for pregnancy. If the released egg isn't fertilized during ovulation, the lining of the uterus sheds through the vagina. This is a menstrual period.\n
The menstrual cycle is counted from the first day of one period to the first day of the next. The cycle isn't the same for everyone. Menstrual bleeding might happen every 21 to 35 days and last 2 to 7 days. For the first few years after menstruation begins, long cycles are common. However, menstrual cycles tend to shorten and become more regular as people age.	 ");
	if(answer.equalsIgnoreCase("No")){
		break;
		}
	}


	System.out.print(" ~~~Enter Your Name: ");
	String name = userInput.next();

	System.out.println(" Enter age: ");
	int age = userInput.nextInt();

	if (age < 13){
		System.out.println(" PIKIN wetin u dey find ");
		System.out.print(" Obinrin: UNDERAGE!!!... DANGER ")
	}else if (age > 50){
		System.out.println(" Go Rest You Don Old ");
	}
	
	
	
	
	
	System.out.println(" Enter your average cycle length (in days): ");
        int cycleLength = userInput.nextInt();


}


}





