import java.util.Scanner;
public class Tic{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);

 char[][] gameBoard = {

      {'_','|','_','|','_'},

      {'_','|','_','|','_'},

      {' ','|',' ','|',' '}

    };
    
    System.out.println(Arrays.deepToString(gameBoard));

	System.out.println("Would u like to play");
	String input = userInput.nextLine();
	
}


