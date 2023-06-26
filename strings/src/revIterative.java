import java.util.Scanner;

public class revIterative {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        char a[]=s.toCharArray();
         int l=a.length;
         for(int i=l-1;i>=0;i--)
             System.out.println(a[i]);
    }
}
