import java.util.*;
class evenodd
{
public static void main(String S[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value:");
	int x = s.nextInt();
	if (x%2==0)    
        System.out.println(x + " is a Even Number.");
    	else
      	System.out.println(x + " is a Odd Number.");
  }
}
