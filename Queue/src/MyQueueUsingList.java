import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
 public class MyQueueUsingList {
     Node front, rear;

     MyQueueUsingList() {
         front = null;
         rear = null;
     }

     void enqueue() {
         Scanner sc = new Scanner(System.in);
         int data = sc.nextInt();
         Node newnode = new Node(data);
         if (rear == null) {
             front=rear=newnode;
         } else {
             rear.next=newnode;
             rear=newnode;
         }
     }

     void traverse() {
         if(front==null )
         {
             System.out.println("Empty");
         }
         else{
         for (Node current = front; current != rear; current = current.next) {
             System.out.print(current.data+" ");
         }
         System.out.println(rear.data);
     }}

     void dequeue() {
         if (front == null ) {
             System.out.println("Empty");
         } else {
             Node temp = front.next;
             front = temp;
         }
         if(front==null)
         {
             rear=null;
         }
     }
     public static void main(String[] args) {
         MyQueueUsingList ql = new MyQueueUsingList();
         while (true) {
             System.out.println("Enter your choice");
             Scanner sc = new Scanner(System.in);
             int ch = sc.nextInt();
             switch (ch) {
                 case 1:
                     ql.enqueue();
                     break;
                 case 2:
                     ql.traverse();
                     break;
                 case 3:
                     ql.dequeue();
                     break;
                 case 4:
                     return;
             }
         }
     }
 }