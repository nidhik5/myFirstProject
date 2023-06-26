import java.util.Scanner;

public class rotations {
    public static void main(String []args)
    {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1=sc.nextLine();
        System.out.println("Enter string 2");
        String s2=sc.nextLine();

           if(s1.length()!=s2.length())
           return;
        else {
               for (int i = 0; i < s1.length(); i++) {
                   if (s1.charAt(i) == s2.charAt(0)){
                       if ((s1.substring(i)).equals(s2.substring(0, s1.length() - i))) {
                           if ((s1.substring(0, i)).equals(s2.substring(s1.length() - i)))
                               flag = 1;
                       }
                   }
               }
           }
        if(flag==1)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
