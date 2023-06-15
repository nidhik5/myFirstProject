import java.util.Scanner;

public class commonInThreeArrays {
    static int n1,n2,n3;
    static int a[];
    static int b[];
    static int c[];
    public commonInThreeArrays(int m1,int m2, int m3)
    {
        n1=m1;
        n2=m2;
        n3=m3;
        a=new int[n1];
        b=new int[n2];
        c=new int [n3];
    }

    public static void read(int n,int []d)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            d[i]=sc.nextInt();
        }
    }

    public static void common()
    {
        int i=0,j=0,k=0;
        int prev1=Integer.MIN_VALUE;
        int prev2=Integer.MIN_VALUE;
        int prev3=Integer.MIN_VALUE;

        while(i<n1 && j<n2 && k<n3)
        {
            while(i<n1 && a[i]==prev1)
            {
                i++;
            }

            while(j<n2 && b[j]==prev2)
            {
                j++;
            }

            while(k<n3 && c[k]==prev3)
            {
                k++;
            }

            if(i<n1 && j<n2 && k<n3 )
            {
                if(a[i]==b[j] && b[j]==c[k])
                {
                    System.out.println(a[i]);
                    prev1=a[i];
                    prev2=b[j];
                    prev3=c[k];
                    i++;
                    j++;
                    k++;
                }
                else if(a[i]<b[j])
                {
                    prev1=a[i];
                    i++;
                }
                else if(b[j]<c[k])
                {
                    prev2=b[j];
                    j++;
                }
                else
                {
                    prev3=c[k];
                    k++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array1 size");
        n1=sc.nextInt();
        System.out.println("Enter array2 size");
        n2=sc.nextInt();
        System.out.println("Enter array3 size");
        n3=sc.nextInt();

        commonInThreeArrays cita=new commonInThreeArrays(n1,n2,n3);
        read(n1,a);
        read(n2,b);
        read(n3,c);
        common();
    }

}
