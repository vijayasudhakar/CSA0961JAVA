import java.util.*;
class simple
{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Principle:");
	int f = s.nextInt();
	System.out.println("Enter the Time:");
	int t = s.nextInt();
	System.out.println("Enter the Rate of Intreest:");
	int r = s.nextInt();
	double a = ((f*t*r)/100);
	System.out.println("Simple Intrest:"+a);
}
}
