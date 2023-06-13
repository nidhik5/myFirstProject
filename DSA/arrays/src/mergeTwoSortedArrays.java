import java.util.ArrayList;
import java.util.Scanner;

public class mergeTwoSortedArrays {
    static int m,n;
    static int a[],b[],c[];
    public mergeTwoSortedArrays(int m1, int n1)
    {
        m=m1;
        n=n1;
        a=new int [m];
        b=new int [n];
        c=new int[m+n];
    }

    public static void read(int n, int []a)
    {
        System.out.println("Enter elements");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    public static void merge(int m, int n, int []a, int []b, int []c)
    {
        int i=0,j=0,k=0;
        while(i<m && j<n)
        {
            if(a[i]<b[j])
            {
                c[k]=a[i];
                k++;
                i++;
            }
            else
            {
                c[k]=b[j];
                k++;
                j++;
            }
        }
        if(i>m-1)
        {
            while(j<n)
            {
                c[k++]=b[j++];
            }
        }
        else
        {
            while(i<m)
            {
                c[k++]=a[i++];
            }
        }

    }
    public static void display()
    {
        for(int z=0;z<m+n;z++)
        {
            System.out.println(c[z]);
        }
    }

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array 1");
        m= sc.nextInt();
        System.out.println("Enter size of array 2");
        n= sc.nextInt();
        mergeTwoSortedArrays mtsa= new mergeTwoSortedArrays(m,n);
        read(m,a);
        read(n,b);
        merge(m,n,a,b,c);
        display();
    }

}
