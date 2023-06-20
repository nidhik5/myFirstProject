import java.util.Scanner;

import static java.lang.Math.max;

public class JumpSteps {
    static int n;
    static int a[];
    public JumpSteps(int n1)
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

    public static int jumps()
    {
        int maxReach=a[0];
        int step=a[0];
        int jump=1;

        if (a[0]==0)
            return -1;
        if(a[0]>=n)
            return jump;
        for(int i=1;i<n;i++)
        {
            if(a[i]==n)
              return jump;
            if(a[i]>=n-1-i)
                return jump+1;

            maxReach=max(a[i]+i,maxReach);
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        n=sc.nextInt();
        JumpSteps js=new JumpSteps(n);
        read();
        System.out.println(jumps());
    }

}
