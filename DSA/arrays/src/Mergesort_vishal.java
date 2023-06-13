
import java.util.*;

public class Mergesort_vishal {
    static int n;
    static int a[];
    static int b[];

    public Mergesort_vishal(int ni) {
        n = ni;
        a = new int[n];
        b = new int[n];
    }

    public static void merge(int low, int mid, int high) {
        int h = low;
        int i = low;
        int j = mid + 1;

        while (h <= mid && j <= high) {
            if (a[h] <= a[j]) {
                b[i] = a[h];
                i++;
                h++;
            } else {
                b[i] = a[j];
                j++;
                i++;
            }
        }

        while (h <= mid) {
            b[i] = a[h];
            i++;
            h++;
        }

        while (j <= high) {
            b[i] = a[j];
            i++;
            j++;
        }

        for (int k = low; k <= high; k++) {
            a[k] = b[k];
        }
    }

    public static void mergesort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergesort(low, mid);
            mergesort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public static void inputarray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter elements of array");
        Mergesort_vishal mergeSort = new Mergesort_vishal(n);
        mergeSort.inputarray();
        mergeSort.mergesort(0, n - 1);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}