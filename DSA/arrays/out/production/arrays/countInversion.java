import java.util.Scanner;

public class countInversion {
    static int n,count;
    static int []a;
    static int []b;
    public countInversion(int n1)
    {
        n=n1;
        a=new int [n];
    }
    public static void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    public static int merge(int low, int mid, int high)
    {
        int swap=0;
        int i=low;
        int k=low;
        int j=mid+1;
        int []c =new int [n];
        while(i<=mid && j<=high)
        {
            if(a[i]<a[j])
            {
                c[k]=a[i];
                k++;
                i++;
            }
            else
            {
                swap+=(mid+1)-(low+i);
                c[k]=a[j];
                k++;
                j++;
            }
        }
        if(i>mid)
        {
            while(j<high)
            {
                c[k++]=a[j++];
            }
        }
        else
        {
            while(i<mid)
            {
                c[k++]=a[i++];
            }
        }
        System.out.println(swap);
        return swap;
    }

    public static int mergesort(int low , int high,int []a, int []b)
    {
        int mid;
        count=0;
        if(low<high)
        {
            mid=(low+high)/2;
            count+=mergesort(low,mid,a,b);
            count+=mergesort(mid+1,high,a,b);
            count+=merge(low,mid,high);
        }
        //System.out.println(count);
        return count;

    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        n=sc.nextInt();
        countInversion ci= new countInversion(n);
        read();
        System.out.println(mergesort(0,n-1,a,b));
    }
}
