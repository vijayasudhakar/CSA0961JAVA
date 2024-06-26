import java.util.*;
class cel
{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Celsius:");
	int c = s.nextInt();
	double a = (((1.8)*c)+32);
	System.out.println("Farenheit:"+a);
}
}
