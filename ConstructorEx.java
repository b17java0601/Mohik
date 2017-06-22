import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConstructorEx {
		String name,desg;
		float sal;
		int code;
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		public static void main(String[] args)throws IOException {
			ConstructorEx s[]=new ConstructorEx[3];
			for(int i=0;i<s.length;i++)
			{
				s[i]=new ConstructorEx();		//Method called implicitly during object creation
			}
			for(int i=0;i<s.length;i++)
			{
				s[i].display();
			}
			
		}
	ConstructorEx()throws IOException		//Constructor
	{
		System.out.println("Enter employee name");
		name=br.readLine();
		System.out.println("Enter the employee code");
		code=Integer.parseInt(br.readLine());
		System.out.println("Enter the employee designation");
		desg=br.readLine();
		System.out.println("Enter the employee salary");
		sal=Float.parseFloat(br.readLine());
	}
	void display()
	{
		System.out.println("Employee Name="+name+"\tEmployee Code="+code+"\tEmployee Designation="+desg+"\tEmployee Salary="+sal);
	}

	}


