class A
{
	/*A(int a)
	{
		int x=a+10;
		System.out.println(x);
	}*/
	//int x=10;
	int sum(int x,int y)
	{
		return(x+y);
	}
}
class B extends A
{
	/*B(int a)
	{
		super(a);						//Used to call the parent class constructor
		int x=a;
		System.out.println(x);
	}
	int x=20;
	void disp()
	{
	System.out.println(x);
	System.out.println(super.x);		//Used to refer parent class variables in case of overshadowing
	}
	*/
	int sum(int a, int b)
	{
		int z=super.sum(10, 20);		//Will call the parent class method
		return(z);
	}
}	
public class C {

	public static void main(String[] args) {
		B b1=new B();
		int c=b1.sum(10,20);				//Calls the derived class method
		System.out.println(c);
	}

}
