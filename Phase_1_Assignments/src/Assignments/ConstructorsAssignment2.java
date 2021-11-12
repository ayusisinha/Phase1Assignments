package Assignments;

public class ConstructorsAssignment2 {

public static class Area
{
    static int s,l,w;
    static double r;
    Area()
    {
        s=l=w=0;    
        r=0.0d;
    }
    Area(int S)
    {
        s=S;
    }
    Area(double R)
    {
        r=R;
    }
    Area(int L, int W)
    {
        l=L;
        w=W;
    }
    
    static void square()
    {
        System.out.println("Area of square: "+ (s*4));
    }
    static void circle()
    {
        System.out.println("Area of circle: "+ ((3.14d)*(r*r)));
    }
    static void rectangle()
    {
        System.out.println("Area of rectangle: "+ (l*w));
    }
    
    static double calculate(int p, int q)
    {
        return ((p*q)/2);
       
    }
    static double calculate(double b, double h)
    {
        return ((0.5d)*b*h);
    }
        
	public static void main(String[] args) {
	    
		new Area();
		new Area(10);
		new Area(7.0d);
		new Area(7,14);
		square();
		circle();
		rectangle();
		System.out.println("Area of rhombus: "+calculate(10,20));
		System.out.println("Area of triangle: "+calculate(7,14));
	}
}
}


