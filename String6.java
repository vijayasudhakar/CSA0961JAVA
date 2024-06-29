import java.util.*;
class king{
public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	char ch;
	int k;
	ch = s.nextChar();
	System.out.print("Original word: ");
	System.out.println(str); 
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		if(ch == 'a'||ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
		k++;
		}
	}
	System.out.print("No.of Ovals:"+k);
	}
}
