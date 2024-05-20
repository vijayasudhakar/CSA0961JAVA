import java.util.*;
class triangle
{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Length:");
	int l = s.nextInt();
	System.out.println("Enter the Width:");
	int w = s.nextInt();
	double a = (0.5)*l*w;
	System.out.println("Area of the Triangle:"+a);
}
}
