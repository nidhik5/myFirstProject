import java.util.HashMap;
import java.util.Scanner;

public class subsetArray {
    static int n,m;
    static int a[],b[];
    public subsetArray(int n1, int m1)
    {
        int n=n1;
        a=new int [n];
        int m=m1;
        b=new int [m];
    }

    public static void read(int[] c, int k)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i=0;i<k;i++)
        {
            c[i]=sc.nextInt();
        }
    }

    public static boolean compareBoth()
    {
        HashMap<Integer, Integer> hs= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hs.put(a[i],hs.getOrDefault(a[i],0));
        }
        for(int i=0;i<m;i++)
        {
            if(hs.getOrDefault(b[i],0)>0)
            {
                hs.put(b[i],hs.getOrDefault(hs.get(b[i])-1,0));
            }
            else
                return false;
        }
        return true;

    }

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n= sc.nextInt();
        System.out.println("Enter size of subset");
        m= sc.nextInt();
        subsetArray sa= new subsetArray(n,m);
        read(a,n);
        read(b,m);
        System.out.println(compareBoth());

    }
}
