import java.util.Scanner;

public class deleteN {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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

    public static void print(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static Node back(Node head, int n) {

        Node fast=head;
        Node slow=head;

        for(int i=1;i<=n;i++)
            fast=fast.next;

        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;
        return head;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        deleteN dn = new deleteN();
        head = new Node(1);
        System.out.println("Enter n");
        int n=sc.nextInt();
        create(head);
        print(head);
        Node ans=back(head,n);
        print(ans);
    }
}
