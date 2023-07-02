import java.util.HashSet;
import java.util.Scanner;

public class distinctWindow {

    public static void window(String s) {
        int count = 0, start = 0, startNext = 0, min_len = Integer.MAX_VALUE, curr_len = 0,startindex=0;
        int a[] = new int[256];
        HashSet<Character> h = new HashSet<>();

        for (int i = 0; i < s.length(); i++)
            h.add(s.charAt(i));

        int distinct = h.size();

        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)]++;
            if (a[s.charAt(i)] == 1)
                count++;

            if (count == distinct) {
                while (a[s.charAt(start)] > 1) {
                    if (a[s.charAt(start)] > 1) {
                        a[s.charAt(start)]--;
                        start++;
                    }
                    curr_len = i - start + 1;
                    if(curr_len<min_len)
                    {
                        min_len=curr_len;
                        startindex=start;
                    }
                }
            }
        }

        System.out.println(s.substring(startindex,startindex+min_len));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        window(s);
    }

}
