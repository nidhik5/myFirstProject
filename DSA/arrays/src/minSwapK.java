import java.util.Scanner;

public class minSwapK {
    static int n,k;
    static int a[];
    public minSwapK(int n1)
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

    public static void counter()
    {
        int bad=0, count=0,ans;
        for(int i=0;i<n;i++) {
            if (a[i] <= k)
                count++;
        }

        for(int i=0;i<count;i++)
        {
            if(a[i]>k)
                bad++;
        }

        ans=bad;

        for(int i=0,j=count;j<n;i++,j++)
        {
            if(a[i]>k)
                bad--;
            if(a[j]>k)
                bad++;

            ans=Math.min(ans,bad);
        }
        System.out.println(ans);
    }

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n= sc.nextInt();
        System.out.println("Enter sum");
        k= sc.nextInt();
        minSwapK msk= new minSwapK(n);
        read();
        counter();
    }

}
