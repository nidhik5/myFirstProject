import java.util.Scanner;

public class ReverseGroup {
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
    static int count;
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
            count++;
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

    public static Node reversal(Node head,int k)
    {
        Node currNode=head;
        Node previousNode=null;
        Node nextNode=null;
        Node resultHead=null;
        //System.out.println(count);
        if(count<k)
            return head;

        for(int i=1;i<=k;i++) {
            nextNode = currNode.next;
            currNode.next = previousNode;
            previousNode = currNode;
            currNode = nextNode;
        }
        count-=k;
        resultHead = previousNode; // Set previousNode as the new head of the reversed group
        head.next = reversal(nextNode, k);
        //print(resultHead);
        return resultHead;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ReverseGroup rg=new ReverseGroup();
        System.out.println("Enter k");
        int k=sc.nextInt();
        System.out.println("Enter head");
        int h=sc.nextInt();
        Node head=new Node(h);
        rg.create(head);
        Node h2=rg.reversal(head,k);
        rg.print(h2);
    }

}
