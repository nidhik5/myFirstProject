import java.util.Scanner;

public class rotate {
    static class Node
    {
        int data;
        Node next;

        Node (int data){
            this.data=data;
            this.next=null;
        }

    }
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

    public static Node kRotate(Node head, int k)
    {
        if(head == null||head.next == null||k == 0) return head;
        Node temp=head;
        int length=1;
        while(temp.next!=null)
        {
            length++;
            temp=temp.next;
        }
        temp.next=head;
        k=length%k;
        int end=length-k;
        while(end--!=0)
        {
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        rotate rt= new rotate();
        System.out.println("Enter k");
        int k=sc.nextInt();
        System.out.println("Enter head");
        int h=sc.nextInt();
        Node head=new Node(h);
        rt.create(head);
        Node ans=rt.kRotate(head,k);
        print(ans);
    }
}
