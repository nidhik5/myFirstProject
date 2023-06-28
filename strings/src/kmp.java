import java.util.Scanner;

public class kmp {
    static int [] lps;
    public static void lpss(int m,String p) // m is size of pattern
    {
        lps=new int [m];
        int len=0; // max len of common prefix
        lps[0]=0; // [0 1 2 0 1 2 3] aisa koi array return hoga
        int i=1;
        while(i<m)
        {
            if(p.charAt(i)==p.charAt(len)) // *
            {
                len++;
                lps[i]=len;
                i++;
            }
            else {
                if (len != 0)
                    len = lps[len - 1];
                else {
                    lps[i] = len;
                    i = i + 1;
                }
            }
        }
    }
    public static void kmps(String t, String p)
    {
        int m=p.length();
        int n=t.length();
        lpss(m,p);
        int i=0; // text
        int j=0; // pattern
        while(m-j<= n-i)
        {
            //System.out.print("entered while ");
            if(t.charAt(i)==p.charAt(j))
            {
                i++;
                j++;
            }
            //System.out.print(j+" ");
            if(j==m)
            {
                System.out.println("Pattern found at"+(i-j));
                j=lps[j-1];
            }
            else if(i<n && p.charAt(j)!=t.charAt(i)) // no match
            {
                if(j!=0)
                    j=lps[j-1];
                else
                    i=i+1;
            }
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text");
        String text=sc.nextLine();
        System.out.println("Enter pattern");
        String pattern=sc.nextLine();
        kmps(text,pattern);
    }
}
