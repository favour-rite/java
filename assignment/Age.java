import java.util.Scanner;
public class Age{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = input.nextInt();

		if (age <= 12){
			System.out.println("child");

		}

		else if (age <= 17){
			System.out.print("teen");
		}

		else if (age = 64){
			System.out.print("adult ");
		}

		else if (age >= 65){
			System.out.print(" senior ");
		}


}
}
	

		

