public class Node1 {
    private int data;
    private Node1 next;
    Node1(int data)
    {
        this.data=data;
        next=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node1 getNext() {
        return next;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }
}
