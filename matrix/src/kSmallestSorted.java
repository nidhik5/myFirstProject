import java.util.Scanner;

public class kSmallestSorted {
    static int n,k;
    static int [][]a;
    public kSmallestSorted(int n1)
    {
        n=n1;
        a=new int[n][n];
    }

    public static void read()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements of matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }

    public static int countK (int [][]a, int mid)
    {int count=0;

        for(int i=0;i<n;i++)
        {
            int start=0;
            int end=n-1;
            while(start<=end)
            {
                int mids=start+(end-start)/2;
                if(a[i][mids]<=mid)
                {
                    start=mids+1;
                }
                else
                    end=mids-1;
            }
            count+=start;
        }
        return count;
    }

    public static int smallest()
    {
        int start=a[0][0];
        int end=a[n-1][n-1];
        while(start<=end)
        {
            int assumed_median=start+(end-start)/2;
            int ck=countK(a,assumed_median);
            if(ck<k)
                start=assumed_median+1;
            else
                end=assumed_median-1;
        }
        return start;
    }

    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows & cols");
        n=sc.nextInt();
        System.out.println("Enter k");
        k=sc.nextInt();
        kSmallestSorted kss= new kSmallestSorted(n);
        read();
        System.out.println(smallest());
    }
}
