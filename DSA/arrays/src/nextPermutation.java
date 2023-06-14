import java.util.Scanner;

public class nextPermutation {
    static String s;

    public static void swap(char[]a,int i,int j)
    {
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void reverse(char[]a,int start,int end)
    {
        while(start<end)
        {
            swap(a,start,end);
            start++;
            end--;
        }
    }
    public static char[] permutation(String s)
    {
        char a[]=s.toCharArray();
        int n=s.length();
        int i=n-2;
        while(i>=0 && a[i]>=a[i+1])
        {
            i--;
        }

        if(i<0)
        {
            System.out.println("Permutation not possible");
            return a;
        }

        int j=n-1;
        while(j>=0 && a[j]<=a[i])
        {
            j--;
        }
        swap(a,i,j);

        reverse(a,i+1,n-1);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        nextPermutation np= new nextPermutation();
        System.out.println(np.permutation(s));


    }
}
