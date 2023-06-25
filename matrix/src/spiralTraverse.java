import java.util.ArrayList;
import java.util.Scanner;

public class spiralTraverse {
    static int r,c;
    static int [][]a;
    public spiralTraverse(int r1, int c1)
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

    public static void traverse()
    {
        ArrayList<Integer> ans =new ArrayList<>();
        int top=0;
        int left=0;
        int right=c-1;
        int bottom=r-1;

        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
                ans.add(a[top][i]);

            top++;

            for(int i=top;i<=bottom;i++)
                ans.add(a[i][right]);
            right--;

            if(top<=bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(a[bottom][i]);

                    bottom--;

            }

            if(left<=right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(a[i][left]);
                    left++;

            }
        }
        System.out.println(ans);
    }

    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows");
        r=sc.nextInt();
        System.out.println("Enter columns");
        c=sc.nextInt();
        spiralTraverse st= new spiralTraverse(r,c);
        read();
        traverse();
    }
}
