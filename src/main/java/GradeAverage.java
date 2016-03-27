import java.lang.reflect.Array;
import java.util.Scanner;

public class GradeAverage {
	
	static int sum = 0;
	
	public static void exitApp(){
		System.out.println("Thank you for using the grade average app");
	}
		
	public static int getUserInput(){
		int i = 0;
		String exit="";
		Scanner scanner = new Scanner(System.in);
		int grades[] = new int[i];
		
		int numberOfCourses = grades.length;
 
		while(exit != "quit"){
			
//			int grades[] = new int[i];
//			
//			int numberOfCourses = grades.length;
			System.out.println("Please enter a grade value or type 'quit' to exit: ");
			String input = scanner.nextLine();
			int gradeValue = Integer.parseInt(input);
			grades[i] = gradeValue;
			sum = grades[i]+sum;
			}
		return numberOfCourses;
			
		}
	
	public static void calculateAverage(int sum, int numberOfCourses){
		int average = sum / numberOfCourses;
		System.out.println("Your average grade is: " + average);
		
	}

	public static void main(String[] args) {

		int numberOfGrades = getUserInput();		
		calculateAverage(sum, numberOfGrades);
	}

}
