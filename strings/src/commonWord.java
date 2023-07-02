import java.util.HashSet;
import java.util.Scanner;

public class commonWord {

    public static String Repeated(String s)
    {
        String []sa=s.split(" ");
        HashSet<String> hs= new HashSet<>();
        for(int i=0;i<sa.length;i++)
        {
            if(hs.contains(sa[i]))
            {
                return sa[i];
            }
            hs.add(sa[i]);
        }
        return "not found";
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        System.out.println(Repeated(s));
    }
}
