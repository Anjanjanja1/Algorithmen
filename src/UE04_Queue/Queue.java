package UE04_Queue;

public class Queue {
    // *** Membervariablen ***
    private Node front;
    private Node rear;


    // *** Konstruktor ***
    public Queue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }

    // *** Getter- und Setter-Methoden ***
    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    //Enqueue = add
    public void enqueue(Person newPerson) {
        //Set node to fill the person in the queue
        Node newNode = new Node(newPerson);

        //If the queue is empty
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    //Dequeue = remove
    public Person dequeue() {
        if (front == null) {
            return null;
        }
        //Save so it will be accessible later
        Person person = front.getPerson();
        //If only one element is in the queue:
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.getNext();
        }
        return person;
    }
}
