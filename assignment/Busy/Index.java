public class Index{

	public static void main(String args){
	
	int[] numbers = {34, 6, 23, 12};
	int search = 6;

	}

	public int searchNumber(int[] numbers, int search){

		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] == search){
			return count;
			}
		}
		throw IllegalArgumentException("Not available");
	}
}