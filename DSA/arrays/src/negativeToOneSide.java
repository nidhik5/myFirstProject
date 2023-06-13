import java.util.*;
public class negativeToOneSide {
    static int n ;
    static int a[];
    public negativeToOneSide(int n1){
        n=n1;
        a=new int [n];
    }

    public static void read_array(int n)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    public static void sort(int n)
    {
        int j=0,temp;
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }

        }
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
        negativeToOneSide ntos= new negativeToOneSide(n);
        ntos.read_array(n);
        ntos.sort(n);
        ntos.display();

    }
}
