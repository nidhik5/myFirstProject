public class flatten {
    static class Node
    {
        int data;
        Node next;

        Node (int data){
            this.data=data;
            this.next=null;
        }

    }
    static Node head;
    static Node mergeLists(Node a, Node b)
    {
        Node temp=new Node(0);
        Node res=temp;
        while(a!=null || b!=null)
        {
            if(a.data>b.data)
            {
                temp.next=b;
                temp=temp.next;
                b=b.next;
            }
            else
            {
                temp.next=a;
                temp=temp.next;
                a=a.next;
            }
        }
        if (a==null)
            temp.next=b;
        else
            temp.next=a;

        return res.next; // cuz first is 0
    }

    static Node flatten (Node head)
    {
        if(head==null || head.next==null)
            return head;

        head.next=flatten(head.next);
        head=mergeLists(head,head.next);
        return head;
    }
}
