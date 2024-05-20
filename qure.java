import java.util.*;
class QR
{
	public static void main(String arg[])
{
	double c,d;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of A:");
	int a = s.nextInt();
	System.out.println("Enter the value of B:");
	int b = s.nextInt();
	c = a/b;
	d = a%b;
	System.out.println("The Quotient and Remainder:"+c+","+d+"");
}
}
