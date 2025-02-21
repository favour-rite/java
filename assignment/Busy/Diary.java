import java.util.Scanner;
public class Diary{
	public static void main(String [] args){

	Scanner userInput = new Scanner(System.in);

	System.out.print(""" 
				1. Create Diary
				2. Lock Diary
				3. Unlock Diary
				4. Find Entry by Id
				5. Add Entry
				6. Delect Entry
				7. Update Entry
		""");

	System.out.print("Choose an option: "); 
	int choice = userInput.nextInt();

		case 1: CreateDiary(); 
			break; 

		case 2: LockDiary(); 
			break; 

		case 3:  Unlock Diary();
			break;
 
		case 4: FindEntry();
			break; 

		case 5: AddEntry();
			break; 

		case 6: DelectEntry();
			break; 

		case 7: UpdateEntry();
			break;
		case 8:	exit(); 
			break; 

		default: System.out.println("Invalid choice."); 
			break; 

	public void createDiary(){
		var input = JOptionPane.showInputDialog(prompt);

		System.out.println("This time you said " + input);



	}
 
	public void lockDiary(){




	}



	}


}