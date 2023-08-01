import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Vector;

public class SlidingWindowMax{
    public static void input(int []a,int n)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    public static void display(int []a)
    {
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
    public static void window (int []a,int n,int k)
    {
        int r[]=new int[n-k+1];
        int ri=0;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            if(dq.isEmpty()==false && dq.peek()==i-k) // for out of window
            {
                dq.poll();
            }
            while(dq.isEmpty()==false && a[dq.peekLast()]<=a[i])
            {
                dq.pollLast();
            }
            dq.offer(i);
            if(i>=k-1)
                r[ri++]=a[dq.peek()];

        }
       display(r);
    }
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter k");
        int k=sc.nextInt();
        System.out.println("Enter size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array");
        input(a,n);
        window(a,n,k);
    }
}
