import java.util.Scanner;

public class numericKeypad {

    public static void keypad(String s, String [] str)
    {
        int j=0;
        String output="";
        for(int i=0;i<s.length();i++)
        {
            j=s.charAt(i)-'a';
            //System.out.println(j);
            output=output+str[j];
        }
        System.out.println(output);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // storing the sequence in array
        String str[]= { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };
        System.out.println("Enter string");
        String s=sc.nextLine();
        keypad(s,str);
    }
}

