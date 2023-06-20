import java.util.Scanner;

public class stocks2 {
        static int n;
        static int prices[];
        public stocks2(int n1)
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

        public static void profit_made()
        {
            int profit=0;

            for(int i=1;i<n;i++)
            {
                if(prices[i]>prices[i-1])
                    profit+=(prices[i]-prices[i-1]);
            }

           System.out.println(profit);
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter array size");
            n=sc.nextInt();
            stocks1 s1=new stocks1(n);
            read();
            profit_made();

        }
}
