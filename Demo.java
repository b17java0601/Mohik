class Parent{
	int x;
	Parent()				//Constructor Chaining
	{
		System.out.println("This is the Parent class");
		x=10;
	}
	void disp()
	{
		System.out.println("This is parent class method "+x);
	}
}
class Child extends Parent
{
	int y;
	Child()				//Control first goes to default constructor of the Parent class first then executes the Child() constructor
	{
		System.out.println("This is the Child class");
		y=20;
	}
	void show()
	{
		disp();
		System.out.println(x+"\t"+y);
	}
}
public class Demo {

	public static void main(String[] args) {
		Child c=new Child();			//Control goes from here to the default constructor of Child class
		c.show();
	}
	

}
