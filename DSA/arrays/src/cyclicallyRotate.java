import java.util.Scanner;

public class cyclicallyRotate {
    static int n;
    static int a[];
    public cyclicallyRotate(int n1){
        n=n1;
        a= new int [n];
    }

    public static void read(int n)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    public static void rotate()
    {
        int temp=a[n-1];
        for(int i=n-1;i>0;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=temp;

    }

    public static void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        n=sc.nextInt();
        cyclicallyRotate cr= new cyclicallyRotate(n);
        cr.read(n);
        cr.rotate();

        System.out.println("Enter number of times to rotate");
        int k=sc.nextInt();
        for(int i=1;i<k;i++)
        {
            cr.rotate();
        }
        cr.display();
    }
}
