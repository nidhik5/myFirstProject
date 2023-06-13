import java.util.*;
import java.lang.*;

import static java.lang.Math.max;

public class maxSumOfSubarray {
static int n ;
static int a[];
public maxSumOfSubarray(int n1)
{
    n=n1;
    a=new int [n];
}

public static void read()
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter elements");
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
}

public static void max_sum()
{
    int sum=0,maxi=a[0];
    for(int i=0; i<n;i++)
    {
        sum=sum+a[i];
        maxi=max(maxi,sum);
        if(sum<0)
            sum=0;
    }
    System.out.println("Sum is "+sum);
}

    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        n=sc.nextInt();
        maxSumOfSubarray msos= new maxSumOfSubarray(n);
        msos.read();
        msos.max_sum();
    }
}
