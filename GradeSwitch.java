import java.util.Scanner;
public class GradeSwitch {

	public static void main(String[] args) {
		int marks;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your marks (0-100)");
		marks=s.nextInt();
		int a=(marks/10);
		switch(a)
		{
		case 0:case 1:case 2:case 3:
			System.out.println("Fail");
			break;
		case 4:
			System.out.println("Average");
			break;
		case 5:case 6:
			System.out.println("Good");
			break;
		case 7:

			
		}
	}

}
