import java.util.Scanner;

public class Quickselect {
    static int n,l,r;
    static int a[];
    public Quickselect(int n1)
    {
        n=n1;
        a=new int [n];
    }

    public static void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    public static int partition (int []a, int l, int r)
    {
        int x=a[r],temp;
        int i=l-1;
        for(int j=l;j<r;j++)
        {
            if(a[j]<x)
            {
                i++;
                temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        temp=a[i];
        a[i]=a[r];
        a[r]=temp;
        return i+1;
    }

    public static int kthsmallest(int []a, int l, int r, int k)
    {
        int pos=partition (a, l, r);
        if(pos-l==k-1)
            return a[pos];

        if (pos-l>k-1)
            return kthsmallest(a, l, pos-l, k);
        else
            return kthsmallest(a, pos+1, r, k-pos+l-1);
    }
}
