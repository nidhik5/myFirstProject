import java.util.Scanner;

public class nextPermString {

    public static char[] permute(String s)
    {
        char temp;
        int i;
        char[]a=s.toCharArray();
        int n=a.length;
       // char temp;
        for( i=n-2;i>=0;i--)
        {
            if(a[i]<a[i+1])
                break;
        }
        System.out.println(a[i]);
        for(int j=n-1;j>=0;j--)
        {
            if(a[j]>a[i]) {
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                break;
            }
        }
        int start=i+1;
        int end=n-1;

        while(start<=end)
        {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }

        return a;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(permute(s));
    }
}
