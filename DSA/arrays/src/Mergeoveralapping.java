
import java.util.*;
import java.util.Arrays;
public class Mergeoveralapping {
    static int start,end,n;
    class Interval{
        int start,end;
        Interval(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public static void overlap(Interval[] arr){
        Arrays.sort(arr,new Comparator<Interval>() {
            public int compare(Interval i1,Interval i2){
                return i1.start-i2.start;
            }});
        int index=0;
        for(int i=1;i<n;i++){
            if(arr[index].end>arr[i].start){
                //merge
                arr[index].end=Math.max(arr[index].end, arr[i].end);
            }
            else{
                index++;
                arr[index]=arr[i];
            }
        }
        for(int i=0;i<=index;i++){
            System.out.println(arr[i].start+" "+arr[i].end);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter intervals size");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter intervals");
        // Mergeoveralapping m=new Mergeoveralapping();
        Interval[] arr = new Mergeoveralapping.Interval[n];
        for(int i=0;i<n;i++){
            start=sc.nextInt();
            end=sc.nextInt();
            arr[i] =new Mergeoveralapping().new Interval(start, end);
        }
        overlap(arr);


    }
}
