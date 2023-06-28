import java.util.Scanner;

public class countAndSay {
    public static String say(int n)
    {
        String res="";
        int count=0;
        if(n==1)
            return "1";
        String s=say(n-1);

        for(int i=0;i<s.length();i++)
        {
            count++;
            if (i==s.length()-1 || s.charAt(i)!=s.charAt(i+1))
            {
                res=res+count+s.charAt(i);
                count=0;
            }
        }
        return res;
    }
    public static void main (String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println(say(n));
    }
}
