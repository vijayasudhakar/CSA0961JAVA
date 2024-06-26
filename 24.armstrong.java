import java.util.*;
import java.lang.Math;
class king
{
	public static void main(String a[])
{
	Scanner s = new Scanner(System.in);
	int r=0,i,n,c,k=0;
	System.out.println("Enter the Number:");
	n = s.nextInt();
	c=n;
	while(n!=0)
	{
		n = n/10;
		k++;
	}
	n=c;
	while(n!=0)
	{
		i = n%10;
		r += Math.pow(i,k);
		n = n/10;
	}
	if(c==r)
	System.out.println("It is a Armstrong Number");
	else
	System.out.println("It is NOT a Armstrong Number");
}
}
