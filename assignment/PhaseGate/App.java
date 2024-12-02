import java.time.LocalDate;
import java.util.Scanner;

public class App{
	public static void main(String [] args){

	Scanner userInput = new Scanner(System.in);
		

	System.out.println(" ~~~Your Period Your Safety~~~");
	System.out.println(" Track Your Menstrual Cycle, Safe Cycle, Ovulation Dates ");

	System.out.print(" ~~~Enter Your Name: ");
	String name = userInput.next();
	
	System.out.println(" Enter age: ");
	int age = userInput.nextInt();
	if (age < 13 && age > 50){
		System.out.println(" PIKIN wetin u dey find ");
		System.out.print(" Obinrin: UNDERAGE!!!... ");
	}else{
		System.out.println("See the doctor");
	}
	
	System.out.print("Enter your last period length");
	int length = userInput.nextInt();
	if(length < 21 && length > 35){
		System.out.print("go and see your doctor");
	}

	System.out.println(" Enter your last menstrual period (format: yyy-month-day)");
	String lastMenstrualPeriod = userInput.next();

	LocalDate lastPeriod = LocalDate.parse(lastMenstrualPeriod);
	LocalDate nextPeriod = lastPeriod.plusDays(length);

	System.out.println("Your next menstrual cycle is  "+ nextPeriod);
	System.out.print("enter your ovulation length");
	int cycle = userInput.nextInt();


	System.out.println("Enter  your last ovulation period (format: yyy-month-day)");
	String startDate = userInput.next();

	LocalDate ovul = LocalDate.parse(startDate);
	LocalDate nextOvul = ovul.plusDays(cycle);
	System.out.println("your next ovulation period is "+ nextOvul);



	System.out.print("Enter your menstruation last flow date: (format: yyyy-month-day): ");
	String nextPeriod = input.next();
	LocalDate ovul = LocalDate.parse(nextPeriod);
	LocalDate nextOvul = ovul.plusDays(14);
	System.out.println("your next ovulation period is "+ nextOvul);
		}
	
	}




}





