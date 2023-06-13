import java.util.*;
public class minmax
{
    Scanner sc=new Scanner (System.in);
    static void read_array(int n, int []a)
    {
        Scanner sc=new Scanner (System.in);
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
    }

    static class Pair
    {
        int min ;
        int max;
    }
     static Pair Getminmax(int low, int high, int []a)
    {
        Pair minmax0= new Pair();
        Pair minmax1= new Pair();
        Pair minmax2= new Pair();
        int mid;

        if(low==high) //for one element
        {
            minmax0.min=a[low];
            minmax0.max=a[low];
            return minmax0;
        }

        else if (high==low+1) // for two elements
        {
            if(a[low]>a[high])
            {
                minmax0.min=a[high];
                minmax0.max=a[low];
                return minmax0;
            }
            else
            {
                minmax0.min=a[low];
                minmax0.max=a[high];
                return minmax0;
            }
        }

        mid=(low+high)/2;
        minmax1=Getminmax(low,mid,a);
        minmax2=Getminmax(mid+1,high,a);
        if(minmax1.min<minmax2.min)
        {
            minmax0.min=minmax1.min;
        }
        else
        {
            minmax0.min=minmax2.min;
        }

        if(minmax1.max<minmax2.max)
        {
            minmax0.max=minmax2.max;
        }
        else
        {
            minmax0.max=minmax1.max;
        }
        return minmax0;
    }

    public static void main (String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int [] a=new int [n];
        read_array(n,a);
        Pair minmax0 =Getminmax(0,n-1,a);
        System.out.printf("Minimum is %d, maximum is %d", minmax0.min, minmax0.max);
    }

}
