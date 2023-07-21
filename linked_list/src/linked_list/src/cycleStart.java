public class cycleStart {
    public static void start(Node head)
    {
        Node slow=head;
        Node fast=head;
        Node entry=head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                while(slow!=entry)
                {
                    slow=slow.next;
                    entry=entry.next;
                }
                return slow;
            }
        }
        return null;
    }
}
