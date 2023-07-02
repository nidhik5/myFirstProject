import java.util.Scanner;

public class addPalindrome {

    public static int isPalindrome(String s)
    {
        int start=0;
        int res=0;
        int n=s.length();
        int end=n-1;
        while(start<end){
            if(s.charAt(start)==s.charAt(end))
            {
                start++;
                end--;
            }
            else {
                res++;
                start=0;
                end=n-res-1;
            }
        }
        return res;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}
