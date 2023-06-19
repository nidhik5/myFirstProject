import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import static java.lang.Math.max;

public class longestConsecutiveSequence {
    static int n;
    static int a[];
    public longestConsecutiveSequence(int n1)
    {
        int n=n1;
        a=new int [n];
    }

    public static void read()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    public static int longest()
    {
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<n;i++) {
            hs.add(a[i]);
        }

        int longest_streak=0;
        int current_streak;
        int num;
        for(int h:hs)
        {
            if(!hs.contains(h-1))
            {
                current_streak=1;
                num=h;
                while(hs.contains(num+1))
                {
                    current_streak+=1;
                    num+=1;
                }
                longest_streak=max(longest_streak,current_streak);
            }
        }
        return longest_streak;
    }
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n= sc.nextInt();
        longestConsecutiveSequence lcs= new longestConsecutiveSequence(n);
        read();
        System.out.println(longest());
    }

}
