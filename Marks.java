import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String grade;
		System.out.println("Enter your grade");
		grade=s.nextLine();
		switch(grade)
		{
		case "Excellent":
		
			System.out.println("Marks are between 85 and 100");
			break;
		
		case "Very Good":
		
			System.out.println("Marks are between 70 and 85");
			break;
		
		case "Good":
		
			System.out.println("Marks are between 50 and 70");
			break;
		
		case "Average":
		
			System.out.println("Marks are between 40 and 50");
			break;
		
		case "Fail":
		
			System.out.println("Marks are less than 40");
			break;
		
		default:
			System.out.println("Wrong Input");
		}
		
	}

}
