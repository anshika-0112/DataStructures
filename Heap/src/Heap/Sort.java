package Heap;

public class Sort {
    static void heapsort(int[] h, int n)
    {
        MyHeap obj=new MyHeap(10);
        obj.arr=h;
        obj.size=n;
        for(int i=0;i<n;i++)
        {
            obj.swap(0,obj.size-1);
            obj.size-=1;
            obj.maxHeapify(0);
        }
        obj.size=n;
        obj.levelTraversing();
        obj.arr=h;
    }
}
