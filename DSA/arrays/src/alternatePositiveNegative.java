import java.util.ArrayList;
import java.util.Scanner;

public class alternatePositiveNegative {
    static int n;
    static int a[];
    public alternatePositiveNegative(int n1)
    {
        n=n1;
        a=new int [n];
    }

    public static void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    public static void display(int []a)
    {
        System.out.println("Answer is");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void alternate()
    {
        ArrayList <Integer> positive = new ArrayList<>();
        ArrayList <Integer> negative = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
                negative.add(a[i]);
            else
                positive.add(a[i]);
        }

        if(positive.size()>negative.size())
        {
            for(int i=0;i<negative.size();i++)
            {
                a[i*2]=positive.get(i);
                a[i*2+1]= negative.get(i);
            }
            int index= negative.size()*2;
            for(int j=negative.size();j< positive.size();j++)
            {
                a[index]=positive.get(j);
                index++;
            }
        }

        else
        {
            for(int i=0;i<positive.size();i++)
            {
                a[i*2]=positive.get(i);
                a[i*2+1]= negative.get(i);
            }
            int index= positive.size()*2;
            for(int j= positive.size();j< negative.size();j++)
            {
                a[index]=negative.get(j);
                index++;
            }
        }

        display(a);
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        n=sc.nextInt();
        alternatePositiveNegative apn=new alternatePositiveNegative(n);
        read();
        alternate();
    }
}
