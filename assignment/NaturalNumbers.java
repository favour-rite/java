import java.util.Scanner;
public class NaturalNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int total = 0;
		int number = 1;
		while (number <= 10){
			total += number;
			number++;
		}
				System.out.print(total);

	}
}