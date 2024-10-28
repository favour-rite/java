import java.util.Scanner;
public class MultiplicationTables{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		for(int count = 1; count <= 10; count++){
			System.out.print(" ");
			for(int counter = 1; counter <= 10; counter++){
				int total = count * counter;
			System.out.print( counter + " * " + count + " = " + total);
			System.out.print("\t");
			} 
		}
	}
}