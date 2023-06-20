import java.util.Arrays;
import java.util.Scanner;

public class chocolateDistribution {
    static int n,m;
    static int a[];
    public chocolateDistribution(int n1)
    {
        int n=n1;
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

    public static int distribute()
    {
        if(n==0 || m==0)
            return 0;

        Arrays.sort(a);

        if(n<m)
            return -1;
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i<n-m+1; i++)
        {
            min_diff=Math.min(a[i+m-1]-a[i],min_diff);
        }
        return min_diff;
    }

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n= sc.nextInt();
        System.out.println("Enter children");
        m= sc.nextInt();
        chocolateDistribution cd= new chocolateDistribution(n);
        read();
        System.out.println(distribute());
    }
}
