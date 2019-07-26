import java.util.*;
public class mergesort
{
    static void sort(int a[],int l,int r)
    {
        if(l<r)
        {
            int mid=l+(r-l)/2;
            sort(a,l,mid);
            sort(a,mid+1,r);
            merge(a,l,mid,r);
        }
        
    }
    static void merge(int a[],int l,int m,int r)
    {
        int n=m-l+1,n1=r-m;
        int left[]=new int[n];
        int right[]=new int[n1];
        
        for(int i=0;i<n;i++)
            left[i]=a[l+i];
        
        for(int i=0;i<n1;i++)
            right[i]=a[m+1+i];
         
        int i=0,j=0,k=l;
        
        while(i<n&&j<n1)
        {
            if(left[i]<=right[j])
            a[k++]=left[i++];
            else
            a[k++]=right[j++];
        }
        
        while(i<n)
            a[k++]=left[i++];
        
        while(j<n1)
            a[k++]=right[j++];
            
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        sort(a,0,n-1);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}
