import java.util.Scanner;

public class boyerMoore {

    public static void badChar(String s,int m, int []a )
    {
        for(int i=0;i<m;i++)
            a[i]=-1;

        for(int i=0;i<m;i++)
        {
            a[(int)s.charAt(i)]=i;
        }
    }

    public static void bm(String t, String p)
    {
        int m=p.length();
        int n=t.length();
        int [] a=new int [256];
        badChar(p,m,a);

        int shift=0;
        while(shift<=(n-m))
        {
            int j=m-1;
            while (j>=0 && p.charAt(j)==t.charAt(shift+j))
                j--;

            if(j<0)
            {
                System.out.println("pattern occurs at"+" "+shift);
                if(shift<n-m)
                {
                    shift+=m-a[(int)t.charAt(shift+m)];
                }
                else
                    shift+=1;
            }
            else
            {
                shift+=Math.max(1,j-a[(int)t.charAt(j+shift)]);
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
        bm(text,pattern);
    }
}
