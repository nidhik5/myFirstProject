import java.util.Scanner;

public class binaryStringAlternate {

    public static char flip(char expected) // updates next i ka expected to 1 if 0 and vice versa so jab next time expected is compared to next i ka value se its compared
    {
        if(expected=='0')
            return '1';
        else
            return '0';
    }

    public static int alternateCount(String s, char expected)
    {
        int flipcount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=expected)
                flipcount++;

            expected=flip(expected); // contains konsa next hona chaiye as i has been incremented to next
        }
        return flipcount;
    }
    public static int minlen(String s)
    {
        return Math.min(alternateCount(s,'0'),alternateCount(s,'1'));
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        System.out.println(minlen(s));
    }
}
