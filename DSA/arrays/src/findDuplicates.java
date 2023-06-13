import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class findDuplicates {
    static int n;
    static int a[];
    public findDuplicates(int n1)
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

    public static ArrayList<Integer> find()
    {
        ArrayList <Integer> res= new ArrayList<>();
        int count=0,index,value;
        for(int i=0;i<n;i++)
        {
            a[i]=a[i]+1;
        }
        for(int i=0;i<n;i++)
        {
            if (Math.abs(a[i])<n)
               index=Math.abs(a[i]);
            else
                index=Math.abs(a[i])/(n+1);
            if(index==n)
            {
                count++;
                continue;
            }
            value=a[index];

            if (value<0)
            {
                res.add(index-1);
                a[index]=Math.abs(a[index])*(n+1);
            }
            else if (value>n)
                continue;
            else
                a[index]=-a[index];
        }
        if(count>1)
            res.add(n-1);
        else if (res.size()==0)
            res.add(-1);
        else
            Collections.sort(res);

        return res;
    }

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n= sc.nextInt();
        findDuplicates fd= new findDuplicates(n);
        read();
        ArrayList <Integer> result=find();
        System.out.println(result);
    }

}
