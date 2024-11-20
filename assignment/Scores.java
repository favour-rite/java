import java.util.Scanner;

public class Scores{
    public static void main(String args[]){
        
        
           Scanner input = new Scanner(System.in);

		System.out.print("Enter number ");
		int number = input.nextInt();
        
       		int count = 0;
		int passed = 0;
		int failed = 0;
		int score = 0;

		while (count <= 30 ){
		System.out.print("Enter number ");
		int number = input.nextInt();
        		count++;
		 { 
                 

    		 if(score >= 80){
           		 System.out.print("A");
        	}

       		 else if( score >= 60 && score < 80){
          		 System.out.print("B");
       		 } 

      		 else if(score >= 40 && score < 60){
          		  System.out.print("C");
        	}



		 		
	
    }
}



