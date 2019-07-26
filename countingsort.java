import java.util.*;
public class countingsort
{   
    static void counting_sort(int A[], int n) 
    {
        int k =-2147483647;
        for(int i=0; i<n; i++) 
        {
            if(A[i]>k)
            k=A[i];
        }
        int freq[]=new int[n+1];
        Arrays.fill(freq,0);
        for(int i=0; i<n; i++) 
        {
            freq[A[i]]++;
        }
        int j = 0;
        for(int i=0;i<=k;i++) 
        {
            int temp = freq[i];
            while(temp--!=0) 
            {
                A[j] = i;
                j++;
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
		counting_sort(A,n);
		for(int i=0;i<n;i++)
		{
		    System.out.print(A[i]+" ");
		}
	}
}
    