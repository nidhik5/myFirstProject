import java.util.HashSet;
import java.util.Scanner;

import static java.lang.Math.abs;

public class duplicatesInArray {
    static int n;
    static int a[];
    public duplicatesInArray(int n1)
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

    public static HashSet<Integer> duplicates()
    {
        int index, count=0, value;
        HashSet<Integer> ans=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            a[i]=a[i]+1;
        }

        for(int i=0;i<n;i++)
        {
            if(abs(a[i])<n)
                index=abs(a[i]);
            else
                index=abs(a[i])/(n+1);

            //index=a[i];
            if(index==n)
            {
                count++;
                continue;
            }
            value=a[index];
            if(value<0)
            {
                ans.add(index-1);
                a[index]=abs(a[index])*(n+1);
            }
            else if(value>n)
                continue;
            else
                a[index]=-a[index];
        }
        if(count>1)
            ans.add(n-1);

        if(ans.size()==0)
            ans.add(-1);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        n=sc.nextInt();
        duplicatesInArray dia=new duplicatesInArray(n);
        read();
        System.out.println(duplicates());
    }
}

