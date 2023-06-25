import java.util.Scanner;
// only row wise sorted
// r=a.length
// c=a[0].length
public class searchLC {
        static int r,c,x;
        static int [][]a;
        public searchLC(int r1, int c1)
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
            int low=0;
            int high=(r*c)-1;

            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(x==a[mid/c][mid%c])
                    return true;

                else if(x>a[mid/c][mid%c])
                    low=mid+1;

                else
                    high=mid-1;
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
            searchLC sl= new searchLC(r,c);
            read();
            System.out.println(search());
        }
    }


