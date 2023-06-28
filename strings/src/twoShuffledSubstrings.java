import java.util.*;
public class twoShuffledSubstrings {

    public static boolean comp(String s1, String s2, String s3)
    {
        char a1[]=s1.toCharArray();
        char a2[]=s2.toCharArray();
        char a3[]=s3.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);
        Arrays.sort(a3);

        if(a1.length+a2.length!=a3.length)
            return false;
        int j=0;
        int i=0;
        for(int k=0;k<a3.length;k++)
        {
            if(i<a1.length && a1[i]==a3[k])
                i++;
            else if(j<a2.length && a2[j]==a3[k])
                j++;
            else
                return false;
        }
        return true;
    }
    public static void main (String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1=sc.nextLine();
        System.out.println("Enter string 2");
        String s2=sc.nextLine();
        System.out.println("Enter string 3");
        String s3=sc.nextLine();
        System.out.println(comp(s1,s2,s3));
    }
}
