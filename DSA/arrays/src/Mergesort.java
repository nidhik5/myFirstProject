import java.util.*;
public class Mergesort {
    static void merge(int low,int mid, int high,int []a,int []b)
    {
        int i=low;
        int j=mid+1;
        int h=low;
        while(i<=mid && j<=high) {
            if (a[i] < a[j]) {
                b[h] = a[i];
                h++;
                i++;
            } else {
                b[h] = a[j];
                h++;
                j++;
            }
        }
            if(i>mid)
            {
                while(j<=high)
                {
                    b[h]=a[j];
                    h++;
                    j++;
                }
            }
            else
            {
                while(i<=mid)
                {
                    b[h]=a[i];
                    h++;
                    i++;
                }
            }

        for(int k=low;k<high+1;k++)
        {
            a[k]=b[k];
        }
    }
    static void mergesort(int low,int high,int []a,int []b)
    {
        int mid;
        if (low<high)
        {
            mid=(low+high)/2;
            mergesort(low,mid,a,b);
            mergesort(mid+1, high,a,b);
            merge(low,mid,high,a,b);
        }
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int [n];
        int b[]=new int [n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        mergesort(0,n-1,a,b);

        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}