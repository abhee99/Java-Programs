import java.util.*;
public class bubblesort
{

	static void bubble_sort( int A[ ], int n ) 
	{
		int temp;
		for(int k=0;k<n-1;k++) 
		{
			for(int i=0;i<n-k-1;i++) 
			{
				if(A[i]>A[i+1]) 
				{
					temp=A[ i ];
					A[i]=A[i+1];
					A[i+1]=temp;
				}	
			}
		}
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		bubble_sort(A,n);
		for(int i=0;i<n;i++)
		{
		    System.out.print(A[i]+" ");
		}
	}
}