import java.util.Scanner;

public class longestCommonPrefix {

    public static String prefixutil(String prefix, String s)
    {
        String result="";
        for(int i=0,j=0;i<prefix.length() && j<s.length();i++,j++)
        {
            if(prefix.charAt(i)==s.charAt(j))
                result+=prefix.charAt(i);
            else
                break;
        }
        return result;
    }

    public static String lcp(String [] a)
    {
        String prefix=a[0];
        for(int i=1;i<a.length;i++)
        {
            prefix=prefixutil(prefix,a[i]);
        }
        return prefix;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        sc.nextLine();
        String a[]=new String[n];
        System.out.println("Enter strings");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLine();
        }
        String ans=lcp(a);
        System.out.println(ans);
    }

}
