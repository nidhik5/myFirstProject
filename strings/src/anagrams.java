import java.util.*;

public class anagrams {

    public static void findAnagram(String []as) {
        HashMap<String, List<String>> h = new HashMap<>();

        for (String i : as) {
            char ch[] = i.toCharArray();
            Arrays.sort(ch);
            String s = String.valueOf(ch); //The sorted character array ['a','c','t'] is then converted back to a string using String.valueOf(ch), giving us the string "act".
            if (h.containsKey(s)) {
                h.get(s).add(i);
            } else {
                List<String> ls = new ArrayList<String>();
                ls.add(i);
                h.put(s, ls);
            }

        }
        for(List<String> list: h.values())
            System.out.println(list);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("Enter String");
        String [] as = new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            as[i]=sc.nextLine();
        }
        findAnagram(as);
    }
}
