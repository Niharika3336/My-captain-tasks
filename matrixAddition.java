/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int nr=sc.nextInt();
		System.out.println("Enter no of cols: ");
		int cr=sc.nextInt();
		int arr1[][]=new int[nr][cr];
		System.out.println("Enter data for 1st matrix : ");
		for(int i=0;i<nr;i++){
		    for (int j=0;j<cr;j++){
		        arr1[i][j]=sc.nextInt();
		    }
		}
		int arr2[][]=new int[nr][cr];
		System.out.println("Enter data for 2nd matrix : ");
		for(int i=0;i<nr;i++){
		    for (int j=0;j<cr;j++){
		        arr2[i][j]=sc.nextInt();
		    }
		}
		int sum[][]=new int[nr][cr];
		for(int i=0;i<nr;i++){
		    for (int j=0;j<cr;j++){
		        sum[i][j]=arr1[i][j]+arr2[i][j];
		    }
		}
		System.out.println("Result : ");
		for(int i=0;i<nr;i++){
		    for (int j=0;j<cr;j++){
		        System.out.print(sum[i][j]+" ");
		    }
		}
	}
}
