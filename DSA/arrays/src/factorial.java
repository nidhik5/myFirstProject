import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        BigInteger res= BigInteger.valueOf(1);
        for(int i=1;i<=n;i++)
            res=res.multiply(BigInteger.valueOf(i));

        System.out.println("Result is"+" "+res);
    }
}
