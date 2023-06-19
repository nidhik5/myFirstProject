import java.util.Scanner;

public class stocks1 {
    static int n;
    static int prices[];
    public stocks1(int n1)
    {
        n=n1;
        prices=new int [n];
    }

    public static void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            prices[i]=sc.nextInt();
        }
    }

    public static void profit()
    {
        int buy=prices[0];
        int max_profit=0;

        for(int i=0;i<n;i++)
        {
            if(prices[i]<buy)
                buy=prices[i];

            if(prices[i]-buy>max_profit)
                max_profit=prices[i]-buy;
        }

        System.out.println("Buy at"+" "+buy);
        System.out.println("Maximum profit"+" "+max_profit);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        n=sc.nextInt();
        stocks1 s1=new stocks1(n);
        read();
        profit();

    }

}
