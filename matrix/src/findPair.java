import java.util.Scanner;

public class findPair {
    static int n,x;
    static int [][]a;
    public findPair(int n1)
    {
        n=n1;
        a=new int[n][n];
    }

    public static void read()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements of matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }

    public static int find()
    {
         int [][]compute=new int [n][n];
         compute[n-1][n-1]= a[n-1][n-1];
         for(int i=n-2; i>=0;i--)
         {
             compute[i][n-1]=Math.max(compute[i][n-1], a[i+1][n-1]);
             compute[n-1][i]=Math.max(compute[n-1][i],a[n-1][i+1]);
         }

         for(int i=n-2;i>=0;i--)
         {
             for(int j=n-2;j>=0;j--)
             {
                 compute[i][j]=Math.max(compute[i][j+1],Math.max(compute[i+1][j],compute[i+1][j+1]));
             }
         }
         int ans= Integer.MIN_VALUE;
         for(int i=n-2;i>=0;i--)
         {
             for(int j=n-2;j>=0;j--)
                 ans=Math.max(ans,compute[i+1][j+1]-a[i][j]);
         }

         return ans;
    }

    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows & cols");
        n=sc.nextInt();
        findPair fp= new findPair(n);
        read();
        System.out.println(find());
    }
}
//{{ 1, 2, -1, -4, -20 },
  //      { -8, -3, 4, 2, 1 },
    //    { 3, 8, 6, 1, 3 },
      //  { -4, -1, 1, 7, -6 },
        //{ 0, -4, 10, -5, 1 }};