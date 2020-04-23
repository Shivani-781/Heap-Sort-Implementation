package main;

import maxheap.MaxHeap;

public class Main {
    public static void main(String[] args) {
        MaxHeap ob = new MaxHeap(6);
        ob.insert(13);
        ob.insert(8);
        ob.insert(50);
        ob.insert(10);
        ob.insert(9);
        ob.insert(5);
        ob.display();
    }
}
