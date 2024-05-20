import java.util.*;
class swap3
{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of A:");
	int f = s.nextInt();
	System.out.println("Enter the value of B:");
	int b = s.nextInt();
	int k;
	k=f;
	f=b;
	b=k;
	System.out.println("Value of A and B:"+f+","+b+"");
}
}
