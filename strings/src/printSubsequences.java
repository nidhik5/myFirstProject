import java.util.ArrayList;
import java.util.Scanner;

public class printSubsequences {

    public static void print(int index, ArrayList <Character> l,char []a)
    {
        if(index>=a.length) {
            System.out.println(l);
            return;
        }
        l.add(a[index]);
        print(index+1,l,a);
        l.remove(l.size()-1);
        print(index+1,l,a);
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a[]=s.toCharArray();
        ArrayList <Character> l=new ArrayList<>();
        print(0,l,a);
    }
}
