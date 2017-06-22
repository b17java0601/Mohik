import java.util.Scanner;
public class Student {
	int roll_no;
	float marks;
	String name;
	Scanner pc=new Scanner(System.in);
	public static void main(String[] args) {
		float big=0;
		String best;
		Student s1=new Student();
		s1.input();
		Student s2=new Student();
		s2.input();
		Student s3=new Student();
		s3.input();
		s1.display();
		s2.display();
		s3.display();
		if(s1.marks>s2.marks)
		{
			big=s1.marks;
			best=s1.name;
		}
		else
			{
			big=s2.marks;
			best=s2.name;
			}
			
		if(s3.marks>big)
		{
			big=s3.marks;
			best=s3.name;
		}
		System.out.println("Highest marks are "+big+" of "+best);
	}
	void input()
	{
		System.out.println("Enter name");
		name=pc.nextLine();
		System.out.println("Enter roll no.");
		roll_no=pc.nextInt();
		System.out.println("Enter marks");
		marks=pc.nextFloat();
	}
	void display()
	{
		System.out.println("Name="+name+"\t"+"Roll no.="+roll_no+"\t"+"Marks="+marks);
	}

}
