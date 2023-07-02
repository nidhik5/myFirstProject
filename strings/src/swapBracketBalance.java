import java.util.Scanner;
import java.util.Vector;

public class swapBracketBalance {
    public static void counts(String s)
    {
        int sum=0;
        char []a=s.toCharArray();
        Vector<Integer> position=new Vector<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='[')
                position.add(i);
        }

        int p=0;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='[')
            {
                count++;
                p++;
            }

            else if (a[i]==']')
                count--;

            if(count<0)
            {
                sum += position.get(p) - i;
                char temp=a[i];
                a[i]=a[position.get(p)];
                a[position.get(p)]=temp;

                count=1;
                p++; // i had close ka index ab waha swap karke open kar diya toh p++
            }
        }

        System.out.println(sum);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        counts(s);
    }
}
