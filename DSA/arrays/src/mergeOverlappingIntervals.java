import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.Math.max;

public class mergeOverlappingIntervals {
    static int n;
    static int start,end;
    static class Interval
    {
        int start;
        int end;
        Interval(int start, int end)
        {
            this.start=start;
            this.end=end;
        }

    }

    public static void overlap(Interval a[])
    {
        Arrays.sort(a, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start-i2.start;
            }
        });
        int index=0;
        for(int i=1;i<n;i++)
        {
            if(a[index].end>=a[i].start)
            {
                a[index].end=max(a[index].end,a[i].end);
            }
            else
            {
                index++;
                a[index]=a[i];
            }
        }
        System.out.println("Merged intervals are");
        for (int i = 0; i <=index; i++) {
            System.out.println(a[i].start + " " + a[i].end);
        }
    }

    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        n=sc.nextInt();
        Interval [] interval=new mergeOverlappingIntervals.Interval [n];
        for(int i=0;i<n;i++)
        {
            start=sc.nextInt();
            end=sc.nextInt();
            interval[i] = new mergeOverlappingIntervals.Interval(start, end);
        }
       overlap(interval);


    }

}
