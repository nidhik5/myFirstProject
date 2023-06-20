import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Collections.max;


public class overlappingInterval {

    static int n,start,end;

    public static class Interval
    {
         int start;
        int end;
       public  Interval(int start, int end)
        {
            this.start=start;
            this.end=end;
        }
    }

    public static void overlap(Interval[] a) {
        Arrays.sort(a, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (a[index].end >=a[i].start) {

                a[index].end = Math.max(a[index].end, a[i].end);
            } else {
                index++;
                a[index] = a[i];
            }
        }

        for (int i = 0; i <= index; i++) {
            System.out.println(a[i].start + " " + a[i].end);
        }
    }

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        n=sc.nextInt();
        Interval [] interval=new overlappingInterval.Interval[n];
        for(int i=0;i<n;i++)
        {
            start = sc.nextInt();
             end=sc.nextInt();
            interval[i]=new overlappingInterval.Interval(start,end);
        }
        overlap(interval);
    }


}
