import java.util.*;

public class unionIntersection {
    static int n,m,a[],b[];
    public unionIntersection(int n1,int m1)
    {
        n=n1;
        m=m1;
        a=new int[n];
        b=new int[m];
    }

    public static void read(int n, int []a)    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }

    }

    public static void printUnion(int []a,int [] b)
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            hs.add(a[i]);
        }
        for(int j=0;j<b.length;j++)
        {
            hs.add(b[j]);
        }

        System.out.println("Union is"+hs);
    }

    public static void printIntersection(int []a, int []b)
    {
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs1=new HashSet<>();

        for(int i=0;i<a.length;i++)
        {
            hs.add(a[i]);
        }
        System.out.print("Intersection is"+" ");
        for(int j=0;j<b.length;j++)
        {
            if(hs.contains(b[j]))
                hs1.add(b[j]);;
        }
        System.out.println(hs1);
    }

    public static void main (String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size of array a");
        n=sc.nextInt();
        System.out.println("Enter size of array b");
        m=sc.nextInt();
        unionIntersection x= new unionIntersection(n,m);
        read(n,a);
        read(m,b);
        printUnion(a,b);
        printIntersection(a,b);
    }
}
