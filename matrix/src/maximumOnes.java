import java.util.Scanner;

public class maximumOnes {
    static int r,c,x;
    static int [][]a;
    public maximumOnes(int r1, int c1)
    {
        r=r1;
        c=c1;
        a=new int[r][c];
    }

    public static void read()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements of matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }

    public static int countOnes()
    {
        int row=0;
        int cols=c-1;
        for(int i=0;i<r;i++)
        {
            for(int j=cols;j>=0;j--)
            {
                if(a[i][j]==1)
                {
                    row=i;
                    cols--;
                }
                else
                    break;
            }
        }
        return row;
    }

    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows");
        r=sc.nextInt();
        System.out.println("Enter columns");
        c=sc.nextInt();
        maximumOnes mo= new maximumOnes(r,c);
        read();
        System.out.println(countOnes());
    }

}
