import  java.util.Scanner;

public class Nokia{
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
					break;


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
											break;
					}

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
									break;


				case 8: System.out.print(" Info service "); 
								break;
				case 9: System.out.print(" Voice mailbox number"); 
								break;
				case 10: System.out.print(" Service command editor "); 
								break;
						
					

		case 3:	System.out.print(" Chat "); break;
		


		case 4: System.out.print (" Call register "); break;
			int callregister = input.nextInt();
				switch(callregister) {

				case 1: System.out.print(" Missed calls "); 
								break;
				case 2: System.out.print(" Recieve calls  "); 
								break;
				case 3: System.out.print(" Dialled numbers  "); 
								break;
				case 4: System.out.print(" Erase recent call lists "); 
								break;
				case 5: System.out.println(" Show call duration "); 
								break;
					}
						break;

					case 1: System.out.println(" Last call duration "); 
										break;
					case 2: System.out.println(" All calls duration "); 
										break;
					case 3: System.out.println(" Recieve calls' duration "); 
										break;
					case 4: System.out.println(" Dialled calls'  "); 
										break;
					case 5: System.out.println(" Clear timers"); 
										break;


										
				case 6: System.out.print(" Show call cost ");
					int showcallcost = input.nextInt();
						switch(showcallcost){ 
									
					case 1: System.out.print(" Last call costs "); 
									break;
					case 2: System.out.print(" All costs' cost "); 
									break;
					case 3: System.out.print(" Clear counter "); 
								break;
						}

					
				case 7: System.out.print(" Call cost setting "); 
									break;
					case 1: System.out.print(" Call cost limit "); 
									break;
					case 2: System.out.print(" Show cost in "); 
									break;


				case 8: System.out.print(" Prepaid credit "); 
									break;
			


		case 5: System.out.print(" Tones "); 
			int tones = input.nextInt();
			switch(tones){
								
				case 1: System.out.print(" Ringing tone "); 
										break;
				case 2: System.out.print("Ringing volume "); 
										break;
				case 3: System.out.print("Incoming call alert "); 
										break;
				case 4: System.out.print(" Composer "); 
										break;
				case 5: System.out.print("Message alert tone  "); 
										break;
				case 6: System.out.print(" Keypad tones"); 
										break;
				case 7: System.out.print(" Warning and game tones "); 
										break;
				case 8: System.out.print(" Vibrating alert "); 
										break;
				case 9: System.out.print(" Screen saver "); 
										break;

					}


		case 6: System.out.print(" Settings "); 
			int settings = input.nextInt();
			switch(settings){
								
			case 1: System.out.print(" Call settings ");
				int callsettings = input.nextInt();
			switch(callsettings){ 
										
				case 1: System.out.print(" Automatic redial "); 
										break;
				case 2: System.out.print(" Speed dialing "); 
										break;
				case 3: System.out.print(" Call waiting options "); 
										break;
				case 4: System.out.print(" Own number sending "); 
										break;
				case 5: System.out.print("Phone line in use  "); 
										break;
				case 6: System.out.print(" Automatic answer "); 
						
				}						break;
			}

			case 2: System.out.print(" Phone settings "); 
				int phonesettings = input.nextInt();
			switch(phonesettings){
										
				case 1: System.out.print(" Language "); 
										break;
				case 2: System.out.print(" Cell info display "); 
										break;
				case 3: System.out.print(" Welcome note "); 
										break;
				case 4: System.out.print(" Network selection "); 
										break;
				case 5: System.out.print(" Lights "); 
										break;
				case 6: System.out.print(" Confirm SIM service actions "); 
										break;
				}
					break;


			case 3: System.out.print(" Security settings "); 
				int phonesetting = input.nextInt();
			switch(phonesettings){

				case 1: System.out.print("PIN code request "); 
										break;
				case 2: System.out.print(" Call barring service "); 
										break;
				case 3: System.out.print("  Fixed dialling "); 
										break;
				case 4: System.out.print(" Closed user group "); 
										break;
				case 5: System.out.print(" Phone security "); 
										break;
				case 6: System.out.print(" Change access order "); 
										break;
				}
					break;


			case 4: System.out.print(" Restore factory settings "); 
										break;


		case 7: System.out.print(" Call divert "); 
								break;
		case 8: System.out.print(" Games "); 
								break;
		case 9: System.out.print(" CalculatorGames "); 
								break;
		case 10: System.out.print(" Reminder "); 
								break;


		case 11: System.out.print(" Clock "); 
			int clock = input.nextInt();
		switch(clock){
								

				case 1: System.out.print("Alarm clock "); 
									break;
				case 2: System.out.print(" Clock settings "); 
									break;
				case 3:	System.out.print(" Date settings "); 
									break;
				case 4: System.out.print(" Stopwatch "); 
									break;
				case 5: System.out.print(" Countdown timer "); 
									break;
				case 6: System.out.print(" Auto update of date and time "); 
									break;
			} 
				break;

		case 12: System.out.print(" Profiles "); 
							break;

		case 13: System.out.print(" SIM services "); 
								break;
				
				
		}
		
	}


}

	
