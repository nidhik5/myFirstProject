import java.util.Stack;

public class balancedParenthesis {
    static Stack<Character> s=new Stack<>();
    public static boolean balance(String str)
    {
        char a[]=str.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            //System.out.println(a[i]);
            if(a[i]=='(' || a[i]=='[')
            {
                s.push(a[i]);
                //System.out.println(s);
            }
            else {
                if(s.empty())
                    return false;
                char ch=a[i];
                char spop=s.pop();
                if((ch==')' && spop=='(') || (ch==']' && spop=='[')) continue;
                else
                    return false;
            }
        }
        System.out.println(s);
        return (s.empty());
    }
    public static void main (String[] args) {

        String str="[ ( )";
        if(balance(str)==true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
