package Assignments;

public class ConstructorsAssignment1 
{
    static int calculate()
    {
        int a = 10, b = 20;
        return a+b;
    }
    static float calculate(int r)
    {
        return ((3.14f)*(r*r));
    }
    static int calculate(int l, int w)
    {
        return l*w;
    }
        
	public static void main(String[] args) {
	    
		System.out.println("Sum of two numbers: "+calculate());
		System.out.println("Area of circle: "+calculate(7));
		System.out.println("Area of rectangle: "+calculate(7,14));
	}
}
