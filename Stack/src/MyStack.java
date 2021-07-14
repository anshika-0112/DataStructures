import java.util.Scanner;

public class MyStack {
    int arr[];
    int top;
    int cap;
    MyStack(int c)
    {
        cap=c;
        arr=new int[cap];
        top=-1;
    }

    void push()
    {
        System.out.println("Enter element to push");
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        if(top<cap)
        {
            top+=1;
            arr[top]=d;
        }
        else{
            System.out.println("Cannot be inserted");
        }
    }

    void pop()
    {
        int popped=arr[top];
        top--;
        System.out.println(popped+" is popped out of the stack");
    }


    void traverse()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        for(int i=top;i>=0;i--) {
            System.out.print(arr[i] + " ");
        }
    }

    void isEmpty()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack is not empty");
        }
    }

    void peek()
    {
    if(top==-1)
    {
        System.out.println("Stack is empty");
    }
        else{
        System.out.println("Peek element is "+arr[top]);
    }}

    void size()
    {
        System.out.println("Size of stack is "+(top+1));
    }

    public static void main(String[] args) {
        MyStack s=new MyStack(10);
        while(true){
            System.out.println("Enter your choice");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    s.push();
                    break;
                case 2:s.traverse();
                    break;
                case 3:s.pop();
                    break;
                case 4:s.isEmpty();
                    break;
                case 5:s.peek();
                    break;
                case 6:s.size();
                    break;
                case 7:return;
            }}
    }
}
