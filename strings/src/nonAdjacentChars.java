import java.util.Scanner;

public class nonAdjacentChars {

    public static String adjacent(String s)
    {
        int max=Integer.MIN_VALUE;
        int n=s.length();
        char maxi='\0';
        int [] count=new int[26];
        for(int i=0;i<n;i++)
        {
             count[(int) s.charAt(i)-(int)'a']++;
             if(count[(int) s.charAt(i)-(int)'a']>max) {
                 max = count[(int) s.charAt(i) - (int)'a'];
                 maxi=s.charAt(i);
             }
        }
        System.out.println(max+" "+maxi);
        if(max>(n+1)/2)
            return "not possible";

        String res="";
        for(int i=0; i<n;i++)
        {
            res+=' ';
        }
        System.out.println(res);
        int index=0;

            while(max>0) {
                res = res.substring(0, index) + maxi + res.substring(index + 1);
                max=max-1;
                index += 2;
            }

        count[(int)maxi-(int)'a']=0;
        for(int j=0;j<26;j++) {
            while (count[j] >0) {
                index = index >=n ? 1 : index;
                res = res.substring(0, index) + ((char)((int)'a' + j)) + res.substring(index+1);
                count[j]--;
                index+=2;
            }
        }

        return res;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        System.out.println(adjacent(s));
    }
}
