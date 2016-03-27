import java.util.Scanner;

public class CalculateAverage{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		double average = 0;
		int input;
		
		System.out.println("Please enter a grade value, or type 0 to quit: ");
		for (int i=1; i!=0; i++){
			input = scanner.nextInt();
			if (input == 0){
				break;
			}
			sum = sum + input;
			average = sum/i;
		}
		System.out.println("Your average grade is: " + average);
		
	}
}



