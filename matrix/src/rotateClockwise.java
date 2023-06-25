import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class rotateClockwise {
    static int n;
    static int [][]a;
    public rotateClockwise(int n1)
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

    public static void disp(int [][]a)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] reverse2DArray(int[][] array) {
        ArrayList<int[]> list = new ArrayList<>();

        // Convert 2D array to list of arrays
        for (int[] row : array) {
            list.add(row);
        }

        // Reverse the list
        Collections.reverse(list);

        // Convert the reversed list back to a 2D array
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static void rotate()
    {
        reverse2DArray(a);
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        disp(a);
    }

    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows & cols");
        n=sc.nextInt();
        rotateClockwise rc= new rotateClockwise(n);
        read();
        rotate();
    }
}
