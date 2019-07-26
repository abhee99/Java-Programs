import java.util.*;
public class selectionsort
{
	static void selection_sort (int A[ ], int n) 
	{
		int minimum;        
		for(int i = 0; i < n-1 ; i++)  
		{
			minimum = i ;
			for(int j = i+1; j < n ; j++ ) 
			{
                if(A[ j ] < A[ minimum ])  
				{               
					minimum = j ;
                }
             }
         
		 int temp=A[i];
		 A[i]=A[minimum];
		 A[minimum]=temp;
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
		selection_sort(A,n);
		for(int i=0;i<n;i++)
		{
		    System.out.print(A[i]+" ");
		}
	}
}