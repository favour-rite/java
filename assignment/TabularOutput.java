 public class TabularOutput{
	public static void main(String [] args){

	int number = 0;
	int square = 0;
	int cube = 0;
	int squaredcube = 0;


	while (number <= 5){
		square = number * number;
		cube = number * number * number;
		squaredcube = cube * number;
		number++;
	System.out.println(number+  " \t "+ square + "\t" + cube + "\t" +" "+ squaredcube);

	}
}
}