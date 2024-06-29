import java.util.*;
class king{
public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	char ch;
	ch = s.nextChar();
	int i,k;
	System.out.print("Original word: ");
	System.out.println(str); 
	for (i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		if(ch == '@'||ch == '#'|| ch == '$'|| ch == '%'|| ch == '&'){
		k++;
		}
	}
	System.out.println(k);
	}
}
