import java.util.*;
class biggestnum
{
public static void main(String S[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of X and Y:");
	int a = s.nextInt();
	int b = s.nextInt();
	if (a<b)    
        System.out.println(b + " is a Biggest Number.");
    	else
      	System.out.println(a + " is a Biggest Number.");
  }
}
