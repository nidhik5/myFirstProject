import java.util.LinkedList;
import java.util.Queue;
// stack using queue
public class QueueStack {
    static Queue<Integer> q=new LinkedList<>();

    public static void insert(int x)
    {
        q.add(x);
        for(int i=0;i<q.size()-1;i++)
        {
            q.add(q.remove());
        }
        System.out.println(q);
    }
    public static void peek()
    {
        System.out.println(q.peek());
    }

    public static void pop()
    {
        int temp=q.remove();
        System.out.println(temp);
        System.out.println(q);
    }

    public static void main(String args[] )
    {

        insert(1);
        insert(2);
        insert(3);
        System.out.println(q);
        pop();
        System.out.println(q);
        pop();
        System.out.println(q);
        peek();
    }

}
