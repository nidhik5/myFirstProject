import java.util.Scanner;

public class medianOfSortedArrays {
    static int m, n;
    static int a1[], a2[];

    public medianOfSortedArrays(int m1, int n1) {
        int n = n1;
        int m = m1;
        a1 = new int[m];
        a2 = new int[n];
    }

    public static void read(int[] c, int k) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        for (int i = 0; i < k; i++) {
            c[i] = sc.nextInt();
        }
    }

    public static int median(int a1[], int a2[]) {
        int medians = 0;

        if (a2.length < a1.length)
           median(a2, a1);

        int low = 0;
        int high = m;

        while (low <= high) {
            int cut1 = low+((high - low) / 2);
            int cut2 = ((m + n + 1) / 2) - cut1;

            int left1 = cut1 == 0 ? Integer.MIN_VALUE : a1[cut1 - 1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : a2[cut2 - 1];

            int right1 = cut1 == m ? Integer.MAX_VALUE : a1[cut1];
            int right2 = cut2 == n ? Integer.MAX_VALUE : a2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                if ((m + n) % 2 == 0) {
                    medians = (Math.max(left1, left2) + Math.min(right1, right2)) / 2;
                }
                else {
                    medians = Math.max(left1, left2);
                }
                return medians;
            }
            else if (left1 > right2)
                high = cut1 - 1;
            else
                low = cut1 + 1;

        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        m = sc.nextInt();
        System.out.println("Enter size");
        n = sc.nextInt();
        medianOfSortedArrays mosa = new medianOfSortedArrays(m, n);
        read(a1, m);
        read(a2, n);
        System.out.println(median(a1,a2));
    }
}

