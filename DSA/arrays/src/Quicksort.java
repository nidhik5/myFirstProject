import java.util.*;
public class Quicksort {
    static int partition (int []a,int p, int r)
    {
        int temp;
        int x=a[r];
        int i=p-1;
        for(int j=p;j<r;j++)
        {
            if(a[j]<x)
            {
                i++;
                temp=a[j];
                a[j]=a[i];
                a[i]=temp;

            }
        }
        temp=a[i+1];
        a[i+1]=a[r];
        a[r]=temp;
        return (i+1);
    }

    static void quick(int [] a, int p, int r)
    {
        int q;
        if(p<r)
        {
            q=partition(a,p,r);
            quick(a,p,q-1);
            quick(a,q+1,r);

        }
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int [] a=new int [n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        quick(a,0,n-1);

        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
