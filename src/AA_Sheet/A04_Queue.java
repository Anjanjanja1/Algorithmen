package AA_Sheet;

class A04_Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public A04_Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    // Enqueue: O(1)
    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = value;
        nItems++;
    }

    // Dequeue: O(1)
    public int dequeue() {
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    // Search: O(n)
    public boolean search(int value) {
        for (int i = 0; i < nItems; i++) {
            if (queueArray[(front + i) % maxSize] == value) {
                return true;
            }
        }
        return false;
    }
}
