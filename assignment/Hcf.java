import java.util.Scanner;
public class Hcf {
   public static void main(String args[]){

      int a = 0;
	int b = 0;
	int count = 0;
         hcf = 0;

      Scanner input = new Scanner(System.in);

      System.out.println("Enter first number :: ");
      int number = input.nextInt();

      System.out.println("Enter second number :: ");
      int digit = input.nextInt();

      for(count = 1; count <= number || i <= digit; count++) {
         if( number % count == 0 && digit % count == 0 )

         hcf = count;
      }
      System.out.println("HCF of given two numbers is ::"+hcf);
   }