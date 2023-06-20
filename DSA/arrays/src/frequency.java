import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequency {
    static int n,k;
    static int a[];
    public frequency(int n1)
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

    public static void answer()
    {
        int x=n/k;
        HashMap<Integer,Integer> hs= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!hs.containsKey(a[i]))
            {
                hs.put(a[i],1);
            }
            else
            {
                int count=hs.get(a[i]);
                hs.put(a[i],count+1);
            }
        }
        for(Map.Entry m: hs.entrySet() )
        {
            int temp=(Integer)m.getValue();
            if(temp>x)
                System.out.println(m.getKey());
        }
    }

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n= sc.nextInt();
        System.out.println("Enter size");
        k= sc.nextInt();
        frequency f= new frequency(n);
        read();
        answer();
    }
}
