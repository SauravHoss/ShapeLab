package shapes;
// might be broken, peri method fixy
public class Rhombus implements Shape
{
	private int Diagonal1;
	private int Diagonal2;
	
	public Rhombus(int Diagonal1, int Diagonal2) 
	{
		this.Diagonal1 = Diagonal1;
		this.Diagonal2 = Diagonal2;
	}
		
	public double calculateArea() 
	{
		// To be written by student
		return (0.5 * (Diagonal1 * Diagonal2));
	}

	public double calculatePerimeter() 
	{
		// To be written by student
		return   (2*(Math.pow((Math.pow(Diagonal1,0.5)+ (4*(Math.pow((calculateArea()/Diagonal1),0.5)))), 0.5)));
	}

	public String toString() 
	{
		return "Rhombus- \n"  + "   Diagonal 1: " + Diagonal1 + "   Diagonal2: " + Diagonal2 
		+ "   Area: " + this.calculateArea() + "   Perimeter: " + this.calculatePerimeter();
	}
		
}

	

