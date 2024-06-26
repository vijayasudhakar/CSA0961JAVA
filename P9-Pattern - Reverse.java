import java.util.*;
class king{
public static void main(String arg[]){
	int i,n,j;
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	for(i=n;i>=1;i--){
		for(j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
}}
