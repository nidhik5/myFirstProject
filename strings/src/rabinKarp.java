import java.util.Scanner;

public class rabinKarp {

    public static void rk(String txt, String pat)
    {
        int j=0;
        //char txt[]=text.toCharArray();
        //char pat[]=pattern.toCharArray();
        int m=txt.length();
        int n=pat.length();
        int q=13;
        int d=10;
        int h=1;
        int t=0;
        int p=0,i;

        for(i=0;i<n-1;i++)
            h=(h*d)%q ;

        for(i=0;i<n;i++)
        {
            t=(d*t+txt.charAt(i))%q;
            p=(d*p+pat.charAt(i))%q;
        }
        //System.out.println(h+" "+t+" "+p);

        for(i=0;i<=m-n;i++)
        {
            //System.out.println(p+" "+t);
            if(t==p) {
                //System.out.println("p==t");
                for (j = 0; j < n; j++) {
                    if (pat.charAt(j) != txt.charAt(i + j)) {
                        //System.out.println(j + " " + (i + j));
                        break;
                    }
                }
                //System.out.println(i);
                if (j == n)
                    System.out.println("pattern found at" + " " + (i+1));
            }
            if(i<m-n)
            {
                t=(d*(t-txt.charAt(i)*h)+txt.charAt(i+n))%q;
                if(t<0)
                    t=t+q;
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
        rk(text,pattern);
    }
}
