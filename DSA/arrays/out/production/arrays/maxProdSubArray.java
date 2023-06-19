import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.max;

public class maxProdSubArray {
    static int n;
    static int a[];
    public maxProdSubArray(int n1)
    {
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

    public static void maxProd()
    {
        int prefix=1;
        int suffix=1;
        int ans= Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(prefix==0)
                prefix=1;
            if(suffix==0)
                suffix=1;
            prefix=prefix*a[i];
            suffix=suffix*a[n-i-1];

            ans=max(ans,max(prefix,suffix));
        }

        System.out.println("Product is"+" "+ans);
    }

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n= sc.nextInt();
        maxProdSubArray mpsa= new maxProdSubArray(n);
        read();
        maxProd();
    }
}
