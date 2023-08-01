import java.util.Stack;

public class QueueStack1 {
    static Stack<Integer> ip=new Stack<>();
    static Stack<Integer> op=new Stack<>();
    public static void insert(int x)
    {
        ip.push(x);
        System.out.println(ip);
    }
    public static void pop()
    {
        if(op.empty())
        {
            while(!ip.empty())
            {
                op.push(ip.peek());
                ip.pop();
            }
        }
        System.out.println(op.peek());
        op.pop();
        System.out.println(ip+" "+op);
    }
    public static void size()
    {
        System.out.println(op.size()+ip.size());
    }

    public static void main(String args[] )
    {

        insert(1);
        insert(2);
        insert(3);
        pop();
        pop();
        size();
    }
}
