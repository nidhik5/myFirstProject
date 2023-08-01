import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void input(int []a,int n)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    public static int area(int []a,int n)
    {
        int maxArea=Integer.MIN_VALUE;
        int []left=new int[n];
        int []right=new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++)
        {
           while(st.isEmpty()==false && a[st.peek()]>a[i])
           {
               st.pop();
           }

           if(st.isEmpty())
               left[i]=0;
           else
            left[i]=st.peek()+1;

           st.push(i);
        }
        while(st.isEmpty()==false)
            st.pop();
        for(int i=n-1;i>=0;i--)
        {
            while(st.isEmpty()==false && a[st.peek()]>a[i])
            {
                st.pop();
            }

            if(st.isEmpty())
                right[i]=n-1;
            else
                right[i]=st.peek()-1;

            st.push(i);
        }

        for(int i=0;i<n;i++)
        {
            maxArea=Math.max(maxArea,(right[i]-left[i]+1)*a[i]);
        }
        return maxArea;
    }
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter heights");
        input(a,n);
        int ans=area(a,n);
        System.out.println(ans);
    }
}
