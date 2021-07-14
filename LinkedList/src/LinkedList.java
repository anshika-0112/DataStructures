import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d)
    {
        d=data;
        next=null;
    }
}
public class LinkedList{
    static Node head;
    LinkedList()
    {
        head=null;
    }
    void insert()
    {
        System.out.println("Enter element to insert");
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        Node newnode=new Node(d);
        newnode.data=d;
        newnode.next=null;
        if(head==null){
            head=newnode;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;
        }
    }

    void delete() {
        if (head.next == null) {
            head = null;
        } else {
            Node previous = null;
            Node current = head;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
        }
        System.out.println("Deleted");
    }
    void traverse()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else{
        for(Node current=head;current!=null;current=current.next)
        {
            System.out.print(current.data+" ");
        }
    }
        System.out.println();}

        Node updateLinkedList(Node head)
        {
            int c=0;
            Node temp=head;
            Node prev=null;
            Node curr=temp;
            while(curr!=null)
            {
                c+=1;
                curr=temp.next;
                temp.next=prev;
                prev=temp;
                temp=curr;
            }
            System.out.println("c"+c);

            int p=(int)c/2;
            System.out.println("c "+c);
            System.out.println(p);
            Node reverseCurrent=prev;
            Node current=head;
            while(p!=c)
            {
                current.data=current.data+reverseCurrent.data;
                current=current.next;
                reverseCurrent=reverseCurrent.next;
            }
            return head;
        }


    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        while(true){
            System.out.println("Enter your choice");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
        switch (ch){
            case 1:
                l.insert();
                break;
            case 2:l.traverse();
                break;
            case 3:l.delete();
                break;
            case 4:Node res=l.updateLinkedList(head);
            while(res!=null)
            {
                System.out.println(res.data);
                res=res.next;
            }
                break;
        }}
    }
}