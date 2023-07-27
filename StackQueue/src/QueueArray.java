public class QueueArray {
    static int front=-1;
    static int back=-1;
    public static void display(int a[])
    {
        for(int i=front;i<=back;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void push(int a[],int data)
    {
        if(front==-1 && back==-1)
        {
            front++;
            back++;
            a[front]=data;
        }
        else
        {
            back++;
            a[back]=data;
        }
        display(a);
    }
    public static void pop(int a[])
    {
        int temp;
        if(front==back)
        {
            temp=a[front];
            front--;
            back--;
        }
        else
        {
            temp=a[front];
            front++;
        }
        System.out.println(temp);
        display(a);
    }
    public static void size(int a[])
    {
        System.out.println(back-front+1);
    }
    public static void main(String args[] )
    {
        int a[]=new int[10];
        push(a,1);
        push(a,2);
        push(a,3);
        size(a);
        pop(a);
        pop(a);
        size(a);
    }
}
