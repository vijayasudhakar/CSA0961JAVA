import java.util.*;
class celsius
{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Celsius:");
	double f = s.nextDouble();
	double a = (0.55*(f-32));
	System.out.println("Celsius:"+a);
}
}
