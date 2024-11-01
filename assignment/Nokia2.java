import  java.util.Scanner;

public class Nokia2{
	public static void main (String[] args){


		Scanner input =new Scanner (System.in);
		System.out.print("Enter your choice");
		int choice = input.nextInt();

		switch(choice){
		case 1 : 	System.out.print("Phonebook"); 
				int phonebook = input.nextInt();
				switch(phonebook) {

				case 1 : System.out.print(" Search "); 
								break;
				case 2 : System.out.print(" Service "); 
								break;
				case 3 : System.out.print(" Add name "); 
								break; 
				case 4 : System.out.print(" Erase ");
								 break;
				case 5 : System.out.print(" Edit "); 		
								 break;
				case 6 : System.out.print(" Assign tone ");
								 break;
				case 7 : System.out.print(" Send b' card ");
								 break;
			} 	
					


				case 8 : System.out.print(" options ");
					int options = input.nextInt();
					switch(options){
					
					case 1:System.out.print(" Type of view "); 	
									break;
					case 2:System.out.print(" Memory status "); 								
									break;
				}
					break;

				case 9: System.out.print(" Speed dials "); 
								break;
				case 10: System.out.print(" Voice tags "); 
								break;


		case 2 :	System.out.print("Messages"); break;
				int messages = input.nextInt();
			switch(messages){
				
				case 1: System.out.print(" Write messages "); 
								break;
				case 2: System.out.print(" Inbox "); 
								break;
				case 3: System.out.print(" Outbox "); 
								break;
				case 4: System.out.print(" Picture messages "); 
								break;
				case 5: System.out.print(" Templates "); 
								break;
				case 6: System.out.print(" Simleys "); 
								break;
			}

				case 7: System.out.print(" Message settings "); 
					int messagesettings = input.nextInt();
				switch(messagesettings){
				
					case 1: System.out.print(" Set1 ");
						int set1 = input.nextInt();
						switch(set1){
				
						case 1:System.out.print(" Message centre number "); break;
						case 2: System.out.print(" Message sent as "); break;

						case 3:System.out.print(" Message validity "); 				}
							}				break;
						
					}
							break;

					case 2: System.out.print(" Common ");
						int common = input.nextInt();
						switch (common){ 
								
						case 1:System.out.print(" Delivery reports "); 
									break;
						case 2:System.out.print(" Reply via same centre "); 
									break;
						case 3:System.out.print(" Character support "); 			
									break;
					}
								






		}
	
	}



}
					