import java.util.Scanner;

public class deleteNNode {
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

    public static Node delete(Node head,int n)
    {
        Node currNode=head;
        Node temp= currNode.next.next;
        while(currNode.next.data!=n)
        {
            currNode=currNode.next;
            temp=temp.next;
        }
        currNode.next=temp;
        return head;
    }

    public static void print(Node head)
    {
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }



    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        deleteNNode dn=new deleteNNode();
        System.out.println("enter head of 1");
        int head1=sc.nextInt();
        Node h1=new Node(head1);
        dn.create(h1);
        dn.print(h1);
        System.out.println("Enter value to delete");
        int n=sc.nextInt();
        Node ans=delete(h1,n);
        print(ans);
    }

}