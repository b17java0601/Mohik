import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class EMS {
	String name,desg;
	float sal;
	int code;
	InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(r);
	public static void main(String[] args)throws IOException {
		EMS s[]=new EMS[3];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new EMS();
			s[i].input();
		}
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}
		
	}
void input()throws IOException
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
