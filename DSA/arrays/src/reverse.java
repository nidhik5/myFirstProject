import java.util.*;
public class reverse
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
    static void reverse(int start, int end, int n,int []a)
    {
        int temp;
        if(start>=end)
        {
            return;
        }
        temp=a[start];
        a[start]=a[end];
        a[end]=temp;
        reverse(start+1,end-1,n,a);
    }
   static void display_array(int n, int []a)
    {

        for(int i=0 ; i<n ; i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main (String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int [] a=new int [20];
        read_array(n,a);
        reverse(0,n-1,n,a);
        display_array(n,a);
    }
}
