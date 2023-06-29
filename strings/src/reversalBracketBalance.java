import java.util.Scanner;
import java.util.Stack;

public class reversalBracketBalance {
    public static int reversal(String str)
    {
        int len=str.length();
        if(len%2!=0)
            return -1;

        Stack <Character> s=new Stack<>();
        for(int i=0; i<len;i++)
        {
            char ch=str.charAt(i);
            if(!s.empty() && ch=='}') // cuz stack ke last ntered element se u are comparing toh it would be a right pointer (draw stack n see)
            {
                if(s.peek()=='{')
                    s.pop();
                else
                    s.push(ch);
            }
            else
                s.push(ch);
        }
        int n=0;
        int len1=s.size();
        while(!s.empty() && s.peek()=='{')
        {
            s.pop();
            n++;
        }

        return (len1/2 + n%2); // if n ek extra left ho toh uko balance karne ek reverse karna padega leaving out the paired ones
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        System.out.println(reversal(str));
    }
}
