import java.util.Scanner;

public class minSubarraySum {
    static int n,k;
    static int a[];
    public minSubarraySum(int n1)
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

    public static void minSum()
    {
        int start=0, end=0, curr_sum=0,min_len=n,start_index=0,end_index=0;
        while(end<n)
        {
            while(end<n && curr_sum<=k)
                curr_sum+=a[end++];

            while(curr_sum>k && start<n)
            {
                if(end-start<min_len) {
                    min_len = end - start;
                    start_index = start;
                    end_index = end;
                }

                curr_sum-=a[start++];
            }
        }
        for(int i=start_index;i<end_index;i++)
        {
            System.out.println(a[i]);
        }
        //return min_len;
    }

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n= sc.nextInt();
        System.out.println("Enter sum");
        k= sc.nextInt();
        minSubarraySum mss= new minSubarraySum(n);
        read();
        minSum();
    }
}
