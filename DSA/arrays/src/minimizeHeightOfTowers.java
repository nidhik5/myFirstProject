import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class minimizeHeightOfTowers {
    static int n;
    static int a[];
    static int k;
    public minimizeHeightOfTowers(int n1, int k1)
    {
        k=k1;
        n=n1;
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
    public static int minimize()
    {
        Arrays.sort(a);
        int ans=a[n-1]-a[0];
        int tempmin, tempmax;
        tempmin=a[0];
        tempmax=a[n-1];
        for(int i=1; i<n;i++)
        {
            if(a[i]-k<0)
                continue;
            tempmin=min(a[0]+k, a[i]-k);
            tempmax=max(a[i-1]+k, a[n-1]-k);
            ans=min(ans,tempmax-tempmin);
        }
        return ans;
    }

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n= sc.nextInt();
        System.out.println("Enter k");
        k=sc.nextInt();
        minimizeHeightOfTowers mnhot= new minimizeHeightOfTowers(n,k);
        read();
        int result=minimize();
        System.out.println(result);
    }
}


