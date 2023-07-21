import java.util.Scanner;

public class isPalindrome {
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

    public static Node reverse(Node head)
    {
        Node currNode=head;
        Node prevNode=null;
        Node nextNode;
        while(currNode!=null)
        {
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=currNode.next;
        }
        return head;
    }

    public static boolean palindrome(Node head)
    {
        Node slow=head;
        Node fast=slow.next.next;
        while(fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        Node s=reverse(slow.next);
        Node currNode=head;
        while(currNode.next!=slow && s!=null)
        {
            if(currNode.data!=s.data)
                return false;
            currNode=currNode.next;
            s=s.next;
        }
        return true;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        isPalindrome ip=new isPalindrome();
        System.out.println("Enter head");
        int h=sc.nextInt();
        Node head=new Node(h);
        ip.create(head);
        System.out.println(palindrome(head));
    }

}
