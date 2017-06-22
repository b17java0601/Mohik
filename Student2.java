import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Student2 {
	String name;
	float sub1,sub2,sub3;
	InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(r);
	public static void main(String[] args)throws IOException {
		Student2 s1=new Student2();
		s1.input();
		Student2 s2=new Student2();
		s2.input();
		s1.display();
		s2.display();
	}
	void input()throws IOException
	{
		System.out.println("Enter name");
		name=br.readLine();
		System.out.println("Enter the marks of subject 1");
		sub1=Float.parseFloat(br.readLine());
		System.out.println("Enter the marks of subject 2");
		sub2=Float.parseFloat(br.readLine());
		System.out.println("Enter the marks of subject 3");
		sub3=Float.parseFloat(br.readLine());
		
	}
	void display()
	{
		System.out.println("Name="+name);
		float avg=0;
		avg=(sub1+sub2+sub3)/3;
		System.out.println("Average="+avg);
	}

}
