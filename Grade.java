import java.util.Scanner;
public class Grade {

	public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the marks(0-100)");
int marks=s.nextInt();
if(marks>=0 && marks<40)
{
	System.out.println("Fail");
}
else if (marks>=40 && marks<50)
{
	System.out.println("Average");
}
else if (marks>=50 && marks<70)
{
	System.out.println("Good");
}
else if (marks>=70 && marks<85)
{
	System.out.println("Very Good");
}
else if (marks>=85 && marks<=100)
{
	System.out.println("Excellent");
}
else
	System.out.println("Wrong Input");
}

}
