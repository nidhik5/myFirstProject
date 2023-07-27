import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sum3 {

    public static ArrayList<ArrayList<Integer>> findsum(int a[],int n)
    {
        int low=0,high=0,sum=0;
        ArrayList<ArrayList<Integer>> res= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n-2;i++)
        {
            if (i == 0 || (i>0 && a[i] == a[i-1]))
            continue;

                low = i + 1;
                high = n - 1;
                sum = 0 - a[i];

                while (low < high) {
                    if (a[low] + a[high] == sum) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(a[i]);
                        temp.add(a[low]);
                        temp.add(a[high]);

                        //System.out.println(temp);
                        res.add(temp);

                        while (low < high && a[low] == a[low + 1])
                            low++;
                        while (low < high && a[high] == a[high - 1])
                            high--;
                        low++;
                        high--;
                    }
                    else if (a[low] + a[high] < sum)
                        low++;
                    else
                        high--;
                }
            }

        //System.out.println(res);
        return res;
    }

    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int a[]= new int [n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        ArrayList<ArrayList<Integer>> ans=findsum(a,n);
        System.out.println(ans);
        for(int i=0;i<ans.size();i++)
        {
            for(int j=0;j<ans.get(i).size();j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
