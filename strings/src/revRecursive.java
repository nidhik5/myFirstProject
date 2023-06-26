import java.util.Scanner;

public class revRecursive {
    public static void swap(char a[],int i,int j)
    {
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void reverse(char a[],int i)
    {
        int n=a.length;
        if (i==n/2)
            return ;
        swap(a,i,n-i-1);
        reverse(a,i+1);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        char a[]=s.toCharArray();
        reverse(a,0);
        System.out.println(a);
    }
}
