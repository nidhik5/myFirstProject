import java.util.HashSet;
import java.util.Scanner;

public class Ints {
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
        System.out.println();
    }

    public static Node find(Node h1,Node h2) {
        Node d1=h1;
        Node d2=h2;
        if(h1==null || h2==null)
            return null;

        while (d1!=d2)
        {
            if(d1==null) {
                d1 = h2;
                //print(d1);
            }
            else
                d1=d1.next;

            if(d2==null) {
                d2 = h1;
                //print(d2);
            }
            else
                d2=d2.next;
        }
        return d1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Ints ints=new Ints();
        System.out.println("enter head of 1");
        int head1=sc.nextInt();
        Node h1=new Node(head1);
        ints.create(h1);
        System.out.println("enter head of 2");
        int head2=sc.nextInt();
        Node h2=new Node(head2);
        ints.create(h2);
        print(h1);
        print(h2);
        Node ans=find(h1,h2);
        print(ans);
    }
}
