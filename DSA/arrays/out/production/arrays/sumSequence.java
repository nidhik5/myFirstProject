import java.util.HashSet;
import java.util.Scanner;

public class sumSequence {
    static int n,sum;
    static int a[];
    public sumSequence(int n1)
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
    public static boolean sequence()
    {

        for(int i=0;i<n-2;i++)
        {
            int cs=sum-a[i];
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                if(hs.contains(cs-a[j]))
                {
                    System.out.println(a[i]+" "+a[j]+" "+(cs-a[j]));
                }
                hs.add(a[j]);
            }
        }
        return false;
    }

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n= sc.nextInt();
        System.out.println("Enter sum");
        sum= sc.nextInt();
        sumSequence ss= new sumSequence(n);
        read();
        sequence();
    }
}
