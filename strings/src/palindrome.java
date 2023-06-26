import java.util.Scanner;

public class palindrome {
    public static void main(String []args)
    {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        char a[]=s.toCharArray();
        int l=a.length;
        for(int i=0;i<=l/2;i++)
        {
            if(a[i]!=a[l-1-i])
                flag=1;
                break;
        }
        if(flag==1)
            System.out.println("not palindrome");
        else
            System.out.println("is palindrome");
    }
}
