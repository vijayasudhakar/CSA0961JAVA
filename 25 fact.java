import java.util.*;
class king
{
	public static void main(String ar[])
{
	Scanner s = new Scanner(System.in);
	int i,n,fact;
	fact = 1;
	System.out.println("Enter the n value:");
	n = s.nextInt();
	for(i=1;i<=n;i++)
	{
	fact = fact*i;
	}
	System.out.println("Factorial of "+n+" is"+fact); 
}
}
