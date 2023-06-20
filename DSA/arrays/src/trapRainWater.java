import java.util.Scanner;

public class trapRainWater {
    static int n,sum;
    static int a[];
    public trapRainWater(int n1)
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

    public static void rain()
    {
        int sum=0;
        int [] left= new int [n];
        int [] right= new int[n];
        left[0]=a[0];
        right[n-1]=a[n-1];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(a[i],left[i-1]);
        }
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(a[i],right[i+1]);
        }

        for(int i=0;i<n;i++)
        {
            sum+=Math.min(left[i],right[i])-a[i];
        }

        System.out.println(sum);
    }
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n= sc.nextInt();
        trapRainWater trw= new trapRainWater(n);
        read();
        rain();
    }
}
