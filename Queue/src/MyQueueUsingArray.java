import java.util.LinkedList;
import java.util.Scanner;

public class MyQueueUsingArray {
    int arr[];
    int cap;
    int front;
    int rear;

    MyQueueUsingArray(int c) {
        cap = c;
        arr = new int[c];
        front = rear = -1;
    }

    void enqueue() {
        System.out.println("Enter element to insert");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (rear == -1) {
            front = 0;
        }
        if(rear<cap)
        {
        rear++;
        arr[rear] = data;
    }
        else{
            System.out.println("Queue is full");
        }
    }

    void dequeue() {
        for (int i = front; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear -= 1;
    }

    void traverse() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        MyQueueUsingArray qa = new MyQueueUsingArray(10);
        while (true) {
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    qa.enqueue();
                    break;
                case 2:
                    qa.traverse();
                    break;
                case 3:
                    qa.dequeue();
                    break;
                case 4:
                    return;
            }
        }
    }
}