import java.util.*;
class vote
{
public static void main(String S[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value:");
	int x = s.nextInt();
	int l=0;
	if (x=>18)  {  
        System.out.println("she is Elgible for Vote.");
	}
	if (x<18)
	{
	l=18-x;
	System.out.println("She is not Elgible for vote upto"+ l+"years");
	}
  }
}
