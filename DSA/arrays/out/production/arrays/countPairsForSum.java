import java.util.HashMap;
import java.util.Scanner;

public class countPairsForSum {
    static int n;
    static int a[];
    static int k;
    public countPairsForSum(int n1)
    {
        n=n1;
        a=new int [n];
    }

    public static void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    public static int countPair() {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(k - a[i])) {
                count += hm.get(k - a[i]);
                System.out.println(a[i]+" "+(k-a[i]));
            }

            if (hm.containsKey(a[i])) {
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], 1);
            }
        }
        return count;
    }

        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array");
            n = sc.nextInt();
            System.out.println("Enter sum required");
            k = sc.nextInt();

            countPairsForSum cpfs = new countPairsForSum(n);
            read();
            System.out.println(countPair());
        }
    }