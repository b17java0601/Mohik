public class Circle {
	private double radius;
	static									//Static block	
	{
		System.out.println("Hello");		//Will be executed before main()
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public Circle()
	{
		this(4.0);
	}
	public double getArea()
	{
		return this.radius*this.radius*Math.PI;		
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		System.out.print(c.getArea());
	}

}
