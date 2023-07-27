import java.util.Scanner;

public class StackArray {
    static int top=-1;
    public static void display(int a[])
    {
        for(int i=0;i<=top;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void push(int a[],int data)
    {
        top++;
        a[top]=data;
        display(a);
    }
    public static int pop(int a[])
    {
        int temp=a[top];
        top--;
        display(a);
        return temp;
    }
    public static void peek(int a[])
    {
        System.out.println(a[top]);
    }
    public static void size(int a[])
    {
        System.out.println(top+1);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        push(a,1);
        push(a,2);
        push(a,3);
        peek(a);
        size(a);
        pop(a);
        pop(a);
        peek(a);
        size(a);
    }
}
