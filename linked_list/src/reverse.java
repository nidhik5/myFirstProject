import java.util.Scanner;

public class reverse {
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
    public static void create(Node head) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element");
        int data = sc.nextInt();
        while (data != -1) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node currNode = head;
                while (currNode.next != null) {
                    currNode = currNode.next;
                }
                currNode.next = newNode;
                System.out.println("Enter next");
                data = sc.nextInt();
            }
        }
    }

        public static void print(Node head)
        {
            Node currNode=head;
            while(currNode!=null)
            {
                System.out.print(currNode.data+" ");
                currNode=currNode.next;
            }
        }

        public static Node reversal (Node head)
        {
            Node prev= null;
            Node currNode= head;
            Node next1;

            while(currNode!=null)
            {
                next1=currNode.next;
                currNode.next=prev;
                prev=currNode;
                currNode=next1;
            }
            head=prev;
            return head;
        }

    public static void main(String args[])
    {
        reverse r=new reverse();
        Node head=new Node(1);
        r.create(head);
        r.print(head);
        Node head1=r.reversal(head);
        System.out.println();
        r.print(head1);
    }

}
