import java.util.*;
public class sort012 {
    static int n ;
   static int a[];
    public sort012(int n1){
        n=n1;
        a=new int [n];
    }

    public static void input (int n)
    {
        System.out.println("Enter elements");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }

    public static void sort(int low, int high){
        int l=low;
        int mid=low;
        int hi=high;

        while(mid<=hi)
        {
            switch(a[mid])
            {

                case 0 :
                {
                    int temp=a[l];
                    a[l]=a[mid];
                    a[mid]=temp;
                    l++;
                    mid++;
                    break;

                }

                case 1 :
                {
                    mid++;
                    break;
                }

                case 2 :
                {
                    int temp=a[hi];
                    a[hi]=a[mid];
                    a[mid]=temp;
                    mid++;
                    hi--;
                    break;
                }
            }
        }
    }

    public static void display(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        n=sc.nextInt();
        sort012 sortn = new sort012(n);
        sort012.input(n);
        sort012.sort(0,n-1);
        sort012.display(n);
    }

}
