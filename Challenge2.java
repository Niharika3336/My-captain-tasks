import java.util.*;
public class Challenge2
{
  public static int recursion(int n){
        if(n<=1){
            return n;
        }
        return recursion(n-1)+recursion(n-2);
  }
	public static void main(String[] args) {
	    int n;
	    Scanner sc= new Scanner(System.in);
		  System.out.println("Fibonacci Series");
		  System.out.println("Enter a number: ");
		  n=sc.nextInt();
		  for(int i=0;i<n;i++){
		    System.out.print(recursion(i)+" ");
		}
	}
}
