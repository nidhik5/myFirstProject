import java.util.Scanner;

public class threeWayPartitiooning {
    static int n,low,high;
    static int a[];
    public threeWayPartitiooning(int n1)
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

    public static void partitioning()
    {
        int start=0,end=n-1;
        int i=0,temp;
        while(i<=end)
        {
            if(a[i]<low)
            {
                temp=a[start];
                a[start]=a[i];
                a[i]=temp;
                start++;
                i++;
            }
            else if(a[i]>high)
            {
                temp=a[end];
                a[end]=a[i];
                a[i]=temp;
                end--;

            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<n;j++)
            System.out.println(a[j]);
    }

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n= sc.nextInt();
        System.out.println("Enter low value");
        low= sc.nextInt();
        System.out.println("Enter high value");
        high= sc.nextInt();
        threeWayPartitiooning twp= new threeWayPartitiooning(n);
        read();
       partitioning();
    }
}
// 1,  14, 5,  20, 4, 2, 54,
//20, 87, 98, 3,  1, 32