import java.util.Scanner;
// row and column wise sorted array
public class searchGFG {
    static int r,c,x;
    static int [][]a;
    public searchGFG(int r1, int c1)
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

    public static boolean search()
    {
        int i=0;
        int j=c-1;

        while(i<=r-1 && j>=0)
        {
            if(x==a[i][j])
                return true;
            else if(x<a[i][j])
                j--;
            else if(x>a[i][j])
                i++;
        }
        return false;
    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows");
        r=sc.nextInt();
        System.out.println("Enter columns");
        c=sc.nextInt();
        System.out.println("Enter element to search");
        x=sc.nextInt();
        searchGFG sg= new searchGFG(r,c);
        read();
        System.out.println(search());
    }
}
