import java.util.Scanner;

public class medianMatrix {
    static int r,c,x;
    static int [][]a;
    public medianMatrix(int r1, int c1)
    {
        r=r1;
        c=c1;
        a=new int[r][c];
    }

    public static void read()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements of matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }

    public static int findSmallerElements(int [][]a, int x)
    {
        int count=0;
        for(int i=0;i<r;i++)
        {
            int start=0;
            int end=c-1;
            while (start <= end) {
                int mids=start+(end-start)/2;
                if(a[i][mids]<=x)
                    start=mids+1;
                else
                    end=mids-1;
            }
            count=count+start;
        }
        return count;
    }


    public static int calc_median()
    {
        int start=1;
        int end=500;
        int n=(r*c);
        int median=n/2;

        while(start<=end)
        {
            int assumed_median=start+(end-start)/2;
            int k=findSmallerElements(a,assumed_median);
            if(k<=median)
            {
                start=assumed_median+1;
            }
            else
                end=assumed_median-1;
        }
        return start;
    }

    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows");
        r=sc.nextInt();
        System.out.println("Enter columns");
        c=sc.nextInt();
       medianMatrix mm= new medianMatrix(r,c);
        read();
        System.out.println(calc_median());
    }
}
