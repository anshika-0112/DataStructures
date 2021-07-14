package Heap;

import java.util.Scanner;

public class MyHeap {
    int size;
    int capacity;
    int []arr;
    MyHeap(int capacity)
    {
        this.capacity=capacity;
        size=0;
        arr=new int[capacity];
    }
    //calculating left child of a node
    static int left(int i)
    {
        return (2*i+1);
    }
    //calculating right child of a node
    static int right(int i)
    {
        return (2*i+2);
    }
    //calculating parent child of a node
    static int parent(int i)
    {
        return (i-1)/2;
    }

    //Methods
    void levelTraversing()
    {
        for (int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    void swap(int i1,int i2)
    {
        int e=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=e;
    }

    //MinHeap Operations
    //1. Building MinHeap
    void Minheap()
    {
        for(int i= (size-2)/2;i>=0;i--)
        {
            minHeapify(i);
        }
    }

    //2.Inserting an element in Heap
    void MinInsert(int x)
    {
        if (size == capacity) {
            return;
        }
        size++;
        arr[size - 1] = x;
        for (int i = size - 1; i != 0 && arr[MyHeap.parent(i)] > arr[i]; )
        {
            swap(i,MyHeap.parent(i));
            i = MyHeap.parent(i);
        }
    }

    //3. Decrease Key Operation
    void minDecrease(int i,int x)
    {
        arr[i]=x;
        while(i!=0 && arr[MyHeap.parent(i)]>arr[i])
        {
            swap(MyHeap.parent(i),i);
            i=MyHeap.parent(i);
        }
    }

    //4. Heapify min heap
    void minHeapify(int i)
    {
        int lt=MyHeap.left(i);
        int rt=MyHeap.right(i);
        int smallest=i;
        if(lt<size && arr[lt]<arr[i])
            smallest=lt;
        if(rt<size && arr[rt]<arr[smallest])
            smallest=rt;
        if(smallest!=i)
        {
            swap(i,smallest);
            minHeapify(smallest);
        }
    }

    //5. Deletion
    void minDelete(int i){
        minDecrease(i,Integer.MIN_VALUE);
        extractMin();
    }

    //6.Extract minimum
    int extractMin()
    {
        if(size==0)
        {
            return Integer.MAX_VALUE;
        }
        if(size==1)
        {
            size--;
            return arr[0];
        }
        swap(0,size-1);
        size-=1;
        minHeapify(0);
        return arr[size];
    }

    //MaxHeap Operations
    //1. Insert in MaxHeap
    void MaxInsert(int x)
    {
        if (size == capacity) {
            return;
        }
        size++;
        arr[size - 1] = x;
        for (int i = size - 1; i != 0 && arr[MyHeap.parent(i)] < arr[i]; )
        {
            swap(i,MyHeap.parent(i));
            i = MyHeap.parent(i);
        }
    }

    //2.Heapify
    void maxHeapify(int i)
    {
        int lt=MyHeap.left(i);
        int rt=MyHeap.right(i);
        int largest=i;
        if(lt<size && arr[lt]>arr[i])
            largest=lt;
        if(rt<size && arr[rt]>arr[largest])
            largest=rt;
        if(largest!=i)
        {
            swap(i,largest);
            maxHeapify(largest);
        }
    }

    //3.Decrease Key
    void maxDecrease(int i,int x)
    {
        arr[i]=x;
        while(i!=0 && arr[MyHeap.parent(i)]<arr[i])
        {
            swap(MyHeap.parent(i),i);
            i=MyHeap.parent(i);
        }
    }

    //4.Extract Max
    int extractMax()
    {
        if(size==0)
        {
            return -1;
        }
        if(size==1)
        {
            size--;
            return arr[0];
        }
        swap(0,size-1);
        size-=1;
        maxHeapify(0);
        return arr[size];
    }

    //5. Deletion
    void maxDelete(int i){
        maxDecrease(i,Integer.MAX_VALUE);
        extractMax();
    }

    //6. Build MaxHeap
    void Maxheap()
    {
        for(int i= (size-2)/2;i>=0;i--)
        {
            maxHeapify(i);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter capacity of the Heap");
        int c = sc.nextInt();

        MyHeap heap = new MyHeap(c); //Creating heap of capacity c
        System.out.println("How many elements uh want to insert in a Heap?");
        int s = sc.nextInt();
        heap.size = s;       //Initializing the size of heap
        System.out.println("Enter elements of heap");
        for (int i = 0; i < s; i++) {
            heap.arr[i] = sc.nextInt();
        }
        System.out.println("Which heap uh want to create?");
        int type = sc.nextInt();
        if (type == 0)
            heap.Minheap();
        else
            heap.Maxheap();
        System.out.println("Heap is ready");
        heap.levelTraversing();
        if (type == 0) {
            while (true) {
                System.out.println("Enter your choice");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter element to insert in a Heap");
                        heap.MinInsert(sc.nextInt());
                        System.out.println(heap.size);
                        heap.levelTraversing();
                        break;
                    case 2:
                        System.out.println("Enter index to heapify");
                        int i = sc.nextInt();
                        heap.minHeapify(i);
                        heap.levelTraversing();
                        break;
                    case 3:
                        int min = heap.extractMin();
                        System.out.println("Minimum Value is " + min);
                        heap.levelTraversing();
                        break;
                    case 4:
                        System.out.println("Enter the index whose value uh want to decrease");
                        i = sc.nextInt();
                        System.out.println("Enter the key");
                        int d = sc.nextInt();
                        heap.minDecrease(i, d);
                        heap.levelTraversing();
                    case 5:
                        System.out.println("Enter index of value uh want to delete");
                        heap.minDelete(sc.nextInt());
                        heap.levelTraversing();
                        break;
                    case 7:
                        return;
                }
            }
        }
        else{
            while (true) {
                System.out.println("Enter your choice");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter element to insert in a Heap");
                        heap.MaxInsert(sc.nextInt());
                        System.out.println(heap.size);
                        heap.levelTraversing();
                        break;
                    case 2:
                        System.out.println("Enter index to heapify");
                        int i = sc.nextInt();
                        heap.maxHeapify(i);
                        heap.levelTraversing();
                        break;
                    case 3:
                        int min = heap.extractMax();
                        System.out.println("Minimum Value is " + min);
                        heap.levelTraversing();
                        break;
                    case 4:
                        System.out.println("Enter the index whose value uh want to decrease");
                        i = sc.nextInt();
                        System.out.println("Enter the key");
                        int d = sc.nextInt();
                        heap.maxDecrease(i, d);
                        heap.levelTraversing();
                    case 5:
                        System.out.println("Enter index of value uh want to delete");
                        heap.maxDelete(sc.nextInt());
                        heap.levelTraversing();
                        break;
                    case 6:
                        Sort.heapsort(heap.arr, heap.size);
                        break;
                    case 10:
                        return;
                }
            }
        }
    }
}
