import java.util.Scanner;

class Node
{
    int data;
    Node1 next;
    Node(int d)
    {
        data=d;
        Node1 next=null;
    }
}
public class MyStackUsingList {
    Node1 top;
    MyStackUsingList()
    {
        top=null;
    }

    void push()
    {
        System.out.println("Enter element to push");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node1 newnode=new Node1(data);
        newnode.data=data;
        newnode.next=null;
        if(top==null)
        {
            top=newnode;
        }
        else{
            newnode.next=top;
            top=newnode;
        }
    }

    void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
        }
        else {
            Node1 temp = top;
            top = temp.next;
            System.out.println(temp.data+" is popped");
        }
    }

    void traverse()
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
        for(Node1 current = top; current!=null; current=current.next)
        {
            System.out.print(current.data+" ");
        }
    }}

    public static void main(String[] args) {
        MyStackUsingList sl=new MyStackUsingList();
        while(true)
        {
            System.out.println("Enter your choice");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    sl.push();
                    break;
                case 2:
                    sl.traverse();
                    break;
                case 3:
                    sl.pop();
                    break;
                case 4:
                    return;
            }
        }
    }
}
