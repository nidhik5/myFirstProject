import java.util.Scanner;

public class wordSearch {

    public static int search(int i,int j,char[][]a,int n,int index,String s)
    {
        int found=0;
        if(i>=0 && j>=0 && i<n && j<n && s.charAt(index)==a[i][j])
        {
            char temp=a[i][j];
            a[i][j]=0;
            index++;
            if(index==s.length())
                found=1;
            else {
                found+=search(i+1,j,a,n,index,s);
                found+=search(i-1,j,a,n,index,s);
                found+=search(i,j+1,a,n,index,s);
                found+=search(i,j-1,a,n,index,s);
            }
            a[i][j]=temp;
        }
        return found;
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();

        System.out.println("Enter grid size");
        int n=sc.nextInt();
        char a[][]=new char [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.next().charAt(0);
            }
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans+=(search(i,j,a,n,0,str));
            }
        }
        System.out.println(ans);
    }
}
