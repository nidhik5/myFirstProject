import java.util.ArrayList;
import java.util.Scanner;

public class IPaddress {

    public static void address(String s, int i, int j,int level, String temp, ArrayList<String> result)
    {
        int k=0;
        if(i==j+1 && level==5)
            result.add(temp.substring(1));

        for( k=i; k<i+3 && k<=j ; k++) {
            String a = s.substring(i, k + 1);

            if ((s.charAt(i) == '0' && a.length() > 1) || Integer.valueOf(a) > 255)
                return;

            address(s,k+1,j,level+1,temp+"."+a,result);
        }

        System.out.println(level);


    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        ArrayList<String> result=new ArrayList<>();
        address(s,0,s.length()-1,1,"",result);

        for(String s1: result)
            System.out.println(s1);
    }
}
