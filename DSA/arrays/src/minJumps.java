import java.util.Scanner;

import static java.lang.Math.max;


public class minJumps {
    static int n;
    static int a[];
    public minJumps(int n1)
    {
        n=n1;
        a= new int [n];
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
    public static int jump()
    {
        if(n<=1)
            return 0;
        if(a[0]>=n-1)
            return 1;
        if(a[0]==0)
            return -1;
        int maxReach=a[0];
        int step=a[0];
        int jump=1;
        for(int i=1;i<n;i++)
        {
           if(i==n-1)
               return jump;
           if(a[i]>=n-1)
               return jump+1;
           maxReach= max(maxReach,a[i]+i);
           step--;
           if(step==0)
           {
               jump++;
               if(maxReach<=i)
                   return -1;

               step=maxReach-i;
           }
        }
        return -1;
    }

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n= sc.nextInt();
        minJumps mj= new minJumps(n);
        read();
        int result=jump();
        System.out.println(result);
    }
}
