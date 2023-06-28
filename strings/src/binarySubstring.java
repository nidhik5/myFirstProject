import java.util.ArrayList;
import java.util.Scanner;

public class binarySubstring {
    public static int substring01(String s)
    {
        char a[]=s.toCharArray();
        int cnt0=0,cnt1=0,cnt=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='0')
                cnt0++;
            else
                cnt1++;

            if(cnt0==cnt1)
                cnt++;
        }
        if (cnt0!=cnt1)
            return -1;

        return cnt;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(substring01(s));
    }
}
