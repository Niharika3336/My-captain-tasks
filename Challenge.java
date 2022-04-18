import java.util.*;
public class Challenge 
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Please insert any number");
		int n=sc.nextInt();
		int flag=1;
		for(int i=2;i<n;i++){
		    if(n%i==0){
		        flag=0;
		    }
		}
		if (flag==1)
		{
		    System.out.println(n+" is prime number\n");
		}
		else{
		    System.out.println(n+"is not prime number\n");
		}
	}
}
