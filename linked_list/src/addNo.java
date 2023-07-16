import java.util.Scanner;

public class addNo {
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

    public static int reverse(int n)
    {
        String s=Integer.toString(n);
        String str=s.substring(1)+s.substring(0,1);
        int k=Integer.valueOf(str);
        return k;
    }
    public static Node add (Node h1, Node h2)
    {
        int sum=0;
        Node i=h1;
        Node j=h2;
        int carry=0;
        if(h2.data<h1.data) // i small, j big
        {
            i=h2;
            j=h1;
        }
        sum=(h1.data+h2.data)%10;
        Node h3=new Node(sum);
        Node currNode=h3;

        while(j!=null)
        {
            sum=(i.data+j.data+carry)%10;
            //sum=(sum>=10)?(sum%10):sum;
            Node newNode= new Node(sum);
            currNode.next=newNode;
            currNode=currNode.next;
            carry=(i.data+j.data+carry>=10)?((i.data+j.data+carry)/10):0;
            System.out.println(sum+" "+carry);
            j=j.next;
            i=i.next;
        }
        while(i.next!=null && j==null)
        {
            carry=(i.data+carry)>=10?(i.data+carry)/10:0;
            Node newNode= new Node((i.data+carry)%10);
            currNode.next=newNode;
            currNode=currNode.next;
            i=i.next;
            if(i.next==null)
            {
                int z=reverse(i.data+carry);
                Node finalNode= new Node(z);
                currNode.next=finalNode;
            }
        }

        return h3.next;
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        addNo an=new addNo();
        System.out.println("enter head of 1");
        int head1=sc.nextInt();
        Node h1=new Node(head1);
        an.create(h1);
        System.out.println("enter head of 2");
        int head2=sc.nextInt();
        Node h2=new Node(head2);
        an.create(h2);
        an.print(h1);
        an.print(h2);
        Node ans= an.add(h1,h2);
        print(ans);
    }

}