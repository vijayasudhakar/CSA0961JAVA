import java.util.*;
class number
{
public static void main(String S[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value:");
	int x = s.nextInt();
	if (x<0)    
        System.out.println(x + " is a Negative Number.");
    	if (x==0)
      	System.out.println(x + " is ZERO.");
	if (x>0)
	System.out.println(x + " is a Positive Number.");
  }
}
