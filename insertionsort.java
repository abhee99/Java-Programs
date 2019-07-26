import java.util.*;
public class insertionsort
{
    static void insertion_sort ( int A[ ] , int n) 
    {
         for( int i = 0 ;i < n ; i++ ) 
         {
            int temp = A[ i ];    
            int j=i;
            while(  j > 0  && temp < A[ j -1]) 
            {
                A[ j ] = A[ j-1];   
                j= j - 1;
    
            }
            A[ j ] = temp;       
         }  
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
            A[i]=sc.nextInt();
        insertion_sort(A,n);
        for(int i=0;i<n;i++)
            System.out.print(A[i]+" ");
        
    }
}
