import java.util.HashMap;
import java.util.Scanner;

public class subarraySumZero {
    static int n;
    static int a[];
    public subarraySumZero(int n1)
    {
        n=n1;
        a=new int [n];
    }

    public static void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    public static void exists()
    {
        int sum=0,start;
        HashMap<Integer,Integer> hs= new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++)
        {
            sum+=a[i];

            if(a[i]==0 || sum==0 || hs.containsKey(sum) )
            {
                start=hs.get(sum);
                for(int j=start+1; j<=i ; j++)
                {
                    System.out.println(a[j]);
                }
                //return true;
            }

            hs.put(sum,i);

        }
        //return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        n=sc.nextInt();
        subarraySumZero ssz=new subarraySumZero(n);
        read();
        exists();
    }
}
