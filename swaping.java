import java.util.*;
class swap
{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of A:");
	int f = s.nextInt();
	System.out.println("Enter the value of B:");
	int b = s.nextInt();
	f = f+b;
	b = f-b;
	f = f-b;
	System.out.println("Value of A and B:"+f+","+b+"");
}
}
