import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicates {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        char a[]=s.toCharArray();
        int l=a.length;
        HashMap<Character,Integer> hs= new HashMap<>();
        for(int i=0;i<l;i++)
        {
            hs.put(a[i],hs.getOrDefault(a[i],0)+1);
        }
        for(Map.Entry element : hs.entrySet())
        {
            char key=(char) element.getKey();
            int value=(int) element.getValue();

            if(value>1)
                System.out.println(key+" "+value);
        }

    }
}
